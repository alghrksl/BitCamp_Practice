package Abstract01;

import java.util.Scanner;

public class CalulatorMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Calulator Cal = new CalulatorController();

		System.out.println(Cal.add(1, 2));
		System.out.println(Cal.divide(1, 2));
		System.out.println(Cal.substract(1, 2));
		System.out.println(Cal.multiply(1, 2));
	}

}
