package ch03;

public class StringBufferTest {
	public static void main(String[] args) {
		String java = new String("java");
		String android = new String("android");

		StringBuffer sb = new StringBuffer(java);
		System.out.println(System.identityHashCode(sb));
		sb.append(android);
		System.out.println(sb.toString());
		System.out.println(System.identityHashCode(sb));

		java = sb.toString();
	}
}
