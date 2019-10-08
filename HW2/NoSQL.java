package HW2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class NoSQL extends Database {

	public void display() {
		System.out.println("In NoSQL database");
	}
	
	public void store() {
		try{File file = new File("NoSQLdatabase.txt");
		FileWriter fw;
		fw = new FileWriter(file);
		fw.write("Some document input");
		fw.close();}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
