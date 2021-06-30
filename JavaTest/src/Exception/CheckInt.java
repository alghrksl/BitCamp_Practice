package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckInt extends Throwable {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		try {
			
			System.out.print("태어난 년도를 입력해주세요 : ");

			int num = scanner.nextInt();

			System.out.println(num + "년생");

		} catch (InputMismatchException e) {

			System.out.println("숫자로 입력해주세요");

		}
	}
}