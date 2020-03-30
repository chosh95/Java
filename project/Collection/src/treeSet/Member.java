package treeSet;

public class Member implements Comparable<Member> {
	private int MemberId;
	private String MemberName;
	public Member(int id, String name) {
		this.MemberId = id;
		this.MemberName = name;
	}
	public int getMemberId() {
		return MemberId;
	}
	public void setMemberId(int memberId) {
		MemberId = memberId;
	}
	public String getMemberName() {
		return MemberName;
	}
	public void setMemberName(String memberName) {
		MemberName = memberName;
	}
	public String toString() {
		return MemberId + " " + MemberName;
	}
	@Override
	public int compareTo(Member o) {
		return this.MemberId-o.MemberId;
	}
	@Override
	public boolean equals(Object obj) {
		Member tmp = (Member)obj;
		return this.MemberId == tmp.getMemberId();
	}	
}
