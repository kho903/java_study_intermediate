package chap03.ch08;

public class MemberTreeSetTest {
	public static void main(String[] args) {
		MemberTreeSet treeSet = new MemberTreeSet();

		Member member1 = new Member(1001, "이순신");
		Member member2 = new Member(1002, "김유신");
		Member member3 = new Member(1003, "강감찬");

		treeSet.addMember(member1);
		treeSet.addMember(member2);
		treeSet.addMember(member3);
		treeSet.showAllMembers();
	}
}
