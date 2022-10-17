/**
 * 
 */
package practice;

import java.util.Scanner;

/**
 * @author Ananda Magar
 *
 * @date Oct 3, 2022
 */
public class Practice02 {
	public static void isPrime(int num) {
		int result = 1;
		if(num <= 1) {
			result = 0;
		}
		else {
			for(int i = 2; i <= num/2; i++) {
				if(num%i == 0) {
					result = 0;
					break;
				}
				else {
					result = 1;
					break;
				}
			}
		}
		
		if(result == 1) {
			System.out.println("Prime");
		}
		if(result == 0) {
			System.out.println("Non-prime");
		}
	}
	public static void main(String[] args) {
		isPrime(9);
	}
}
