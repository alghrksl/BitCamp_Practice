package Collection;

import java.util.*;

public class FootballPlayerTree {

	public static void main(String[] args) {

		TreeSet<FootballPlayerMain> players = new TreeSet<FootballPlayerMain>();

		players.add(new FootballPlayerMain("메시", 9, "바르셀로나", 32));
		players.add(new FootballPlayerMain("해리케인", 10, "토트넘", 28));
		players.add(new FootballPlayerMain("ㄱ", 9, "첼시", 26));
		players.add(new FootballPlayerMain("ㄱ", 1, "첼시", 26));
		players.add(new FootballPlayerMain("ㄴ", 10, "첼시", 36));
		players.add(new FootballPlayerMain("ㄷ", 11, "첼시", 56));
		players.add(new FootballPlayerMain("아구에로", 10, "맨시티", 32));
		Iterator<FootballPlayerMain> itr = players.iterator();
		while (itr.hasNext()) {
			itr.next().showInfo();
		}
	}

}