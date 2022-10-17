/**
 * 
 */
package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Ananda Magar
 *
 * @date Oct 3, 2022
 */
public class Practice03 {
	public static void main(String[] args) {
		// File reading
		File file = new File("C:/Users/anand/Downloads/d.txt");
		try {
			FileInputStream fis = new FileInputStream(file);
			int i = 0;
			while((i = fis.read())!= -1) {
				System.out.print((char)i);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
