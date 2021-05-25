package Sample01;


public class Score {

	public static void main(String[] args) {

		String name = "김훈";
		int math_score = 60;
		int language_score = 50;
		int english_score = 40;
		String[][] student = new String[2][9] ;
		
		Student stu = new Student(math_score, language_score, english_score);
		stu.Score();
		for(int i = 0; i<student.length; i++) {
			student[i][0] = "국어";
		}
	}

}
