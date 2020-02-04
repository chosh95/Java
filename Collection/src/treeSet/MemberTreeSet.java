package treeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
	private TreeSet<Member> treeset;
	
	public MemberTreeSet() {
		treeset = new TreeSet<Member>();
	}
	
	public void addMember(Member member) {
		treeset.add(member);
	}
	
	public boolean removeMember(int memberId) {
		Iterator<Member> it = treeset.iterator();
		while(it.hasNext()) {
			Member tmp = it.next();
			if(tmp.getMemberId()==memberId) {
				treeset.remove(tmp);
				return true;
			}
		}
		return false;
	}
	
	public void showAll() {
		for(Member member : treeset) {
			System.out.println(member);
		}
	}
	
	
}
