package sample0510;

class Car {
	String color;
	int geartype;
	int door;

	Car() {
		this("white", 2, 4);
	}

	Car(String color) {
		this(color, 2, 4);

	}

	Car(String color, int geartype, int door) {
		this.color = color;
		this.geartype = geartype;
		this.door = door;
		
	}
}

public class SampleCar {

	public static void main(String[] args) {
		Car car = new Car();
		
		System.out.println(car.color + car.door + car.geartype);
		car.color = "blue";
		System.out.println(car.color + car.door + car.geartype);

	}

}
