package POJOforSerilizationandDesrilization;

public class EmployeeDeatails {
	
	
	//step-1 :Declare all the global variable as global
	
	String ename;
	String id;
	int phno;
	String email;
	String address;
	
	
	//step-2 : use constructor to intialize
	public EmployeeDeatails(String ename, String id, int phno, String email, String address) {
		this.ename = ename;
		this.id = id;
		this.phno = phno;
		this.email = email;
		this.address = address;
	}
	
	//constructor created in desearilization 
	
	public EmployeeDeatails() {
	}



	//step-3 : create getters and setters

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getPhno() {
		return phno;
	}

	public void setPhno(int phno) {
		this.phno = phno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
}
	
	


