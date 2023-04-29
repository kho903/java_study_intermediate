package ch02;

public class EqualsTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student Lee = new Student(100, "Lee");
		Student Lee2 = Lee;
		Student Shun = new Student(100, "Lee");

		System.out.println(Lee.equals(Lee2));
		System.out.println(Lee == Lee2);

		System.out.println(Lee.equals(Shun)); // equals() override 전 false 후 true
		System.out.println(Lee == Shun); // false

		String str1 = new String("test");
		String str2 = new String("test");
		System.out.println(str1.equals(str2)); // true
		System.out.println(str1 == str2); // false

		System.out.println("======== 해시코드 ========");
		System.out.println(Lee.hashCode()); // hashCode override 전 다름, 후 같음
		System.out.println(Shun.hashCode());

		System.out.println(System.identityHashCode(Lee)); // hashCode 오버라이드 전 주소값
		System.out.println(System.identityHashCode(Shun));

		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());

		Student LeeClone = (Student)Lee.clone();
		System.out.println(LeeClone.toString());
	}
}
