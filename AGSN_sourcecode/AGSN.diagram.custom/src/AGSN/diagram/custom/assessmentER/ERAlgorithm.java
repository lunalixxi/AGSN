package AGSN.diagram.custom.assessmentER;

import java.text.DecimalFormat;

/**
 * This is an implementation of Evidential Reasoning Algorithm.
 */
public class ERAlgorithm {
	
	//Degree of belief
	private double[][] beliefDegree;
	
	//basic probability masses
	private double[][] masses;
	
	//weight of each attributes
	private double[] weightArray;

	//current normalizing factor
	private double factor;
	
	//keep four digit after decimal point
	private DecimalFormat df = new DecimalFormat("#.####");
	
	/**
	 * final degree of belief
	 */
	private double[] degreeOfBelief;
	
	public double[] getDegreeOfBelief() {
		return degreeOfBelief;
	}
	public void setDegreeOfBelief(double[] degreeOfBelief) {
		this.degreeOfBelief = degreeOfBelief;
	}
	/**
	 * m bar, first part of remaining probability mass. 
	 * due to the fact that attribute only plays one part in assessment relative to its weight
	 *//*
	private double[] mbar;
	
	*//**
	 * m tilde, second part of remaining probability mass.
	 * due to the incompleteness in the assessment, when the sum of belief of degrees is smaller than 1.
	 *//*
	private double[] mtilde;
	
	*//**
	 * remaining probability mass
	 *//*
	private double[] m;*/
	/**
	 * ERAlgorithm constructor
	 */
	public ERAlgorithm(int row){
		setBeliefDegree(new double[row+1][5]);
		masses = new double[row][8];
		weightArray = new double[row];
		factor = 0;
		degreeOfBelief = new double[5];
/*		mbar = new double[row];
		mtilde = new double[row];
		m = new double[row];*/
		
		
	}
	public double[][] getBeliefDegree() {
		return beliefDegree;
	}
	public void setBeliefDegree(double[][] beliefDegree) {
		this.beliefDegree = beliefDegree;
	}
	
	public double[] getWeightArray() {
		return weightArray;
	}
	public void setWeightArray(double[] weightArray) {
		this.weightArray = weightArray;
	}
	
	public void calculating(){
		
		//multiply degree of belief by weight
		for(int i = 0; i < beliefDegree.length; i++){
			for (int j = 0; j < 5 ;j++){
				masses[i][j] = weightArray[i] * beliefDegree[i][j];
			}
		}
		
		//calculate remaining probability mass
		for(int i = 0; i< masses.length;i++){
			masses[i][5] = 1 - weightArray[i];
			double sum = 0;
			for(int j = 0; j <5;j++){
				sum += beliefDegree[i][j];
			}
			masses[i][6] = weightArray[i]*(1 - sum);
			masses[i][7] = masses[i][5] + masses[i][6];
		}
		
		double[] combined = new double[5];
		//calculate combined probability masses
		for(int i = 0; i < beliefDegree.length-1; i++){
			//calculate normalizing factor
			factor = 0;
			for(int k = 0; k<5;k++){
				for(int n = 0; n<5;n++){
					if (n!=k){
						factor+=masses[i][k]*masses[i+1][n];
					}
				}
			}
			factor = 1/(1- factor);
			factor = Double.parseDouble(df.format(factor));
			combined = aggregating(masses[i],masses[i+1],factor);
			for(int j = 0; j< 8;j++){
				masses[i+1][j] = combined[j];
			}
		}
		
		//calculate the combined degrees of belief
		int length = masses.length-1;
		for(int i = 0; i<5;i++ ){
			degreeOfBelief[i] = Double.parseDouble(df.format(masses[length][i]/(1-masses[length][5])));
		}
		//degreeOfBelief[5] = Double.parseDouble(df.format(masses[length][6]/(1-masses[length][5])));
		
	}
	
	private double[] aggregating(double[] v1, double[] v2, double factor){
		double[] combined = new double[8];
		for(int i = 0; i < 5; i++){
			combined[i] = factor*(v1[i]*v2[i]+ v1[i]*v2[7] + v2[i]*v1[7]);
		}
		combined[5] = factor*v1[5]*v2[5];
		combined[6] = factor*(v1[6]*v2[6] + v1[5]*v2[6]+ v2[5]*v1[6]);
		combined[7] = combined[5]+combined[6];
		return combined;
	}
	

}
