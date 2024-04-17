
class Employee {
	
	int empId=10;
	String name="Kanha";
	static int y=20;
	void empInfo() {
		
		System.out.println("Id ="+empId);
		System.out.println("Name = "+name);
		System.out.println("Y "+y);
	}
}
class MainDemo {
	
	public static void main(String [] args) {
		
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		emp1.empInfo();
		emp2.empInfo();
		System.out.println("----------");
		emp1.empId=20;
		emp1.name="Shashi";
		emp1.y=3000;
		System.out.println("Updated by first  Object but change is only for particular="+emp1.empId);
		System.out.println("updated by first object but change only for paritcular="+emp1.name);
		System.out.println("updated by first object but that change will be for every obj"+emp1.y);
	}
}
