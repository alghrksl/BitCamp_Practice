package com.test;

import java.util.ArrayList;

interface Eataable {
};

class Fruit implements Eataable {
	public String toString() {
		return "fruit";
	}

}

class Apple extends Fruit {
	public String toString() {
		return "apple";
	}
}

class Grape extends Fruit {
	public String toString() {
		return "grape";
	}
}

class Toy extends Fruit {
	public String toString() {
		return "toy";
	}
}

class FruitBox<T extends Fruit & Eataable> extends Box<T> {

}



//class ToyBox<T extends Toy & Eataable> extends TBox<T> {
//
//}

class TBox<T> {
	ArrayList<T> list = new ArrayList<T>();

	void add(T item) {
		list.add(item);
	}

	public String toString() {
		return list.toString();
	}
}

class Box<T> {
	ArrayList<T> list = new ArrayList<T>();

	void add(T item) {
		list.add(item);
	}



	public String toString() {
		return list.toString();
	}
}

public class Sample16 {

	public static void main(String[] args) {

		FruitBox<Fruit> fruitbox = new FruitBox<Fruit>();
		FruitBox<Apple> applebox = new FruitBox<Apple>();
		FruitBox<Grape> grapebox = new FruitBox<Grape>();
//		FruitBox<Grape> grapebox = new FruitBox<Apple>(); // ���� ������ Ÿ�� ����ġ
		FruitBox<Toy> toybox = new 	FruitBox<Toy>(); // Toy Class �� Fruit�� extend ���� �ʱ� ����

		fruitbox.add(new Fruit());
		fruitbox.add(new Apple());
		fruitbox.add(new Grape()); // fruitbox �� ��� ���� Ŭ������ ���� �Ǿ��־� �� ������ �ִ�.
		applebox.add(new Apple());
		grapebox.add(new Grape()); // ������ �ڽ��� ������ ���� Ŭ���� �� ���� �Ǿ� �־� ������ �͸� ������ �ִ�.
		toybox.add(new Toy());

		System.out.println(fruitbox);
		System.out.println(applebox);
		System.out.println(grapebox);
		System.out.println(toybox);

	}

}
