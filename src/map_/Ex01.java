package map_;

import java.util.HashMap;

public class Ex01 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("num", "1234");
		map.put("name", "홍길동");
		System.out.println("map : " + map);

		System.out.println(map.get("num"));
		System.out.println(map.get("name"));
		System.out.println(map.get("없는 키"));

		String userMsg = "name";
		String result = map.get(userMsg);
		if (result != null) {
			System.out.println(userMsg + " : " + map.get(userMsg));
		} else {
			System.out.println("해당하는 값은 없습니다.");
		}
	}
}