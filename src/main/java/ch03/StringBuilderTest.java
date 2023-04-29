package ch03;

public class StringBuilderTest {
	public static void main(String[] args) {
		String java = new String("java");
		String android = new String("android");

		StringBuilder sb = new StringBuilder(java);
		System.out.println(System.identityHashCode(sb));
		sb.append(android);
		System.out.println(sb.toString());
		System.out.println(System.identityHashCode(sb));

		java = sb.toString();
	}
}
