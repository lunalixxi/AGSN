/**
 * Copyright (C) Yutaka Matsuno 2010-2012 All rights reserved.
 */
package AGSN.diagram.custom.distribution;

/**
 * The class that model of compute nodes.
 */
public class ComputeNodesMember {
    
    /**
     * The counts.
     */
    private int[] counts;
    
    /**
     * The constructor.
     * 
     * @param count the count
     */
    public ComputeNodesMember(int count) {
        this.counts = new int[count];
    }
    
    /**
     * Increments the count.
     * 
     * @param index the index
     */
    public void incCount(int index) {
        counts[index]++;
    }
    
    /**
     * Returns the count.
     * 
     * @param index the index
     * @return the count
     */
    public int getCount(int index) {
        return counts[index];
    }
    
}
