package HW2;

import java.util.*;

public class Client {

	public static void main(String[] args) {

		System.out.println("Please choose which database you would like to access:");
		System.out.println("1. Relational");
		System.out.println("2. NoSQL");
		System.out.println("3. Graph");

		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();

		DBStrategy	controller = new DBStrategy();
		
		controller.setStoreStrategy(input);
		scanner.close();

	}
}


