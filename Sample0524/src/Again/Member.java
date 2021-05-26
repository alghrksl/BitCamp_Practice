package Again;

import java.util.Scanner;

public class Member {

	void virus(int age) {

		if (age < 15 || age >= 65) {
			System.out.println("대상자 입니다.");
		} else {
			System.out.println("대상자가 아닙니다.");
		}
	}

	void checkup(int age, int year) {
		if (age >= 20) {

			System.out.println("2년마다 건강검진을 받을 수 있습니다.");

			if (year % 2 == 0) {
				System.out.println("짝수년 검사 대상자 입니다.");
			} else {
				System.out.println("홀수년 검사 대상자 입니다.");
			}

			if (age >= 40) {
				System.out.println("암 검사 대상자 입니다.");
			}

		} else {
			System.out.println("대상자가 아닙니다.");
		}

	}

	public static void main(String[] args) {

		int year;

		Member member = new Member();
		Scanner scanner = new Scanner(System.in);

		System.out.print("태어난 연도 입력 > ");
		year = scanner.nextInt();

		int age = 2021 - year + 1;

		System.out.println("----------- 독감 -------------");

		member.virus(age);

		System.out.println("----------- 검진 -------------");

		member.checkup(age, year);

		System.out.println("-----------------------------");

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
