package InputOutput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StringWriter {

	public static void main(String[] args) {

		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("String.txt"));

			System.out.println("쓰기 시작");
			out.write("손");
			out.write("HI");

			out.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
