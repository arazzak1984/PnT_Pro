package OOPs;

public class Capsul {

	private int ssn;
	private String dob;
	
	public int getSSN() {
		return ssn;
	}
	
	void setSSN(int ssn) {
		this.ssn=ssn;
	}
	
	public static void main(String[] args) {
		Capsul ob = new Capsul();
		ob.setSSN(45678934);
		
		System.out.println(ob.getSSN());

	}

}
