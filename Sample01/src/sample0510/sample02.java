package sample0510;

public class sample02 {

	static int add(int x, int y) {
		int z = x + y;
		return z;
	}

	static int add(int x, int y, int a) {
		int z = x + y + a;
		return z;
	}

	public static void main(String[] args) {
		int a = add(1, 2);
		int b = add(1, 2, 3);

		System.out.println(a);
		System.out.println(b);
	}
	
}
