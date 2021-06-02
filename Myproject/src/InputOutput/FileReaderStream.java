package InputOutput;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;

public class FileReaderStream {

	public static void main(String[] args) {

		try {
			Reader in = new FileReader("hyper.txt");

			char[] cbuf = new char[10];
			int readLen = 0;

			readLen = in.read(cbuf, 0, cbuf.length);

			for (int i = 0; i < readLen; i++) {
				System.out.println(cbuf[i]);

			}

			in.close();
			System.out.println("식사 완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
