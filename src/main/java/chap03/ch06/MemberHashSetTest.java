package chap03.ch06;

public class MemberHashSetTest {
	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();

		Member member1 = new Member(1001, "이순신");
		Member member2 = new Member(1002, "김유신");
		Member member3 = new Member(1003, "강감찬");

		memberHashSet.addMember(member1);
		memberHashSet.addMember(member2);
		memberHashSet.addMember(member3);
		memberHashSet.showAllMembers();

		System.out.println("===========");
		Member member4 = new Member(1003, "강감찬");
		memberHashSet.addMember(member4);
		memberHashSet.showAllMembers();
	}
}
