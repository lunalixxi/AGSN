package AGSN.diagram.custom.assessmentER;

public class ERTest {

	public static void main(String[] args) {
		ERAlgorithm alg = new ERAlgorithm(3);
		double[][] bg = new double[3][5];
		bg[0][3] = 0.6;
		//bg[0][3] = 0.6;
		bg[1][4] = 0.8;
		bg[2][1] = 0.7;
		//bg[2][4] = 0.5;
		alg.setBeliefDegree(bg);
		double[] w = new double[3];
		w[0] = 0.5;
		w[1] = 0.2;
		w[2] = 0.3;
		alg.setWeightArray(w);
		alg.calculating();
		double[] result = alg.getDegreeOfBelief();
		for (int i = 0; i < 5; i++) {
			System.out.println(result[i]);
		}
	}
}
