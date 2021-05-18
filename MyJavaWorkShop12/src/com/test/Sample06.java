package com.test;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Sample06 {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList(1000000);
		LinkedList li = new LinkedList();

		add(ar);
		add(li);

		System.out.println(access(ar));
		System.out.println(access(li));

	}

	public static void add(List list) {
		for (int i = 0; i < 10000; i++)
			list.add(i);

	}

	public static long access(List list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++)
			list.get(i);
		long end = System.currentTimeMillis();
		return end - start;
	}
}
