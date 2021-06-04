package Socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MsgServer {

	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket sk = null;

		DataInputStream din = null;
		DataOutputStream dout = null;
		try {
			ss = new ServerSocket(8888);
			System.out.println("서버 실행");
			System.out.println("----------------------------");
			sk = ss.accept();
			System.out.println("client 접속");
			System.out.println("----------------------------");

			din = new DataInputStream(sk.getInputStream());
			dout = new DataOutputStream(sk.getOutputStream());

			Scanner sc = new Scanner(System.in);
		
			String str = null; // 받는 메시지
			System.out.println("입력");
			String str2 = ""; // 보내는 메시지

			while (!str2.equals("exit")) {

				str = din.readUTF();
				System.out.println(str);

				str2 = sc.nextLine();
				dout.writeUTF(str2);
			}

		} catch (

		IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			Until.close(din);
			Until.close(dout);
			Until.close(sk);
			Until.close(ss);

		}

	}

}
