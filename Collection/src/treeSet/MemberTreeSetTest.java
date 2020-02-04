package treeSet;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet member = new MemberTreeSet();
		Member kim = new Member(100,"abc");
		Member lee = new Member(200,"abd");
		Member tmp = new Member(100,"asd");
		member.addMember(kim);
		member.addMember(lee);
		member.addMember(tmp);
		member.showAll();
	}
}
