package sample0512;

abstract class Student3 {
	void studying() {
		System.out.println("student studying");
	}

	abstract void eating();
}

class Student4 extends Student3 {
	public void eating() {
		System.out.println("student studying4");
	}
}

public class Sample09 {

	public static void main(String[] args) {
		Student4 s = new Student4();

		s.eating();
		s.studying();
	}

}
