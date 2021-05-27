package Extend;

import java.util.ArrayList;
import java.util.List;

public class Person {

	public static void main(String[] args) {

		List<PersonController> ps = new ArrayList<PersonController>();
		ps.add(new Male("김석호", "960413-1200321", "야구"));

		ps.add(new Female("김준영", "960413-2654823", "뜨개질"));

		for (PersonController person : ps) {
			person.hello();
		}

	}

}
