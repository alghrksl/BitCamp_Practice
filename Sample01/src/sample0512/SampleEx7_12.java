package sample0512;

class Card {

	final int NUMBER;
	final String KIND;

	static int width = 100;
	static int height = 250;

	
	Card(int number, String kind) {
		NUMBER = number;
		KIND = kind;
	}
	
	Card() {
		this(1,"heart");
	}
	
	public String toString() {
		return NUMBER + "" + KIND;
	}

}

public class SampleEx7_12 {

	public static void main(String[] args) {
		Card c = new Card(10,"HAND");
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c);

		System.out.println(c.toString());
		
		
		
	}

}
