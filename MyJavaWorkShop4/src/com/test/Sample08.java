package com.test;
public class Sample08 {
	public static void main(String[] args) {		
//		int a = 10;
//		do {
//			System.out.println(a);
//			a++;
//			System.out.println();
//		} while(a < 20);		
		
		// break
//		for(int i = 1; i <= 10; i++) {
//			if(i == 2) {
//				//break;
//				continue;
//			}
//			System.out.println(i);
//		}
		
//		int j = 0;
//		while(j <= 10) {
//			if(j == 2) {
//				break;
//			}
//			System.out.println(j);
//			j++;
//		}			
		
		// continue
		
		// 2의 배수를 구하시오.(1...10사이 수에서)
		
		for(int i = 1; i <= 10; i++) {
//			if(i % 2 == 0) {
//				System.out.println(i);
//			}
			if(i % 2 != 0) {
				continue;
			}
			System.out.println(i);
		}
	}
}




