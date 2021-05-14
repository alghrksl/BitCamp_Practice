package com.test5;
abstract class Database {
	public void open() { System.out.println("Database open");}
	abstract void select();
}
class Oracle extends Database {
	public void select() { System.out.println("Oracle open"); }
}
class MySql extends Database {
	public void select() { System.out.println("MySql open"); }
}
public class Sample06 {
	public static void main(String[] args) {
		Database db = new Oracle();
		db.open();
		db.select();
	}
}
