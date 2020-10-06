package com.capgemini.genericstestmaximum;

import java.util.Arrays;

public class FindMaximum <T extends Comparable<T>>
{
	T max;
	/**
	 * Default Constructor
	 */
	public FindMaximum() {
		
	}
	/**
	 * @return this.maximum
	 */
	public T maximum() {
		return this.max;
	}
	/**
	 * @param x
	 * @param y
	 * @param z
	 * @return 
	 * @return maximum
	 */
	public T findMaximum(T ... args) {
		Arrays.sort(args);
		this.max = args[args.length-1];
		return max;
	}
}
