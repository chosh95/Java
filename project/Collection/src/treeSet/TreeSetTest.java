package treeSet;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("abc");
		treeSet.add("def");
		treeSet.add("acb");
		for(String tr : treeSet) {
			System.out.println(tr);
		}
	}
}
