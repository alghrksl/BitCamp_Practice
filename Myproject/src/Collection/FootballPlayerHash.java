package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class FootballPlayerHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<FootballPlayerMain> players = new HashSet<FootballPlayerMain>();
		players.add(new FootballPlayerMain("아구에로", 10, "맨시티", 32));
		players.add(new FootballPlayerMain("메시", 9, "바르셀로나", 32));
		players.add(new FootballPlayerMain("해리케인", 10, "토트넘", 28));
		players.add(new FootballPlayerMain("하베르츠", 9, "첼시", 26));
		players.add(new FootballPlayerMain("아구에로", 10, "맨시티", 32));
		players.add(new FootballPlayerMain("메시", 9, "바르셀로나", 32));
		players.add(new FootballPlayerMain("해리케인", 10, "토트넘", 28));
		players.add(new FootballPlayerMain("하베르츠", 9, "첼시", 26));
		players.add(new FootballPlayerMain("즐라탄", 10, "AC밀란", 38));

		Iterator<FootballPlayerMain> itr = players.iterator();
		while (itr.hasNext()) {

			itr.next().showInfo();

		}

	}
}
