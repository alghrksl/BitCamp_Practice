package InputOutputEx;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import Collection.FootballPlayerMain;

public class FootballPlayerFile {

	static Scanner scanner = new Scanner(System.in);;

	public static void Writer(File newFile) {

		System.out.println("제목 입력 >> ");
		String memoTitle = scanner.next();

		try {
			ObjectOutputStream ObjOut = new ObjectOutputStream(
					new FileOutputStream(newFile + File.separator + memoTitle));

			List<FootballPlayerMain> players = new ArrayList<FootballPlayerMain>();
			players.add(new FootballPlayerMain("아구에로", 10, "맨시티", 32));
			players.add(new FootballPlayerMain("메시", 9, "바르셀로나", 32));
			players.add(new FootballPlayerMain("해리케인", 10, "토트넘", 28));
			players.add(new FootballPlayerMain("하베르츠", 9, "첼시", 26));
			ObjOut.writeObject(players);
			ObjOut.close();

			System.out.println("저장 완료 !");

			ObjectInputStream in = new ObjectInputStream(new FileInputStream(newFile + File.separator + memoTitle));

			ArrayList<FootballPlayerMain> rePlayers = (ArrayList<FootballPlayerMain>) in.readObject();
			in.close();
			System.out.println("복원 시작 ! ");

			Iterator<FootballPlayerMain> itr = rePlayers.iterator();
			while (itr.hasNext()) {

				itr.next().showInfo();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("복원 종료 ! ");

	}

	public static File SetFile() {

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

		String exit = "";
		while (!exit.equals("exit")) {

			File newFile = FootballPlayerFile.SetFile();

			if (newFile.exists()) {

				System.out.println("이미 존재하는 폴더 입니다.");
				System.out.println("1. 해당 폴더에 저장");
				System.out.println("2. 다른 폴더 생성후 저장");
				int choiceNum = scanner.nextInt();

				if (choiceNum == 1) {

					FootballPlayerFile.Writer(newFile);

				} else if (choiceNum == 2) {

				}

			} else if (!(newFile.exists())) {
				newFile.mkdir();
				System.out.println("폴더 생성 ! ");

				FootballPlayerFile.Writer(newFile);
			}
			System.out.println("계속 하시려면 아무키나,");
			System.out.println("종료 하시려면 Exit를 입력해주세요. ");
			exit = scanner.next();

		}

	}

}
