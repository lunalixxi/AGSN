package AGSN.diagram.custom.assessmentER;

import static AGSN.diagram.common.constant.SystemDefinitionConst.COLLECTION_INITIAL_CAPACITY;

import java.util.List;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.osgi.util.NLS;

import AGSN.AssessStatus;
import AGSN.BasicNode;
import AGSN.Evidence;
import AGSN.diagram.common.exception.DcaseRuntimeException;
import AGSN.diagram.common.model.AttributeType;
import AGSN.diagram.common.model.NodeInfo;
import AGSN.diagram.common.model.NodeType;
import AGSN.diagram.common.util.LinkManager;
import AGSN.diagram.common.util.MessageTypeImpl;
import AGSN.diagram.common.util.Messages;
import AGSN.diagram.custom.common.util.MessageWriter;

public class Assessment {

	/**
	 * ER algorithm
	 */
	private ERAlgorithm er;
	/**
	 * the link manager.
	 */
	private LinkManager linkManager;

	/**
	 * the scores.
	 */
	private Map<String, double[]> changeList;

	/**
	 * calculated element
	 */
	private Map<String, Boolean> calculated;

	/**
	 * Create an instance of Assessment and initializes it.
	 * 
	 * @param linkManager
	 *            the link manager.
	 */
	public Assessment(LinkManager linkManager) {
		this.linkManager = linkManager;
		changeList = new HashMap<String, double[]>(COLLECTION_INITIAL_CAPACITY);
		calculated = new HashMap<String, Boolean>(COLLECTION_INITIAL_CAPACITY);
	}

	public void calculateScore() {
		changeList.clear();

		Set<String> nodeIdList = linkManager.getAllNodes();

		for (String id : nodeIdList) {
			NodeInfo node = linkManager.getNodeInfo(id);
			NodeType type = node.getNodeType();
			if (type == NodeType.GOAL || type == NodeType.STRATEGY || type == NodeType.EVIDENCE) {
				changeList.put(id, null);
				calculated.put(id, false);
			}
		}

		nodeIdList = changeList.keySet();
		for (String id : nodeIdList) {
			NodeInfo nodeinfo = linkManager.getNodeInfo(id);
			BasicNode node = linkManager.getBasicNode(id);
			if (node.getAssessstatus() != AssessStatus.ACCEPTED && node.getAssessstatus() != AssessStatus.WEAK) {
				MessageWriter.showErrorMessageBox(NLS.bind(Messages.ERAssessment,
						nodeinfo.getNodeType().toString() + ": " + node.getName(), node.getAssessstatus()));
			} else {
				if (nodeinfo.getNodeType() != NodeType.EVIDENCE) {
					calculate(id);
					calculated.put(id, true);
				}
			}
		}

	}

	/**
	 * Calculates the score of a node.
	 * 
	 * @param id
	 *            the ID of the node.
	 */
	private double[] calculate(String id) {

		// the score of the node is not calculated yet.
		if (!calculated.get(id)) {

			// calculates the score of descendant goals, strategies and
			// evidences.
			List<String> targetList = linkManager.getTarget(id);
			double[] result = null;
			if (targetList != null) {
				List<String> target = getChildrenNodeForER(targetList);
				NodeInfo nodeinfo = null;
				if (target.size() == 1) {
					String nodeId = target.get(0);
					nodeinfo = linkManager.getNodeInfo(nodeId);
					BasicNode node = linkManager.getBasicNode(nodeId);
					if (nodeinfo.getNodeType() == NodeType.EVIDENCE) {
						// show error message if the evidence is not accepted or
						// weak
						if (node.getAssessstatus() == AssessStatus.ACCEPTED
								|| node.getAssessstatus() == AssessStatus.WEAK
								/*|| node.getAssessstatus() == AssessStatus.INCORRECT*/) {
							result = getDBofEvidence(node);
							changeList.put(nodeId, result);
							changeList.put(id, result);
							calculated.put(nodeId, true);
						} else {
							calculated.put(nodeId, true);
							changeList.put(nodeId, null);
							changeList.put(id, null);
							return null;
						}
					} else {
						if (node.getAssessstatus() == AssessStatus.ACCEPTED
								|| node.getAssessstatus() == AssessStatus.WEAK) {
							result = calculate(nodeId);
							if (result == null) {
								changeList.put(id, null);
							} else {
								changeList.put(id, result);
							}
							calculated.put(id, true);
						} else {
							calculated.put(nodeId, true);
							changeList.put(nodeId, null);
							changeList.put(id, null);
							return null;
						}
					}
				} else {
					Map<String, double[]> degreeMap = new HashMap<String, double[]>();
					for (String childId : target) {
						nodeinfo = linkManager.getNodeInfo(childId);
						BasicNode node = linkManager.getBasicNode(childId);
						if (nodeinfo.getNodeType() == NodeType.EVIDENCE) {
							// show error message if the evidence is not
							// accepted or weak

							if (node.getAssessstatus() == AssessStatus.ACCEPTED
									|| node.getAssessstatus() == AssessStatus.WEAK) {
								double[] db = getDBofEvidence(node);
								changeList.put(childId, db);
								degreeMap.put(childId, db);
								calculated.put(childId, true);
							} else {
								calculated.put(childId, true);
								return null;
							}
						} else if (nodeinfo.getNodeType() == NodeType.GOAL
								|| nodeinfo.getNodeType() == NodeType.STRATEGY) {
							if (node.getAssessstatus() == AssessStatus.ACCEPTED
									|| node.getAssessstatus() == AssessStatus.WEAK) {
								// child is accepted or weak
								double[] db = calculate(childId);
								if (db == null) {
									changeList.put(childId, null);
									return null;
								} else {
									changeList.put(childId, db);
									degreeMap.put(childId, db);
								}
							} else {
								// one of childnodes is not accepted or weak
								changeList.put(childId, null);
								calculated.put(childId, true);
								changeList.put(id, null);
								calculated.put(id, true);
								return null;
							}
						}
					}

					result = aggregateChildrenNodes(degreeMap);
					changeList.put(id, result);
				}

			}
			return result;
		}

		return changeList.get(id);
	}

