package Extend;

import java.util.ArrayList;
import java.util.List;

public class Person {

	public static void main(String[] args) {

		List<Male> ps = new ArrayList<Male>();
		ps.add(new Male("김석호", "960413-1200321", "야구"));

		List<Female> ps2 = new ArrayList<Female>();
		ps2.add(new Female("김준영", "960413-2654823", "뜨개질"));

		for (Male person : ps) {
			person.hello();
		}
		for (Female person : ps2) {
			person.hello();
		}
	}

}
