package sample0512;

class Student {
	String name;
	int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

class MiddleStudent extends Student {
	String gender;

	public MiddleStudent(String name, int age, String gender) {
		super(name, age);
		this.gender = gender;
		System.out.println(this.name + this.age + this.gender);

	}
}

public class Sample06 {

	public static void main(String[] args) {

		MiddleStudent Middle = new MiddleStudent("��ö��", 50, "��");
		MiddleStudent Middle2 = new MiddleStudent("��ö��", 50, "��");
		MiddleStudent Middle3 = new MiddleStudent("��ö��", 50, "��");
		MiddleStudent Middle4 = new MiddleStudent("��ö��", 50, "��");
//		MiddleCall(Middle);
//		MiddleCall(Middle2);
//		MiddleCall(Middle3);
//		MiddleCall(Middle4);
	}

	static void MiddleCall (MiddleStudent Middle) {
//		System.out.print(Middle.name);
//		System.out.print(Middle.age);
//		System.out.print(Middle.gender);
		
	}

}
