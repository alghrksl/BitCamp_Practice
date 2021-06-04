package Url;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpUrlConnectionTest {

	public static void main(String[] args) {

		String urlStr = "https://sports.news.naver.com/news.nhn?oid=421&aid=0005392894";

		try {
			URL url = new URL(urlStr);

			HttpURLConnection hcon = (HttpURLConnection) url.openConnection();

			for (int i = 1; i <= 8; i++) {
				System.out.print(hcon.getHeaderFieldKey(i));
				System.out.println(" : " + hcon.getHeaderField(i));
			}

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
