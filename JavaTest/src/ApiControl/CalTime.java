package ApiControl;

public class CalTime {

	public static void main(String[] args) {
		long thistime, endtime;
		long result;

		thistime = System.currentTimeMillis();

		for (int i = 0; i < 1000000; i++) {
			int sum = 0;
			sum += i;
			System.out.println(sum);
		}

		endtime = System.currentTimeMillis();

		result = endtime - thistime;

		System.out.println(result / 1000 + "초");
	}

}
