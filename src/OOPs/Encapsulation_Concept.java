package OOPs;

public class Encapsulation_Concept {

	private String dedarbhainame;
	private int dedarsalary;

	public String getDedarbhainame() {
		return dedarbhainame;
	}

	public void setDedarbhainame(String dedarbhainame) {
		this.dedarbhainame = dedarbhainame;
	}

	public int getDedarsalary() {
		return dedarsalary;
	}

	public void setDedarsalary(int dedarsalary) {
		this.dedarsalary = dedarsalary;
	}
	
	public static void main(String[] args) {
		Encapsulation_Concept obj = new Encapsulation_Concept();
		obj.setDedarbhainame("Md Dedar Khan");
		System.out.println("This is dedar bhai name: "+obj.getDedarbhainame());
		
		obj.setDedarsalary(30000);
		System.out.println("Salary of Dedar bhai Monthly: "+obj.getDedarsalary());


	}

}
