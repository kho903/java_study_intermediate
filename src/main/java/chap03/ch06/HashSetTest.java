package chap03.ch06;

import java.util.HashSet;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<>();

		hashSet.add("김유신");
		hashSet.add("이순신");
		hashSet.add("홍길동");
		hashSet.add("강감찬");
		hashSet.add("강감찬");

		System.out.println(hashSet);
	}
}
