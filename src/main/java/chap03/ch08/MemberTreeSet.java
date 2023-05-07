package chap03.ch08;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
	private TreeSet<Member> treeSet;

	public MemberTreeSet() {
		treeSet = new TreeSet<>();
	}

	public void addMember(Member member) {
		treeSet.add(member);
	}

	public boolean removeMember(int memberId) {
		/*for (int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);
			if (member.getMemberId() == memberId) {
				arrayList.remove(i);
				return true;
			}
		}*/
		Iterator<Member> ir = treeSet.iterator();
		while (ir.hasNext()) {
			Member member = ir.next();
			if (member.getMemberId() == memberId) {
				treeSet.remove(member);
				return true;
			}
		}

		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}

	public void showAllMembers() {
		/*for (Member member : arrayList) {
			System.out.println(member);
		}*/

		Iterator<Member> ir = treeSet.iterator();
		while (ir.hasNext()) {
			System.out.println(ir.next());
		}
	}
}
