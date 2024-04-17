
import java.util.*;

class Employee {

	int empId = 0;
	String name = null;
	Employee(int empId,String name) {
	
		this.empId = empId;
		this.name = name;
	}

	public String toString() {
	
		return empId +" : "+ name;
	}
}

class Demo {

	public static void main(String[] args) {
	
		ArrayList al = new ArrayList();
		al.add(new Employee(23,"Kanha"));
		al.add(new Employee(33,"Rahul"));
		al.add(new Employee(22,"Ashish"));
		Collections.sort((al,obj1,obj2)-> {
		
			return ((Employee)obj1).name.comapareTo(((Employee)obj2).name);
		
			);
		};

		System.out.println(al);
	}
}
