/**
 * 
 */
package com.cognizant.shapes;

/**
 * @author Ananda Magar
 *
 * @date Sep 21, 2022
 */
public class FIbonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = {0, 1, 1, 2, 3, 5};
		
		boolean fibonacci = true;
		for(int i = 2; i < array.length; i++) {
			if(array[i] == array[i - 1] + array[i - 2]) {
				fibonacci = true;
			}
			if(array[i] != array[i - 1] + array[i - 2]) {
				fibonacci = false;
			}
		}
		if(fibonacci == true) {
			System.out.println("Its a fibonacci series");
		}
		else {
			System.out.println("Its not a fibonacci series");
		}
		
		

	}

}
