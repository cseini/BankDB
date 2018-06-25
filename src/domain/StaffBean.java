package domain;

public class StaffBean extends MemberBean{
	protected String accessNum;

	public String getAccessNum() {
		return accessNum;
	}

	public void setAccessNum(String accessNum) {
		this.accessNum = accessNum;
	}
	@Override
	public String toString() {
		return "회원정보 [아이디:" + userId
				+", 비밀번호:" + password 
				+", 이름:" +	name 
				+", 주민번호:" + ssn 
				+", 주소:" + addr 
				+", 전화번호:" +	phone 
				+", 이메일:" + email 
				+", 접근번호:"+accessNum+"]\n";
	}
}
