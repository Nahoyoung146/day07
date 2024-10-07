package map_;
//문제

//HashMap과 ArrayList를 사용한 나뭇잎 마을 제7반의 성적 입력, 출력

// 출력 예시
/*
이름, 인술점수, 체술점수를 입력해주세요.
가
90
80
이름, 인술점수, 체술점수를 입력해주세요.
나
7080
90
이름, 인술점수, 체술점수를 입력해주세요.
다
90
70
이름, 인술점수, 체술점수를 입력해주세요.
그만
이름 : 가
인술 : 90
체술 : 80

이름 : 나
인술 : 7080
체술 : 90

이름 : 다
인술 : 90
체술 : 70
*/

// 정답
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HashMapQuiz {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		ArrayList<HashMap<String, Object>> a = new ArrayList<HashMap<String, Object>>(); // 생성된 해쉬맵 객체를 어레이리스트 안에
																							// 넣어준다.(타입 맞춰서)

		while (true) {
			System.out.println("이름, 인술점수, 체술점수를 입력해주세요.");
			HashMap<String, Object> h = new HashMap<String, Object>(); // 반복해서 해쉬맵의 객체를 생성해준다.(이름은 String, 점수는 Object로
																		// 받음 혼용헤서 사용하기에 모든타입을 사용하는 object)
			String name = s.next(); // 학생의 이름을 스캐너를 통해 받을것
			if (name.equals("그만")) { // 입력받은 학생이름이 "그만"일경우 while문 자체를 빠져나간다
				break;
			}
			int insool = s.nextInt(); // 인술점수 스캐너를 통해 받는다.
			int chesool = s.nextInt(); // 체술점수 스캐너를 통해 받는다.
			h.put("name", name); // 키값을 "name"으로 받고, 스캐너로 입력받은 name을 밸류로 넣어준다. -> 키값 "name"을 검색하면 입력받은 name을
									// 검색할수있다.
			h.put("insool", insool); // 키값을 "isool"으로 받고, 스캐너로 입력받은 chesool을 밸류로 넣어준다. -> 키값 "chesool"을 검색하면 입력받은
										// chesool을nsool"으로 받고, 스캐너로 입력받은 insool을 밸류로 넣어준다. -> 키값 "insool"을 검색하면 입력받은
										// insool을 검색할수있다.
			h.put("chesool", chesool); // 키값을 "che 검색할수있다.
			a.add(h); // 생성한 HashMap을 ArrayList에 넣어준다. (ArrayList 넣는 키워드 : add)
		}
		for (int i = 0; i < a.size(); i++) { // i는 0부터, ArrayList의 크기까지 증가하면서 출력한다.
			System.out.println("이름 : " + a.get(i).get("name")); // ArrayList의 i번째 HashMap 키값을 검색하여 값을 출력한다.(키 : "name")
																// (둘다검색 get메소드 사용)
			System.out.println("인술 : " + a.get(i).get("insool")); // ArrayList의 i번째 HashMap 키값을 검색하여 값을 출력한다.(키 :
																	// "insool") (둘다검색 get메소드 사용)
			System.out.println("체술 : " + a.get(i).get("chesool")); // ArrayList의 i번째 HashMap 키값을 검색하여 값을 출력한다.(키 :
																	// "chesool") (둘다검색 get메소드 사용)
			System.out.println();
		}
	}
}