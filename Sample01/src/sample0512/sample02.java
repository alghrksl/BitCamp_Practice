package sample0512;

class BBSITEM {
	static int seqNo;

	public BBSITEM() {
		seqNo++;
		System.out.println(seqNo);
	}
}

public class sample02 {
	public static void main(String[] args) {
		BBSITEM bbs = new BBSITEM();
		BBSITEM bbs2 = new BBSITEM();
	}
}
