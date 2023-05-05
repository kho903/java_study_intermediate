package chap03.ch06;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
	private HashSet<Member> arrayList;

	public MemberHashSet() {
		arrayList = new HashSet<>();
	}

	public void addMember(Member member) {
		arrayList.add(member);
	}

	public boolean removeMember(int memberId) {
		/*for (int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);
			if (member.getMemberId() == memberId) {
				arrayList.remove(i);
				return true;
			}
		}*/
		Iterator<Member> ir = arrayList.iterator();
		while (ir.hasNext()) {
			Member member = ir.next();
			if (member.getMemberId() == memberId) {
				arrayList.remove(member);
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

		Iterator<Member> ir = arrayList.iterator();
		while (ir.hasNext()) {
			System.out.println(ir.next());
		}
	}
}
