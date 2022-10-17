/**
 * 
 */
package com.cognizant.shapes;

/**
 * @author Ananda Magar
 *
 * @date Sep 21, 2022
 */
public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 5;
		int factorial = 0;
		for(int i = num; i >= 1; i--) {
			factorial = num * i;
		}
		System.out.println(factorial);

	}

}
