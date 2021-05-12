package sample0511;

class BBSItem {	
	static int n=1;
	int seqNo; 			//일련번호 필드
	String writer; 			//작성자 필드
	String writtenDate;			//작성일자 필드
	String title;			//제목필드
	String content;			//내용필드
	BBSItem(String writer, String writtenDate, 
			String title, String content){//생성자
		this.seqNo=n;
		this.writer=writer;
		this.writtenDate=writtenDate;
		this.title=title;
		this.content=content;
		n++;
		System.out.println(seqNo);
	}
}
public class TestBBS {
	public static void main(String[] args) {
		BBSItem b1 = new BBSItem("","","","");
		BBSItem b2 = new BBSItem("","","","");
		BBSItem b3 = new BBSItem("","","","");

	}

}