	/**
	 * Only the score of goals, strategies and evidences are calculated. This
	 * return the suset of the target list.
	 * 
	 * @param targetList
	 *            all the children of a parent node
	 * @return the child of a parent which the type is goal, strategty or
	 *         evidence.
	 */
	private List<String> getChildrenNodeForER(List<String> targetList) {
		List<String> target = new ArrayList<String>();
		NodeInfo nodeinfo = null;
		for (String id : targetList) {
			nodeinfo = linkManager.getNodeInfo(id);
			if (nodeinfo.getNodeType() == NodeType.STRATEGY || nodeinfo.getNodeType() == NodeType.EVIDENCE
					|| nodeinfo.getNodeType() == NodeType.GOAL) {
				target.add(id);
			}
		}
		return target;
	}

	/**
	 * aggregate the degrees of belief of the subnodes using ER algorithm
	 * 
	 * @param subNodesList
	 *            contains all sub nodes of a parent
	 * @return aggregation result
	 */
	private double[] aggregateChildrenNodes(Map<String, double[]> subNodesList) {
		// list of subgoals
		List<BasicNode> nodesList = new ArrayList<BasicNode>();
		for (String goalid : subNodesList.keySet()) {
			BasicNode node = linkManager.getBasicNode(goalid);
			nodesList.add(node);
		}

		// get degree of belief of all sub goals
		boolean emptyWeight = false;
		int size = nodesList.size();
		er = new ERAlgorithm(size);
		double[][] bg = new double[size][5];
		double[] weights = new double[size];
		double[] belief = new double[5];
		for (int i = 0; i < size; i++) {
			BasicNode node = nodesList.get(i);
			belief = subNodesList.get(node.getId());
			for (int j = 0; j < 5; j++) {
				bg[i][j] = belief[j];
			}
			if (node.getWeight() == 0) {
				emptyWeight = true;
			} else {
				weights[i] = node.getWeight();
			}
		}

		// default weight are equal.
		if (emptyWeight) {
			for (int i = 0; i < size; i++) {
				weights[i] = 1.0 / size;
			}
		}

		er.setBeliefDegree(bg);
		er.setWeightArray(weights);
		er.calculating();

		double[] result = er.getDegreeOfBelief();
		for (int i = 0; i < 5; i++) {
			System.out.println(result[i]);
		}
		return result;
	}

	/**
	 * return the degree of belief of an evidence.
	 * 
	 * @param node
	 *            An evidence node
	 * @return the degree of belief
	 */
	private double[] getDBofEvidence(BasicNode node) {
		double[] result = new double[5];
		if (node != null) {
			int level = node.getQualityLevel().getValue();
			result[level] = node.getConfidencePercentage() / 100.00;
		}
		return result;
	}

	public Map<String, double[]> getChangeList() {
		return changeList;
	}

}
