class Student {
	String name;
	int age;
	public Student() {
		name = "세종대왕";
		age = 30;
	}
	public Student(String nm, int ag) {
		name = nm;
		age = ag;
	}
	void studying() { System.out.println(name + ", " + age); }
}
public class Sample03 {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.studying();
		Student stu2 = new Student("강감찬", 50);
		stu2.studying();
	}

}




