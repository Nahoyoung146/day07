package set_;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ex02 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("111");
		set.add("222");
		set.add("333");
		boolean bool = set.remove("123123");
		System.out.println("bool : " + bool);
		System.out.println("set : " + set);

		/*
		 * itertor - 반복자 - 컬렉션에 있는 값을 배열 형식으로 만들어준다 - 처음 위치는 bof, 마지막 위치는 eof - bof :
		 * 시작점, eof : 끝나는 지점
		 */
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(111);
		arr.add(222);
		arr.add(333);
		Iterator<Integer> it = arr.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		/*
		 * System.out.println(it.hasNext()); System.out.println(it.next());
		 * System.out.println(it.next()); System.out.println(it.next());
		 * System.out.println(it.hasNext()); System.out.println(it.next());
		 */

		System.out.println("------------------------");
		Iterator<String> its = set.iterator();
		while (its.hasNext()) {
			String s = its.next();
			System.out.println(s);
		}
	}
}