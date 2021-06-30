package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Fisrt");
		list.add("Sec");
		list.add("Third");
		list.add("Forth");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		} // for문
		System.out.println("-------------------------");
		for (String str : list) {
			System.out.println(list);
		} // foreach
		System.out.println("-------------------------");
		for (String str : list) {
			System.out.println(str);
		} // foreach
		System.out.println("-------------------------");
		Iterator<String> itr = list.iterator();

		while (itr.hasNext()) {
			String currentStr = itr.next();
			System.out.println(currentStr);
		} // hasNext

	}

}
