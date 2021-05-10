package sample0510;

class Subclass {

	static int seqNo = 1; // 일련번호 필드
	String writer; // 작성자 필드
	String writtenDate; // 작성일자 필드
	String title; // 제목필드
	String content; // 내용필드

	Subclass() {// 생성자

	}

	Subclass(String writer, String writtenDate, String title, String content) {// 생성자

		;

		this.writer = writer;
		this.writtenDate = writtenDate;
		this.title = title;
		this.content = content;

	}

	Subclass(int seqNo, String writer, String writtenDate, String title, String content) {// 생성자

		this.seqNo = seqNo;
		this.writer = writer;
		this.writtenDate = writtenDate;
		this.title = title;
		this.content = content;

	}

	public int seqNo() {

		return seqNo++;

	}

	public String writer() {
		return this.writer;
	}

	public String writtenDate() {
		return this.writtenDate;
	}

	public String title() {
		return this.title;
	}

	public String content() {
		return this.content;
	}

}

public class SampleWork3 {

	public static void main(String[] args) {

		Subclass sub1 = new Subclass("가", "나", "다", "라");
		printQuick(sub1);
		Subclass sub2 = new Subclass("가", "나", "다", "라");
		printQuick(sub2);
		Subclass sub3 = new Subclass("가", "나", "다", "라");
		printQuick(sub3);

	}

	static void printQuick(Subclass sub) {
		System.out.print(" 숫자 : " + sub.seqNo());
		System.out.print(" 쓰기 : " + sub.writer);
		System.out.print(" 쓰기데이터 : " + sub.writtenDate);
		System.out.print(" 제목 : " + sub.title);
		System.out.print(" 주제 : " + sub.content);
		System.out.println("");
	}

}
