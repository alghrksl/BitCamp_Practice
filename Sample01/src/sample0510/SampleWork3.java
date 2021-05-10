package sample0510;

public class SampleWork3 {

	int seqNo; // 일련번호 필드
	String writer; // 작성자 필드
	String writtenDate; // 작성일자 필드
	String title; // 제목필드
	String content; // 내용필드

	SampleWork3(int seqNo, String writer, String writtenDate,

			String title, String content) {// 생성자

		this.seqNo = seqNo;
		this.writer = writer;
		this.writtenDate = writtenDate;
		this.title = title;
		this.content = content;

	}

}