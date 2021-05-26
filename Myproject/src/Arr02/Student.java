package Arr02;

//  1.Student 클래스를 정의해봅시다. 
class Student {

//  1.1 학생이름, 국어점수, 영어점수, 수학점수를 저장하는 변수를 정의 합니다.
//	1.2 변수는 캡슐화를 합니다.
	private String name;
	private int math_score;
	private int language_score;
	private int english_score;

//	1.2 getter/setter 메소드를 정의합니다.
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMath_score() {
		return math_score;
	}

	public void setMath_score(int math_score) {
		this.math_score = math_score;
	}

	public int getLanguage_score() {
		return language_score;
	}

	public void setLanguage_score(int language_score) {
		this.language_score = language_score;
	}

	public int getEnglish_score() {
		return english_score;
	}

	public void setEnglish_score(int english_score) {
		this.english_score = english_score;
	}

	// 1.3 총점과 평균을 구해 결과를 반환하는 메소드를 정의합니다.
	public void Student(int math_score, int language_score, int english_score) {
		int score = math_score + language_score + english_score;
		int average = score / 3;
		System.out.println("총점 >" + score);
		System.out.println("평균 >" + average);

	}

}
