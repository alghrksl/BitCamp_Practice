package com.test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import javax.management.Query;

public class Sample07 {

	public static void main(String[] args) {
		Stack st = new Stack();
		Queue q = new LinkedList();

		st.push("0");
		st.push("1");
		st.push("2");

		q.offer("0");
		q.offer("1");
		q.offer("2");

		
			System.out.println(st);


		System.out.println("= Que =");
		while (!q.isEmpty()) {
			System.out.println(q.poll());
		}

	}

}
