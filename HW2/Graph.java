package HW2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Graph extends Database {

	public void display() {
		System.out.println("In Graph database");
	}

	public void store() {
		try{File file = new File("Graphdatabase.txt");
		FileWriter fw;
		fw = new FileWriter(file);
		fw.write("Some node input");
		fw.close();}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
