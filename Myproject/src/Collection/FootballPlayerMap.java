package Collection;

import java.util.*;

public class FootballPlayerMap {

	public static void main(String[] args) {
		// HashMap<키 , 값>
		HashMap<Integer, FootballPlayerMain> players = new HashMap<Integer, FootballPlayerMain>();

		// 이름.삽입(키, 값(내용));
		players.put(9, new FootballPlayerMain("메시", 9, "바르셀로나", 32));
		players.put(1, new FootballPlayerMain("해리케인", 10, "토트넘", 28));
		players.put(2, new FootballPlayerMain("ㄱ", 9, "첼시", 26));
		players.put(3, new FootballPlayerMain("ㄱ", 1, "첼시", 26));
		players.put(4, new FootballPlayerMain("ㄴ", 10, "첼시", 36));
		players.put(5, new FootballPlayerMain("ㄷ", 11, "첼시", 56));
		players.put(6, new FootballPlayerMain("아구에로", 10, "맨시티", 32));

		// Set set = Map.key
		Set<Integer> set = players.keySet();

		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext()) {
			int key = itr.next();
			System.out.println("번호 > " + key + " | 내용 > " + players.get(key));
		}
	}

}