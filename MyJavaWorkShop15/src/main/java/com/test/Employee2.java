package com.test;

class Sub {
	private String name;
	private int age;

	public Sub(String name, int age) {
		System.out.println(age + name);
	}

	public Sub() {

	}

	public void Work(String location) {
		System.out.println(this.name + " ∞° " + location + " ªÍ¥Ÿ");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void Work() {
		System.out.println("¿œ«—¥Ÿ");
	}

}

public class Employee2 {

	public static void main(String[] args) {

		Sub sub2 = new Sub("±Ë»∆", 20);
		sub2.Work();
		sub2.Work("º≠øÔ");

	}

}
