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
		
		int i = 0;
		boolean j = ( a == c ) || ( i == 0 );
		boolean k = ( a == c ) && ( i == 0 );
		System.out.println(j);
		System.out.println(k);
		
		
		int l = i+= 2;// i = i + 1 
		System.out.println(l);
		
	}

}
