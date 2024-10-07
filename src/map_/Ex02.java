package map_;

import java.util.HashMap;

public class Ex02 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("num", 100);
		map.put("age", 20);
		System.out.println("map : " + map);
		System.out.println(map.containsKey("age"));
		System.out.println(map.containsValue(100));

		map.put("age", 12345);
		System.out.println("map : " + map);

		map.remove("age");
		System.out.println("map : " + map);
	}
}