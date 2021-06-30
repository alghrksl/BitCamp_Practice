package Extend01;

import java.util.ArrayList;
import java.util.List;

public class Person {

	public static void main(String[] args) {

		List<PersonController> ps = new ArrayList<PersonController>();
		ps.add(new Male("김석호", "960413-100001", "야구"));

		ps.add(new Female("김준영", "960413-260003", "뜨개질"));

		for (PersonController person : ps) {
			person.hello();
		}

	}

}
