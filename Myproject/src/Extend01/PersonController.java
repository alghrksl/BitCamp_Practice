package Extend01;

import java.util.Calendar;

public class PersonController {
	private String name;
	private String year;
	private String hooby;

	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	PersonController(String name, String year) {
		this.name = name;
		this.year = year;

	}

	void gender() {

		int gender = Integer.parseInt(year.substring(7, 8));

		if (gender == 1) {

			System.out.println("남자");

		} else {
			System.out.println("여자");
		}

	}

	int Calage() {
		int thisyear = Calendar.getInstance().get(Calendar.YEAR);
		int personyear = Integer.parseInt(year.substring(0, 2));
		int personage;
		if (personyear < 21) {
			personyear += 2000;
			personage = thisyear - personyear + 1;

		} else {
			personyear += 1900;
			personage = thisyear - personyear + 1;

		}

		return personage;
	}

	void hello() {

		System.out.println("제 이름은 " + this.name + " 나이는 " + Calage());

	}

}
