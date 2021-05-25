package Sample01;

import java.util.Scanner;

public class Member {

	public static void main(String[] args) {

		int year;

		Scanner scanner = new Scanner(System.in);

		System.out.print("태어난 연도 입력 > ");
		year = scanner.nextInt();

		int age = 2021 - year + 1;

		System.out.println("------------------------------");
		
		if (age < 15) {
			System.out.println("대상자 입니다.");
		} else if (age >= 65) {
			System.out.println("대상자 입니다.");
		} else {
			System.out.println("대상자가 아닙니다.");
		}

		System.out.println("------------------------------");
		
		if (age >= 20) {

			System.out.println("2년마다 건강검진을 받을 수 있습니다.");

			if (year % 2 == 0) {
				System.out.println("짝수년 검사 대상자 입니다.");
			} else if (year % 2 == 1) {
				System.out.println("홀수년 검사 대상자 입니다.");
			}

			if (age >= 40) {
				System.out.println("암 검사 대상자 입니다.");
			}

		} else {
			System.out.println("대상자가 아닙니다.");
		}

		
		
//      ----------------------------------------------------------
//		String str;
//		String yn;
//		String name = "Kimhoon";
//		String book = "Java의 정석";
//
//		int firstnum, secondnum;
//		int age = 20;
//
//		double height = 170;
//
//		boolean hasbook = (book == "Java의 정석");
//
//		if (hasbook == true) {
//			yn = "Yes";
//			System.out.printf("나이 %s 이름 %s 책여부 %s 키 %s", age, name, yn, height);
//		} else {
//			yn = "No";
//			System.out.printf("나이 %s 이름 %s 책여부 %s 키 %s", age, name, yn, height);
//		}

//		Scanner scanner = new Scanner(System.in);
//      
//		System.out.print("첫째 값 입력  : ");
//		firstnum = scanner.nextInt();
//		System.out.print("둘째 값 입력  : ");
//		secondnum = scanner.nextInt();
//		System.out.print("수식 입력 : ");
//		str = scanner.next();
//
//		Calculater Cal = new Calculater();
//
//		switch (str) {
//		case "+": {
//			Cal.add(firstnum, secondnum);
//			break;
//		}
//		case "-": {
//			Cal.sub(firstnum, secondnum);
//			break;
//		}
//		case "/": {
//			Cal.divide(firstnum, secondnum);
//			break;
//		}
//		case "*": {
//			Cal.mul(firstnum, secondnum);
//			break;
//		}
//		}

	}
}
