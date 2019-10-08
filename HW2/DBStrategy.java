package HW2;


public class DBStrategy {

	public Database database;

	public void setStoreStrategy(int i) {
		if(i == 1) {
			database = new Relational();
			database.display();
			database.store();
		}
		else if(i == 2) {
			database = new NoSQL();
			database.display();
			database.store();
		}
		else if(i == 3) {
			database = new Graph();
			database.display();
			database.store();
		}
	}

}
