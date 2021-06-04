package Socket;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SubServerSocket {

	public static void main(String[] args) {
		try {
			ServerSocket serversocket = new ServerSocket(9999);

			System.out.println(" 서버 실행 ");
			Socket s = serversocket.accept();

			if (s != null) {
				System.out.println("클라이언트의 접속 요청 : Socket생성");
			}

			DataInputStream din = new DataInputStream(s.getInputStream());

			String msg = din.readUTF();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
