package sample0512;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SampleEx7_10 {

	public static void main(String[] args) {
		Date today = new Date();

		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss ");

		System.out.println("오늘의 날짜는 " + date.format(today));

		System.out.println("오늘의 날짜는 " + time.format(today));

	}

}
