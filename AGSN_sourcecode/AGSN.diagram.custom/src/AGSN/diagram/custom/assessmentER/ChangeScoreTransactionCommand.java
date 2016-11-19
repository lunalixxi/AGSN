/*
 * Copyright (C) Yutaka Matsuno 2010-2012 All rights reserved.
 */
package AGSN.diagram.custom.assessmentER;

import java.util.Map;
import java.util.Set;


import AGSN.BasicNode;
import AGSN.Evidence;
import AGSN.Goal;
import AGSN.Strategy;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;

/**
 * A transaction command to change the scores.
 */
public class ChangeScoreTransactionCommand extends AbstractTransactionalCommand {

    /**
     * the map of new scores.
     */
    private Map<BasicNode, double[]> changeList;

    /**
     * Creates a command and initializes it.
     * 
     * @param domain the editing domain.
     * @param label the command label.
     * @param changeList the map of new scores.
     */
    public ChangeScoreTransactionCommand(TransactionalEditingDomain domain,
            String label, Map<BasicNode, double[]> changeList) {
        super(domain, label, null);
        this.changeList = changeList;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
            IAdaptable info) throws ExecutionException {

        Set<BasicNode> nodeList = changeList.keySet();

        for (BasicNode node : nodeList) {
            double[] score = changeList.get(node);
            if (node instanceof Goal) {
                ((Goal) node).setBeliefDegree(score);
            } else if (node instanceof Strategy){
            	((Strategy) node).setBeliefDegree(score);
            } else if (node instanceof Evidence){
            	((Evidence) node).setBeliefDegree(score);
            }
        }
        return CommandResult.newOKCommandResult();
    }

}
