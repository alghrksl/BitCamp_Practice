package sample0512;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SampleEx7_10 {

	public static void main(String[] args) {
		Date today = new Date();

		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss ");

		System.out.println("������ ��¥�� " + date.format(today));

		System.out.println("������ ��¥�� " + time.format(today));

	}

}
