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
//		FruitBox<Grape> grapebox = new FruitBox<Apple>(); // 왼쪽 오른쪽 타입 불일치
		FruitBox<Toy> toybox = new 	FruitBox<Toy>(); // Toy Class 가 Fruit를 extend 하지 않기 때문

		fruitbox.add(new Fruit());
		fruitbox.add(new Apple());
		fruitbox.add(new Grape()); // fruitbox 는 모든 과일 클래스와 연결 되어있어 다 담을수 있다.
		applebox.add(new Apple());
		grapebox.add(new Grape()); // 각각의 박스는 각각의 과일 클래스 와 연결 되어 있어 각자의 것만 담을수 있다.
		toybox.add(new Toy());

		System.out.println(fruitbox);
		System.out.println(applebox);
		System.out.println(grapebox);
		System.out.println(toybox);

	}

}
