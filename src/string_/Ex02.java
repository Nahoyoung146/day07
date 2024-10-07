package string_;

public class Ex02 {
	public static void main(String[] args) {
		String str1 = "       test        ";
		String str2 = "t e s t    ";
		System.out.println("111" + str1 + "111");
		System.out.println("111" + str2 + "111");
		System.out.println(str1.equals(str2));

		String s1 = str1.trim();
		String s2 = str2.trim();
		System.out.println("111" + s1 + "111");
		System.out.println("111" + s2 + "111");
		String addr = "01234/서울/노원구/동일로 1234";
		String[] s = addr.split("/");
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println("------------");
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		System.out.println("-----------------");
		String phone = "010-1234-1234";
		String replace = phone.replace("-", "aaa");
		System.out.println(replace);

		System.out.println(phone.charAt(3));
	}
}