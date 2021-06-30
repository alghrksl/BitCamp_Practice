package Arr;

public class Score {

	public static void main(String[] args) {

		Student[] stu = new Student[10];

		stu[0] = new Student("A", 20, 30, 10);
		stu[1] = new Student("B", 40, 50, 60);
		stu[2] = new Student("C", 10, 20, 30);
		stu[3] = new Student("D", 30, 20, 10);
		stu[4] = new Student("E", 20, 15, 10);
		stu[5] = new Student("F", 10, 10, 10);
		stu[6] = new Student("G", 100, 100, 100);
		stu[7] = new Student("H", 20, 10, 15);
		stu[8] = new Student("I", 50, 60, 70);
		stu[9] = new Student("J", 30, 50, 40);

		for (int i = 0; i < stu.length; i++) {
			stu[i].student();
		}
		for (int i = 0; i < stu.length; i++) {
			System.out.println(stu[i].getName());

		}
	}

}
