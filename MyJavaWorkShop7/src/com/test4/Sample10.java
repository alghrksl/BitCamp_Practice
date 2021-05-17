package com.test4;
class Database {
	void open() { System.out.println("Database open"); }
}
class Oracle extends Database {
	void select_oracle() {
		System.out.println("Oracle select");
	}
	void open() { System.out.println("Oracle open"); }
}
class MySql extends Database {
	void select_mysql() {
		System.out.println("MySql select");
	}
	void open() { System.out.println("MySql open"); }
}
class SqlServer extends Database {
	void select_sqlserver() {
		System.out.println("SqlServer select");
	}
	void open() { System.out.println("SqlServer open"); }
}
public class Sample10 {
	static void openDb(Database db) {
		db.open();
	}
//	static void openDb(Oracle db) {
//		db.open();
//	}
//	static void openDb(MySql db) {
//		db.open();
//	}
	
	static Database CreateDatabase(String dbName) {
		Database db = null;
		switch(dbName) {
			case "Oracle":
				db = new Oracle();
				break;
			case "MySql":
				db = new MySql();
				break;
			case "SqlServer":
				db = new SqlServer();
				break;
		}
		return db;
	}
	public static void main(String[] args) {
//		Database db = new Oracle();
//		db.open();
//		Database db2 = new MySql();
//		db2.open();
//		openDb(new Oracle());
//		openDb(new MySql());
		Database db = CreateDatabase("SqlServer");
		db.open();
//		Database db2 = CreateDatabase("MySql");
	}
}







