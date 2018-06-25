package domain;

public class MemberBean {
	protected String userId, password, name, ssn, addr, phone, email, profile, regidate;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String uid) {
		this.userId = uid;
	}

	public String getRegidate() {
		return regidate;
	}

	public void setRegidate(String regidate) {
		this.regidate = regidate;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String pass) {
		this.password = pass;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "회원정보 [아이디:" + userId
				+", 비밀번호:" + password 
				+", 이름:" +	name 
				+", 주민번호:" + ssn 
				+", 주소:" + addr 
				+", 전화번호:" +	phone 
				+", 이메일:" + email +"]\n";
	}
}
