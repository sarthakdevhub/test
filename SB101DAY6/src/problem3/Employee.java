package problem3;

public class Employee {
	Student s;
	
	public Employee(Student s) {
		super();
		this.s = s;
	}


	public Student getS() {
		return s;
	}

	public void setS(Student s) {
		this.s = s;
	}


	@Override
	public String toString() {
		return "Employee [" + s + "]";
	}


	
	
}
