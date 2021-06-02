package InputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ByteFileCopy {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream in = new FileInputStream("in.pdf");

		FileInputStream out = new FileInputStream("out.pdf");
	}

}
