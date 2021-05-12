package sample0512;

public class Sample04 {
	public static void main(String[] args) {
//		Oracle oracle = new Oracle();
//		oracle.open();
//		oracle.select_oracle();
//		MySql mysql = new MySql();
//		mysql.open();
//		mysql.select_mysql();
		openDb(new Oracle());
		openDb(new Mysql());
	}
	static void openDb(Database db) {
		db.open();
	}
}