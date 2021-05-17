package com.test;
import java.util.Scanner;
class Calculator3 {
	static int add(int a, int b) {
		return a + b;
	}
	static int subtract(int a, int b) {
		return a - b;
	}
	static int multiply(int a, int b) {
		return a * b;
	}
	static int divide(int a, int b) {
		return a / b;
	}
}
public class Quiz01 {	
	static int getInputValue() {
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();		
		return Integer.parseInt(inputString);
	}
	public static void main(String[] args) throws InterruptedException {
		// ####################
		// # 1. 덧셈
		// # 2. 뺄셈
		// # 3. 곱셈
		// # 4. 나눗셈
		// # 5. 종료
		// ####################
		// # 메뉴를 선택해주세요. : 
		//
		// 1을 선택한경우
		// 첫번째숫자를 입력해주세요. : 5
		// 두번째숫자를 입력해주세요. : 5
		// 결과는 10입니다.
		// 단. 종료를 누를때까지 계속 반복적으로 처리하도록 구현하시오.
		// 사칙연산은 메소드로 구현하시오. 15:20, 15:30 ~ 16:00
		int num1, num2, result;
		for(;;) {
			System.out.println("####################");
			System.out.println("# 1. 덧셈");
			System.out.println("# 2. 뺄셈");
			System.out.println("# 3. 곱셈");
			System.out.println("# 4. 나눗셈");
			System.out.println("# 5. 종료");
			System.out.println("####################");
			System.out.print("# 메뉴를 선택해주세요. : ");
			int selNum = getInputValue();
			switch(selNum) {
			case 1:
				System.out.print("첫번째 숫자를 입력해주세요. : ");
				num1 = getInputValue();
				System.out.print("두번째 숫자를 입력해주세요. : ");
				num2 = getInputValue();
				result = Calculator3.add(num1, num2);
				System.out.println("결과는 " + result + "입니다.");
				Thread.sleep(1000);
				break;
			case 2:
				System.out.print("첫번째 숫자를 입력해주세요. : ");
				num1 = getInputValue();
				System.out.print("두번째 숫자를 입력해주세요. : ");
				num2 = getInputValue();
				result = Calculator3.subtract(num1, num2);
				System.out.println("결과는 " + result + "입니다.");
				Thread.sleep(1000);
				break;
			case 3:
				System.out.print("첫번째 숫자를 입력해주세요. : ");
				num1 = getInputValue();
				System.out.print("두번째 숫자를 입력해주세요. : ");
				num2 = getInputValue();
				result = Calculator3.multiply(num1, num2);
				System.out.println("결과는 " + result + "입니다.");
				Thread.sleep(1000);
				break;
			case 4:
				System.out.print("첫번째 숫자를 입력해주세요. : ");
				num1 = getInputValue();
				System.out.print("두번째 숫자를 입력해주세요. : ");
				num2 = getInputValue();
				result = Calculator3.divide(num1, num2);
				System.out.println("결과는 " + result + "입니다.");
				Thread.sleep(1000);
				break;
			case 5:	
				System.out.println("종료");
				System.exit(0);
				break;				
			}
		}
	}

}
