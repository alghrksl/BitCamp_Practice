package com.test;

public class Sample04 {

	public static void main(String[] args) {
		int a = 0;
		a++;
		int b = a;
		System.out.println(b);

		int a1 = 10;
		int b1 = 20;
		if ((a1 > 20) && (b1 < 10)) { // ���� �ϳ���
			System.out.println("a1�� 20 ���� ũ�� b1�� 10���� �۽��ϴ�.");
		} else {
			System.out.println("a1�� 20���� ũ�� b1�� 10���� ���� �ʽ��ϴ�");
		}
	}

}
