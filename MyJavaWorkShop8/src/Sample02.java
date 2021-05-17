class BBSItem {
	static int seqNo;
	BBSItem(){
		seqNo++;
		System.out.println(seqNo);
	}
}
public class Sample02 {
	public static void main(String[] args) {
		BBSItem b = new BBSItem();
		BBSItem b1 = new BBSItem();
	}
}
