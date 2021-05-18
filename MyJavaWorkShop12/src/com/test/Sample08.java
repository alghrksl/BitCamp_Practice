package com.test;

import java.util.EmptyStackException;
import java.util.Vector;

class Sample08 extends Vector {
	public Object push(Object item) {
		addElement(item);
		return item;
	}

	public Object pop() {
		Object obj = peek(); // 저장된 마지막 요소 불러오는 메소드
		removeElementAt(size() - 1);
		return obj;
	}

	public Object peek() {
		int len = size();

		if (len == 0)
			throw new EmptyStackException();
		return elementAt(len - 1);

	}

	public boolean empty() {
		return size() == 0;
	}

	public int search(Object o) {
		int i = lastIndexOf(o);

		if (i >= 0) {
			return size() - i;
		}

		return -1;
	}
}
