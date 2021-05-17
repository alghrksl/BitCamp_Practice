package com.test3;
class Animal {
	void breathing() { System.out.println("Animal breathing"); }
}
class Dog extends Animal {
	void barking() { System.out.println("Dog barking"); }
}
class BlackDog extends Dog {
	void running() { System.out.println("BlackDog running"); }
}
class Cat extends Animal  {
	void meowing() { System.out.println("Cat meowing"); }
}
public class Sample07 {
	static Animal test(Animal a) {
		Animal a2 = null;
		String name = a.getClass().getName();
		switch(name){
		case "Dog":
			a2 = new Dog();
			break;
		case "BlackDog":
			a2 = new BlackDog();
			break;
		}
		return a2;
	}
	public static void main(String[] args) {
		BlackDog bkDog = new BlackDog();
		Dog dog5 = bkDog;
		Animal animal3 = dog5;
		BlackDog bkDog2 = (BlackDog)animal3;
		Dog dog6 = (Dog)animal3;
		dog6.barking();
		dog6.breathing();
		
		BlackDog bkDog3 = new BlackDog();
		Animal obj2 = bkDog3;
		Dog dog7 = new Dog();
		Animal obj4 = dog7;
		
		Animal obj = new BlackDog(); 
		Animal obj3 = new Dog();
		Animal obj5 = test(new BlackDog());
		Animal obj6 = test(new Dog());
		
//		Dog dog = new Dog();
//		Animal animal = dog;
//		Dog dog2 = (Dog)animal;
	
//		Dog dog3 = new Dog();
//		Animal animal2 = dog3;
//		Cat cat = (Cat)animal2; // 형제관계(x)
		
//		Animal animal3 = new Animal();
//		Dog dog4 = (Dog)animal3; 
//		객체가 존재하는 않는 경우 하위 (x)
	}
}
// 359페이지 7-15






