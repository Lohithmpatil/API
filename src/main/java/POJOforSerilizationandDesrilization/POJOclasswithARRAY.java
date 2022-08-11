package POJOforSerilizationandDesrilization;

public class POJOclasswithARRAY {
	//step-1 intialize the global variable

	String ename;
	String id;
	int[] phno;
	String[] email;
	String adderss;
	
	//create a constructor 
	public POJOclasswithARRAY(String ename, String id, int[] phno, String[] email, String adderss) {
		this.ename = ename;
		this.id = id;
		this.phno = phno;
		this.email = email;
		this.adderss = adderss;
	}

	

	public POJOclasswithARRAY() {
	}



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

	public String getAdderss() {
		return adderss;
	}

	public void setAdderss(String adderss) {
		this.adderss = adderss;
	}
	
	
}
