package exception;

public class IDFormatTest {

	private String userId;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) throws IDFormatException {
		if(userId == null) {
			throw new IDFormatException("Id cant` be null");
		}
		else if(userId.length() < 8 || userId.length() > 20) {
			throw new IDFormatException("Id should be in range of 8 to 20"); 
		}
		this.userId = userId;
	}

	public static void main(String[] args) {
		IDFormatTest idTest = new IDFormatTest();
		
		String myId = null;
		try {
			idTest.setUserId(myId);
		}catch(IDFormatException e) {
			System.out.println(e);
		}
		
		myId = "1234567";
		try {
			idTest.setUserId(myId);
		}catch(IDFormatException e) {
			System.out.println(e);
		}
	}

}
