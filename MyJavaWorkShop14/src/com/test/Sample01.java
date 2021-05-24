package com.test;

import java.util.ArrayList;
import java.util.List;

class Animal {
	void breathing() {
		System.out.println("animal");
	}
}

class dog extends Animal {
	void breathing() {
		System.out.println("Dog");
	}
}

public class Sample01 {

	static void testMethod(List<? extends Animal> list) {
		for (Animal a : list) {
			a.breathing();
		}
	}

	public static void main(String[] args) {
//		testMethod(new ArrayList<Animal>());

		List<dog> dogs = new ArrayList<dog>();
		dogs.add(new dog());
		dogs.add(new dog());
		testMethod(dogs);

		List<Animal> ani = new ArrayList<Animal>();
		ani.add(new Animal());
		ani.add(new Animal());
		testMethod(ani);
	}

}
