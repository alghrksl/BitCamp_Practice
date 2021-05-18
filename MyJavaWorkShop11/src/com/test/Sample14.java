package com.test;
import java.util.*;
class Animal {
	void breathing() { System.out.println("Animal breathing"); }
}
class Dog extends Animal {
	void breathing() { System.out.println("Dog breathing"); }
}
public class Sample14 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new Animal());
		al.add(new Dog());
		for(int inx = 0; inx < al.size(); inx++) {
			Object obj = al.get(inx);
			Animal a = (Animal)obj;
			a.breathing();
		}
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			Object obj = itr.next();
			Animal a = (Animal)obj;
			a.breathing();
		}
		
	}
}
