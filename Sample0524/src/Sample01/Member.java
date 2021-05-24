package Sample01;

import java.util.Scanner;

public class Member {

	public static void main(String[] args) {
		int firstnum, secondNum;
		String str;

		double height = 170;
		int age = 20;
		String name = "Kimhoon";
		String book = "Java의 정석";
		String yn;
		boolean hasbook = (book == "Java의 정석");

		if (hasbook == true) {
			yn = "Yes";
			System.out.printf("나이 %s 이름 %s 책여부 %s 키 %s", age, name, yn, height);
		} else {
			yn = "No";
			System.out.printf("나이 %s 이름 %s 책여부 %s 키 %s", age, name, yn, height);
		}

//		Scanner scanner = new Scanner(System.in);
//
//		System.out.print("첫째 값 입력  : ");
//		firstnum = scanner.nextInt();
//		System.out.print("둘째 값 입력  : ");
//		secondNum = scanner.nextInt();
//		System.out.print("수식 입력 : ");
//		str = scanner.next();
//
//		Calculater Cal = new Calculater();
//
//		switch (str) {
//		case "+": {
//			Cal.add(firstnum, secondNum);
//			break;
//		}
//		case "-": {
//			Cal.sub(firstnum, secondNum);
//			break;
//		}
//		case "/": {
//			Cal.divide(firstnum, secondNum);
//			break;
//		}
//		case "*": {
//			Cal.mul(firstnum, secondNum);
//			break;
//		}
//		}

	}
}
