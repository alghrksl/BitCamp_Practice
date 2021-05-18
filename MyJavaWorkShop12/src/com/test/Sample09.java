package com.test;

import java.util.ArrayList;
import java.util.Iterator;

class MyList implements Iterable {

	ArrayList al;

	MyList() {
		al = new ArrayList();
	}

	public void addItem(Object o) {
		al.add(o);
	}

	public Iterator iterator() {

		return new MyListIterator();

	};

	class MyListIterator implements Iterator {

		int currentIndex = 0;

		public boolean hasNext() {
			if (currentIndex >= al.size()) {
				return false;
			} else {
				return true;
			}
		}

		@Override
		public Object next() {
			return al.get(currentIndex++);
		}
	}

}

public class Sample09 {

	public static void main(String[] args) {

		MyList ml = new MyList();
		ml.addItem(1);
		ml.addItem(2);
		ml.addItem(3);

		Iterator Itr = ml.iterator();
		while (Itr.hasNext()) {
			System.out.println(Itr.next());
		}
		for (Object o : ml) {
			System.out.println(o);
		}

	}

}
