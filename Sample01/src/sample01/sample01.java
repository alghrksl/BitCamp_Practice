package sample01;

public class sample01 {

	public static void main(String[] args) {

		int a = 0;
		int b = a++;
		System.out.println(b);
		System.out.println(a);
		int c = 0;
		int d = ++c;
		System.err.println(d);
		System.out.println(c);
		int e = a++ + c++;
		System.out.println(e);
		int f = a + c;
		System.out.println(f);
		
		boolean g =  ( a == c ) ? true : false ;
		System.out.println(g);
		boolean h = ( b == d ) ? true : false;
		System.out.println(h);
		
		
	}

}
