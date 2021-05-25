package Sample01;

public class Person {

	String name = "Kimhoon";
	String phone_number = "010-3753-0532";
	String person_number = "960430-1211432";

	void showData() {
		System.out.println(name);
		System.out.println(phone_number);
		System.out.println(person_number);
	}

	public static void main(String[] args) {

		Person person = new Person();
		person.showData();

	}

}
