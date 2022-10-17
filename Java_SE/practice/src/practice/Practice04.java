/**
 * 
 */
package practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Ananda Magar
 *
 * @date Oct 3, 2022
 */
public class Practice04 {
	public static void main(String[] args) {
		String str = "Good Morning!";
		
		File file = new File("C:/Users/anand/Downloads/d.txt");
		try {
			FileOutputStream fos = new FileOutputStream(file);
			byte[] bytes = str.getBytes();
			fos.write(bytes);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
