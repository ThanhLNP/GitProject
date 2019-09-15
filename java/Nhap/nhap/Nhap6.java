package nhap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

class KeyComparator implements Comparator<HashMap.Entry<String, String>> {
	public int compare(HashMap.Entry<String, String> m1, HashMap.Entry<String, String> m2) {
		return m2.getKey().compareTo(m1.getKey());
	}
}

class ValuesComparator implements Comparator<HashMap.Entry<String, String>> {
	public int compare(HashMap.Entry<String, String> m1, HashMap.Entry<String, String> m2) {
		return m1.getValue().compareTo(m2.getValue());
	}
}

public class Nhap6 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("1", "f");
		map.put("6", "e");
		map.put("3", "b");
		map.put("4", "d");
		map.put("2", "a");
		map.put("5", "c");
		map.put("9", "d");
		map.put("7", "d");
		map.put("8", "d");
		map.put("0", "d");

		ArrayList<HashMap.Entry<String, String>> list = new ArrayList<HashMap.Entry<String, String>>();
		list.addAll(map.entrySet());

		System.out.println(list);

		Collections.sort(list, new KeyComparator());
		System.out.println(list);

		Collections.sort(list, new ValuesComparator());
		System.out.println(list);
	}
}
