package sample0510;

class Employee {
	String name;
	int empNo;

	public Employee() {
		this("±ÇÀ²", 1234);
	}

	public Employee(String name, int empNo) {
		this.name = name;
		this.empNo = empNo;
	}
	
	public Employee(Employee e) {
		this.name = e.name;
		this.empNo = e.empNo;
		System.out.println(e.name + ", " + e.empNo);
	}

	void working() {
		System.out.println(this.name + ", " + this.empNo);

	}
	
	void working(Employee e) {
		this.name = e.name;
		this.empNo = e.empNo;
		System.out.println(this.name + ", " + this.empNo);	
	}
}

public class sample04 {

	public static void main(String[] args) {
		Employee emp = new Employee("È«±æµ¿",40);
		emp.working();
		Employee emp2 = new Employee();
		emp2.working();
		Employee emp3 = new Employee(emp2);
		emp3.working();
		emp3.working(emp2);
		

	}

}
