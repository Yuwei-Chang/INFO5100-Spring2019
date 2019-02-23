package class6.collections;

import java.util.Hashtable;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		Map<Integer, String> studentNames = makeMap();
		studentNames.put(125, "Bob");
		studentNames.put(100, "Ashwini");
		studentNames.put(101, "Rekha");
		studentNames.put(102, "Priyanka");
		System.out.println(studentNames.size());
		System.out.println(studentNames);
		studentNames.put(101, "Charlie");
		System.out.println(studentNames);
	}

	private static Map<Integer, String> makeMap() {
		// return new HashMap<Integer, String>();
		// return new LinkedHashMap<Integer,String>();
		// return new TreeMap<Integer, String>();
		return new Hashtable<Integer, String>();
	}

}
