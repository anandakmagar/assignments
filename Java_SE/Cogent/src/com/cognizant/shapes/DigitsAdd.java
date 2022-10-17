/**
 * 
 */
package com.cognizant.shapes;

/**
 * @author Ananda Magar
 *
 * @date Sep 21, 2022
 */
public class DigitsAdd {
	public static void main(String[] args) {
		int num = 342;
		int sum = 0;
		while(num != 0) {
			int remainder = num%10;
			sum = sum + remainder;
			num = num/10;
		}
		System.out.println(sum);
	}
}
