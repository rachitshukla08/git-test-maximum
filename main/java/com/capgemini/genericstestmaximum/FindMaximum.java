package com.capgemini.genericstestmaximum;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class FindMaximum <T extends Comparable<T>>
{
	T x, y, z;
	T max;
	
	public FindMaximum(T x, T y, T z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public T maximum() {
		return this.findMaximum(x, y, z);
	}
	/**
	 * @param x
	 * @param y
	 * @param z
	 * @return 
	 * @return maximum
	 */
	public T findMaximum(T x,T y,T z) {
		max = x;
		if(y.compareTo(max)>0)
			max = y;
		if(z.compareTo(max)>0)
			max = z;
		return max;
	}
}
