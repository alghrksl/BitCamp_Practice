package Url;

import java.net.URL;

public class UrlTest {

	public static void main(String[] args) {

		String urlStr = "https://sports.news.naver.com/news.nhn?oid=421&aid=0005392894";

		try {
			URL url = new URL(urlStr);

			System.out.println(url.getProtocol());
			System.out.println(url.getHost());
			System.out.println(url.getPort());
			System.out.println(url.getDefaultPort());
			System.out.println(url.getQuery());
			System.out.println(url.getFile());
			System.out.println(url.getPath());
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
