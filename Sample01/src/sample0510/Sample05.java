package sample0510;

class student2 {
	String name;

	public student2() {
		this.name = "±æ±æµ¿";
	}
	
	public student2(student2 s) {
	
	}

	void studying() {
		System.out.println(this.name);
	}
}

public class Sample05 {

	static void test(student2 s) {
		s.studying();
	}

	public static void main(String[] args) {
		student2 stu = new student2();
		stu.studying();
		
		
	}

}
