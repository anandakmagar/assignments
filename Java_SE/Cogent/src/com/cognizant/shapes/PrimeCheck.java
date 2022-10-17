/**
 * 
 */
package com.cognizant.shapes;

/**
 * @author Ananda Magar
 *
 * @date Sep 21, 2022
 */
public class PrimeCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 3;
		boolean isPrime = true;
		if(num <= 1) {
			isPrime = false;
		}
		else {
			for(int i = 2; i <= num/2; i++) {
				if(num%i == 0) {
					isPrime = false;
				}
				else {
					isPrime = true;
				}
			}
		}
			
		if(isPrime == false) {
			System.out.println("It is not a prime");
		}
		if(isPrime == true) {
			System.out.println("It is prime");
		}

	}

}
