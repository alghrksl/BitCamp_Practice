package com.test;
public class Sample06 {
	//관련 내용을 출력하는 코드를 작성하시오.
	//12345
	//1234
	//123
	//12
	//1
	public static void main(String[] args) {
		for(int i = 5; i >= 1; --i) {
			for(int j = 1; j <= i; ++j) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}





