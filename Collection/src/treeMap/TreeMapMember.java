package treeMap;

import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapMember {
	private TreeMap<Integer, Member> treeMap;
	public TreeMapMember() {
		treeMap = new TreeMap<Integer,Member>();
	}
	public void addMember(Member member) {
		treeMap.put(member.getMemberId(), member);
	}
	public boolean removeMember(int MemberId) {
		if(treeMap.containsKey(MemberId)) {
			treeMap.remove(MemberId);
			return true;
		}
		return false;
	}
	public void showAll() {
		Iterator<Integer> it = treeMap.keySet().iterator();
		while(it.hasNext()) {
			int k = it.next();
			Member tmp = treeMap.get(k);
			System.out.println(tmp);
		}
	}
	
}
