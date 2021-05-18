package com.test;

import java.util.ArrayList;
import java.util.Collections;

class Myelement implements Comparable {
	private int i;

	Myelement(int i) {
		this.i = i;
	}

	public int getI() {
		return this.i;
	}

	public int compareTo(Object o) {

		Myelement ml = (Myelement) o;
		if (this.i < ml.getI()) {
			return -1;
		} else if (this.i > ml.getI()) {
			return 1;
		} else {
			return 0;
		}
	}
}

public class Sample13important {

//	static void BubbleSortArrayList(ArrayList al) {
//		Myelement temp;
//		boolean sorted = false;
//
//		while(!sorted) {
//
//			sorted = true;
//
//			for (int inx = 0; inx < al.size() - 1; inx++) {
//				
//				Myelement m3 = (Myelement) al.get(inx);
//				Myelement m4 = (Myelement) al.get(inx + 1);
//				if (m3.compareTo(m4) < 0) {
//
//					temp = m3;
//					al.set(inx, m4);
//					al.set(inx + 1, temp);
//					sorted = false;
//				}
//			}
//		}
//		
//	}
	


	public static void main(String[] args) {

		Myelement ml = new Myelement(10);
		Myelement ml2 = new Myelement(20);

		System.out.println(ml.compareTo(ml2));
		System.out.println(ml2.compareTo(ml));
		System.out.println(ml.compareTo(ml));

		ArrayList al = new ArrayList();
		al.add(new Myelement(2));
		al.add(new Myelement(1));
		al.add(new Myelement(3));
		al.add(new Myelement(4));
		
		
//		BubbleSortArrayList(al);
		
		Collections.sort(al);
		for (Object o : al) {
			System.out.println(((Myelement)o).getI());
		}
		
		
	}

}
