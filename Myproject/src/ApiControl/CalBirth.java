package ApiControl;

import java.util.Calendar;
import java.util.Scanner;

public class CalBirth {
	public static void main(String[] args) {

		Calendar thisDate = Calendar.getInstance();
		Calendar birthDate = Calendar.getInstance();

		Scanner s = new Scanner(System.in);

		long resultDay = 0;

		birthDate.set(1996, 04, 13);

		resultDay = (thisDate.getTimeInMillis() - birthDate.getTimeInMillis()) / 1000;
		resultDay = resultDay/86400;
		System.out.println(resultDay);
	}

}
