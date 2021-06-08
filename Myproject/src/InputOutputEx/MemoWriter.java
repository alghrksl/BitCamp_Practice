package InputOutputEx;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;

public class MemoWriter {

	static Scanner scanner = new Scanner(System.in);;

	public void Writer(String title, File newFile) {
		System.out.println("메모 시작 ! ");
		System.out.println("제목 입력 >> ");
		String memoTitle = scanner.next();
		System.out.println("내용 입력 >> ");
		String content = scanner.next();

		BufferedWriter Writer;
		try {
			Writer = new BufferedWriter(new FileWriter(newFile + File.separator + memoTitle + title));
			Writer.write(title + memoTitle + content);
			Writer.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("메모 종료 ! ");

	}

	public File SetFile() {

		String forderName;
		String forderPath;

		System.out.println("저장할 폴더의 경로를 입력해주세요 >> ");
		forderName = scanner.nextLine();
		forderPath = "C:\\" + forderName;

		File newFile = new File(forderPath);
		System.out.println(newFile + File.separator);

		return newFile;

	}

	public static void main(String[] args) {
//		1.콘솔기반으로 메모장 기능을 만들어 봅시다.
//
//		File 클래스를 이용해서 저장 폴더 생성                   
//
//		문자기반 스트림을 이용해서 날짜와 제목, 메모를 파일에 저장
//
//		파일의 이름은 날짜와 메모의 제목을 이용해서 생성
//
//		메모리스트와 파일 읽기 기능을 구현해봅시다.
//      
//      폴더를 생성한다 File newFile = new File("D:"+File.separator+"memo");  (사용자에게 저장할 폴더의 경로를 입력받음 , 입력하지 않는다면 자동 D: ) ( 사용자가 입력한 경로에 폴더가 존재하지 않는다면 폴더 생성, 폴더가 존재한다면 계속 진행) 
//      메모장 파일을 생성한다 (파일의 제목은 생성 당시의 날짜 + 입력한 제목) (이미 존재하는 파일일 경우 경고후 다시 파일 생성라인으로 )
//		메모장 제목과 내용을 입력한다. (BufferedWriter)
//		메모장 내용을 읽는다.

		Calendar date = Calendar.getInstance();
		int year = date.get(Calendar.YEAR);
		int month = date.get(Calendar.MONTH);
		int day = date.get(Calendar.DATE);

		String title = year + "년" + month + "월" + day + "일";
		Scanner scanner = new Scanner(System.in);
		MemoWriter memoMain = new MemoWriter();
		String exit = "e";

		while (!exit.equals("exit")) {

			File newFile = memoMain.SetFile();

			if (newFile.exists()) {

				System.out.println("이미 존재하는 폴더 입니다.");
				System.out.println("1. 해당 폴더에 저장");
				System.out.println("2. 다른 폴더 생성후 저장");
				int choiceNum = scanner.nextInt();

				if (choiceNum == 1) {

					memoMain.Writer(title, newFile);

				} else if (choiceNum == 2) {

				}

			} else if (!(newFile.exists())) {
				newFile.mkdir();
				System.out.println("폴더 생성 ! ");

				memoMain.Writer(title, newFile);
			}
			System.out.println("계속 하시려면 아무키나,");
			System.out.println("종료 하시려면 Exit를 입력해주세요. ");
			exit = scanner.next();

		}
		scanner.close();
	}

}
