package treeMap;

import java.util.TreeMap;

public class TreeMapMemberTest {

	public static void main(String[] args) {
		TreeMapMember treemap = new TreeMapMember();
		Member kim = new Member(100,"kim");
		Member lee = new Member(200,"lee");
		Member park = new Member(300,"park");
		treemap.addMember(kim);
		treemap.addMember(lee);
		treemap.addMember(park);
		
		treemap.showAll();
		
		treemap.removeMember(110);
		
		treemap.showAll();
	}

}
