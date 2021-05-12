package sample0511.test2;
class Animal {
	void breathing() { System.out.println("Animal breathing"); }
}
class Dog extends Animal {
	void barking() { System.out.println("Dog barking"); }
}
class Cat extends Animal  {
	void meowing() { System.out.println("Cat meowing"); }
}
public class Sample06 {
	static void test1(Dog d) {}
	static void test2(Cat c) {}
	static void test3(Animal a) {}
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.breathing();
		dog.barking();
		Animal animal = dog; // implicit cast
		animal.breathing();
		Dog dog2 = (Dog)animal; // explicit cast
		dog2.barking();
		dog2.breathing();
		
		Object obj = dog;
		Dog obj2 = (Dog)obj;
		obj2.barking();
		obj2.breathing();
		
		
//		byte a = Byte.MAX_VALUE;
//		int b = Integer.MAX_VALUE;
//		System.out.println(a + ", " + b);
//		int c = a; // byte -> int => implicit cast(암시적인 형변환)
//		byte d = (byte)c; // int -> byte => explicit cat(명시적인 형변환)
		// value type type cast
		
		
	}
}
