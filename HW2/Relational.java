package HW2;

import java.io.*;

public class Relational extends Database {

	public void display() {
		System.out.println("In relational database");
	}
	public void store() {
		try{File file = new File("Relationaldatabase.txt");
		FileWriter fw;
		fw = new FileWriter(file);
		fw.write("Some table input");
		fw.close();}
		catch(IOException e) {
			e.printStackTrace();
		}

	} 
}

