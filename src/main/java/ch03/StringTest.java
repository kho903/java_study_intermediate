package ch03;

public class StringTest {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");

		System.out.println(str1 == str2); // false

		String str3 = "abc";
		String str4 = "abc";
		System.out.println(str3 == str4); // true : 상수 풀의 문자열은 모두 같은 주소를 가짐.
	}
}
