package Arr;

class Student {

	private String name;
	private int math_score = 60;
	private int language_score = 60;
	private int english_score = 60;
	int score;
	int average;

	public Student(int math_score, int language_score, int english_score) {
		this.english_score = english_score;
		this.math_score = math_score;
		this.language_score = language_score;
	}

	public void Score() {
		score = this.english_score + this.language_score + this.math_score;
		average = score / 3;
		System.out.println(average);
	}

	public void name() {

	}

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

}
