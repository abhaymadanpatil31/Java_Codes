
import java.util.*;

class Employee {

	String empName = null;
	int sal = 0;

	Employee(String empName, int sal) {
	
		this.sal = sal;
		this.empName = empName;
	}

	public String toString() {
	
		return empName + sal;
	}
}

class SortByName implements Comparator<Employee> {

	public int compare(Employee e1, Employee e2) {
	
		return e1.empName.compareTo(e1.empName);
	}
}

class Client {

	public static void main(String[] args) {
	
		ArrayList al = new ArrayList();
		al.add(new Employee("Abhay",2000000));
		al.add(new Employee("Aniket",250000));
		al.add(new Employee("Om",200000));

		Collections.sort(al,new SortByName());
		System.out.println(al);
	}
}
