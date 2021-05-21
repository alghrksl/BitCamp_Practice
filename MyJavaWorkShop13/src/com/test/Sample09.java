package com.test;

import java.util.*;
abstract class Animal4 {
	abstract void breathing();
}
class Dog4 extends Animal4 {
	public void breathing() { System.out.println("Dog breathing"); }
}
class Cat4 extends Animal4 {
	public void breathing() { System.out.println("Cat breathing"); }
}
public class Sample09 {
	static void printAnimal(List<? extends Animal4> animals) {
		for(Animal4 a : animals) {
			a.breathing();
		}
	}
	public static void main(String[] args) {
		ArrayList<Dog4> dog4 = new ArrayList<>();
		dog4.add(new Dog4());
		dog4.add(new Dog4());
		printAnimal(dog4);
//		ArrayList<Object> obj = new ArrayList<>();
//		printAnimal(obj);
		
	}
}


