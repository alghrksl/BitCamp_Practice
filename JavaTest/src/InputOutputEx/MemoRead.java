package InputOutputEx;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MemoRead {

	static Scanner scanner = new Scanner(System.in);

	public void Writer(File newFile) {
		System.out.println("읽기 시작 ! ");
		System.out.println("제목 입력 >> ");
		String memoTitle = scanner.next();
 
		BufferedReader Reader;
		try {
			Reader = new BufferedReader(new FileReader(newFile + File.separator + memoTitle));

			String str = null;

			while (true) {
				str = Reader.readLine();
				if (str == null) {
					break;
				}
				System.out.println(str);
			}
			Reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("읽기 종료 ! ");

	}

	public File GetFile() {

		String forderName;
		String forderPath;

		System.out.println("저장된 폴더의 경로를 입력해주세요 >> ");
		forderName = scanner.nextLine();
		forderPath = "C:\\" + forderName;

		File newFile = new File(forderPath);
		System.out.println(newFile + File.separator);

		return newFile;

	}

	public static void main(String[] args) {
		String exit = "e";
		while (!exit.equals("exit")) {

			MemoRead memoRead = new MemoRead();

			File newFile = memoRead.GetFile();

			memoRead.Writer(newFile);

			System.out.println("나가고 싶으시면 exit을, 계속 메모를 읽고 싶으시면 아무키나 입력해주세요.");
			exit = scanner.next();
		}

	}

}
