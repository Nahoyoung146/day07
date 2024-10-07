package string_;

public class Ex01 {
	public static void main(String[] args) {
		String str1;
		String str2 = new String();
		String str3 = "test";
		String str4 = new String("aaaa");
		// System.out.println("Str1 : " + str1 );
		System.out.println("Str2 : " + str2); // new 덕분에 초기화가 안됐지만 에러 안뜸
		System.out.println("Str3 : " + str3);
		System.out.println("Str4 : " + str4);

		str4 = "Kim";// kim, KIM
		System.out.println(str4.equals("kim"));
		System.out.println(str4.toUpperCase());
		System.out.println(str4.toLowerCase());

		String s = str4.toUpperCase();
		// if(s.equals("KIM")) {
		if (str4.toUpperCase().equals("KIM")) {
			System.out.println("김씨!");
		} else {
			System.out.println("아니군");
		}
	}
}