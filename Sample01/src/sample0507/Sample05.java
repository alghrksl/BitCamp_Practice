package sample0507;

public class Sample05 {

	public static void main(String[] args) {

//		for (int i = 0; i <= 10; i++) {
//
//			System.out.println(i);
//
//		}
//		for (int j = 1; j <= 9; j++) {
//
//			System.out.println(j + "´Ü °ö¼À");
//			System.out.println();
//
//			for (int k = 1; k <= 9; k++) {
//
//				System.out.println(k + " * " + j + " = " + k * j);
//
//			}
//
//			System.out.println();
//		}
		
		for (int j = 1; j <= 5; j++) {

			
			System.out.println(j + "´Ü °ö¼À");
			System.out.println();

			for (int k = 1; k <= j; k++) {

				System.out.println(k + " * " + j + " = " + k * j);

			}

			System.out.println();
		}

	}

}
