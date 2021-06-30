package ApiControl;

import java.util.ArrayList;

import java.util.Scanner;

public class PersonEquals {
	String name;
	String personnumber;

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonEquals other = (PersonEquals) obj;
		if (personnumber == null) {
			if (other.personnumber != null)
				return false;
		} else if (!personnumber.equals(other.personnumber))

			return false;
		return true;
	}

	PersonEquals(String name, String personnumber) {
		this.name = name;
		this.personnumber = personnumber;
	}

	void showinfo() {
		System.out.println("이름 " + name + " 주민번호 " + personnumber);

	}

	public static void main(String[] args) {

		PersonEquals personinfo = new PersonEquals("김수한무", "960413-0000000");
		PersonEquals personinfo2 = new PersonEquals("김두루미", "960413-0000000");

		personinfo.showinfo();
		personinfo2.showinfo();

		System.out.println(personinfo.equals(personinfo2));

		PersonEquals personinfo3 = new PersonEquals("거북이", "960413-0000000");
		PersonEquals personinfo4 = new PersonEquals("깡총이", "960413-0000001");

		personinfo3.showinfo();
		personinfo4.showinfo();

		System.out.println(personinfo3.equals(personinfo4));

	}
}