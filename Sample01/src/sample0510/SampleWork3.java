package sample0510;

class Subclass {

	static int seqNo = 1; // �Ϸù�ȣ �ʵ�
	String writer; // �ۼ��� �ʵ�
	String writtenDate; // �ۼ����� �ʵ�
	String title; // �����ʵ�
	String content; // �����ʵ�

	Subclass() {// ������

	}

	Subclass(String writer, String writtenDate, String title, String content) {// ������

		;

		this.writer = writer;
		this.writtenDate = writtenDate;
		this.title = title;
		this.content = content;

	}

	Subclass(int seqNo, String writer, String writtenDate, String title, String content) {// ������

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

		Subclass sub1 = new Subclass("��", "��", "��", "��");
		printQuick(sub1);
		Subclass sub2 = new Subclass("��", "��", "��", "��");
		printQuick(sub2);
		Subclass sub3 = new Subclass("��", "��", "��", "��");
		printQuick(sub3);

	}

	static void printQuick(Subclass sub) {
		System.out.print(" ���� : " + sub.seqNo());
		System.out.print(" ���� : " + sub.writer);
		System.out.print(" ���ⵥ���� : " + sub.writtenDate);
		System.out.print(" ���� : " + sub.title);
		System.out.print(" ���� : " + sub.content);
		System.out.println("");
	}

}
