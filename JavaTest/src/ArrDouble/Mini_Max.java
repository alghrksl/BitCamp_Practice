// 1번-----------------------------------------------------------

package ArrDouble;

import java.util.Scanner;

public class Mini_Max {

//	위의 두 매소드는 인자로 전달되는 배열의 길이에 상관없이 동작하도록 정의.
	public static void miniValue(int[] arr) {

		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

	public static void maxValue(int[] arr) {

		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (min < arr[i]) {
				min = arr[i];
			}

		}
		System.out.println(min);
	}

//	두 매소드 실행을 확인인하기 위한 main 메소드 정의.
	public static void main(String[] args) {

//		배열의 길이는 임의로 결정
		int[] arr = new int[5];

//		int형 배열에 채워질 정수는 프로그램 사용자로부터 입력 받고, 
		for (int i = 0; i < arr.length; i++) {
			System.out.println("숫자 입력 >");
			Scanner scanner = new Scanner(System.in);
			int a = scanner.nextInt();
			arr[i] = a;
		}

		Mini_Max Mm = new Mini_Max();
		Mm.miniValue(arr);
		Mm.maxValue(arr);
	}
}
