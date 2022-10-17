/**
 * 
 */
package practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author Ananda Magar
 *
 * @date Oct 3, 2022
 */
public class Practice05 implements Serializable {
	String name;
	int id;
	
	Practice05(String name, int id){
		this.name = name;
		this.id = id;
	}
	public static void main(String[] args) {
		Practice05 p = new Practice05("Ananda Magar", 23);
		File file = new File("C:/Users/anand/Downloads/d.txt");
		try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(p);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
