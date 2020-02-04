package treeMap;

public class Member {
	private int MemberId;
	private String MemberName;
	public Member() {
		
	}
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
}
