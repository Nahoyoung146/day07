package map_;

import java.util.ArrayList;
import java.util.Scanner;

// ArrayList를 이용해서 과일을 추가하고 전체 과일 개수 및 과일 전체 출력 및 개별 출력해보고 제거도 하고 마지막은 과일을 입력받아 있는지 없는지 확인
// 출력 예시)
/*
 과일은 4개입니다.
바나나
키위
바나나
키위
오렌지
사과
과일은 3개입니다.
바나나
오렌지
사과
과일은 0개입니다.
과일 입력 : 수박
수박이(가) 없습니다.
false
 */

// 정답
public class ArrayListQuiz {
	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<String>();

		fruits.add("바나나");
		fruits.add("키위");
		fruits.add("오렌지");
		fruits.add("사과");

		System.out.println("과일은 " + fruits.size() + "개입니다.");

		System.out.println(fruits.get(0));
		System.out.println(fruits.get(1));

		for (int i = 0; i < fruits.size(); i++) {
			System.out.println(fruits.get(i));
		}

		fruits.remove(1);
		System.out.println("과일은 " + fruits.size() + "개입니다.");

		for (String fruit : fruits) {
			System.out.println(fruit);
		}

		fruits.clear();
		System.out.println("과일은 " + fruits.size() + "개입니다.");
		// 사용자에게 String을 입력 받아서 해당 ArrayList에 과일이 들어 있는지 찾아보기
		boolean check = true;

		fruits.add("바나나");
		fruits.add("키위");
		fruits.add("오렌지");
		fruits.add("사과");

		Scanner sc = new Scanner(System.in);
		System.out.print("과일 입력 : ");
		String answer = sc.next();

		for (String fruit : fruits) {
			if (answer.equals(fruit)) {
				System.out.println(answer + "이(가) 있습니다.");
				check = false;
				break;
			}
		}

		if (check) {
			System.out.println(answer + "이(가) 없습니다.");
		}

		System.out.println(fruits.contains(answer)); // true or false
	}
}