import java.io.*;

class Employee {
		
		int empId=10;
		String name="Abhay";
		static String companyName="Infosys";
		
		void empInfo() {
			
			System.out.println(empId);
			System.out.println(name);
			System.out.println(companyName);
		}



		
}
class MainDemo {
	
	public static void main(String [] args)throws IOException {
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		System.out.println("Old Data");
		emp1.empInfo();
		emp2.empInfo();
		System.out.println("New data in emp1 only if you want to emp2 then change it by calling its Object please :");
		System.out.println("Please Enter new Employee Id:");
		emp1.empId=Integer.parseInt(br.readLine());
		System.out.println("Please Enter Emplyee name");
		emp1.name=br.readLine();
		emp1.empInfo();
		emp2.empInfo();
		System.out.println("Thank for Updating Employee data:");
	}
}
