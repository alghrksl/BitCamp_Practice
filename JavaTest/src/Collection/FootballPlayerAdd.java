package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FootballPlayerAdd {

	public static void main(String[] args) {

		List<FootballPlayerMain> players = new ArrayList<FootballPlayerMain>();
		players.add(new FootballPlayerMain("아구에로", 10, "맨시티", 32));
		players.add(new FootballPlayerMain("메시", 9, "바르셀로나", 32));
		players.add(new FootballPlayerMain("해리케인", 10, "토트넘", 28));
		players.add(new FootballPlayerMain("하베르츠", 9, "첼시", 26));

		Iterator<FootballPlayerMain> itr = players.iterator();
		while (itr.hasNext()) {

			itr.next().showInfo();
		}
	}

}
