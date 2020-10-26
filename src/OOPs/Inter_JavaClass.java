package OOPs;

public class Inter_JavaClass implements Interface_Concept{

	public static void main(String[] args) {
		
		Inter_JavaClass obj = new Inter_JavaClass();
		obj.QA();
		obj.Selenium();
		

	}

	@Override
	public void QA() {
		System.out.println("Tanvir bhai is experienced QA Engineer");
		
		
	}

	@Override
	public void Selenium() {
		
		System.out.println(" Dedar is learning selenium to make 100k");
		
		
	}

}
