package POJOforSerilizationandDesrilization;

public class EmployeeObjectWithArray {
	String ename;
	String eid;
	int[] phno;
	String[] email;
	String address;
	Object friend;
	public EmployeeObjectWithArray(String ename, String eid, int[] phno, String[] email, String address,
			Object friend) {
		this.ename = ename;
		this.eid = eid;
		this.phno = phno;
		this.email = email;
		this.address = address;
		this.friend = friend;
	}
	
	
	public EmployeeObjectWithArray() {
	}


	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public int[] getPhno() {
		return phno;
	}
	public void setPhno(int[] phno) {
		this.phno = phno;
	}
	public String[] getEmail() {
		return email;
	}
	public void setEmail(String[] email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Object getFriend() {
		return friend;
	}
	public void setFriend(Object friend) {
		this.friend = friend;
	}

}
