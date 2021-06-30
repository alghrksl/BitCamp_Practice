package Socket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSocket {

	public static void main(String[] args) {

		try {
			Socket sk = new Socket("localhost", 9999);
			if (sk != null) {
				System.out.println("접속 완료");
			}
			
			DataOutputStream dout = new DataOutputStream(sk.getOutputStream());
			
			dout.writeUTF("Good bye");
			dout.flush();
			dout.close();
			sk.close();

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
