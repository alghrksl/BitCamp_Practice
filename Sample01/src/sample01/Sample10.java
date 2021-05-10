package sample01;

public class Sample10 {

	String name;

	int ban;

	int no;

	int kor;

	int eng;

	int math;

	public int getTotal() {

		int total = kor + eng + math;
		return total;
	}

	public float getAverage() {
		float evg = Math.round(getTotal() / 3f * 100)/100f;
		return evg;
	}

	

}
