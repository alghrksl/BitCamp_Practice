package ApiControl;

import java.util.Scanner;

public class EmptyName {

	public static void main(String[] args) {

		String name;
		boolean check = false;
		Scanner s = new Scanner(System.in);

		System.out.println("이름 입력 > ");
		name = s.nextLine();

		if (!(name.isEmpty())) { // 빈값이 아니면

			for (int i = 0; i < name.length(); i++) {
				char n = name.charAt(i); // 문자열의 문자순서를 하나씩 증가시켜 비교
				if (n == ' ') { // 공백이 있으면 true로 변경
					check = true;
				} else if (Character.isDigit(n)) { // 숫자가 있으면 true로 변경
					check = true;
				}
			}

			if (check == true) { // 공백혹은 숫자로 인해 true로 변경 되었다면 출력
				System.out.println("공백이 있거나 혹은 숫자가 입력 되었습니다.");
			} else {
				System.out.println("잘 입력했다");
			}

		} else {
			System.out.println("입력하지 않았습니다.");
		}

	}

}
