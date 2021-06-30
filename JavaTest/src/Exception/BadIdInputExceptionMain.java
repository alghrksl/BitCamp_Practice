package Exception;

import java.util.Iterator;
import java.util.Scanner;

public class BadIdInputExceptionMain {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("아이디를 입력하세요 >> ");
		String id = s.nextLine();
		try {
			for (int i = 0; i < id.length(); i++) {
				char ch = id.charAt(i);
				if (!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9'))) {
					throw new BadIdInputException("잘못 입력");

				} // 알파벳 탐색

			}
			System.out.println(id);
		} catch (BadIdInputException e) {
			System.out.println(e.getMessage());
		}

	}

}
