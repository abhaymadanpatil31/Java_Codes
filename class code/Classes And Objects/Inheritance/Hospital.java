import java.io.*;
class Hospital {
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	Hospital() {
	
		System.out.println("Inside the Hospital Constructor");
	}

	void fun() {
		
		System.out.println("Patient name is Akshada");
	
		System.out.println("Enter the Patient name:");
	   	String pname=br.readLine();
		System.out.println("You have entered Patient name is:"+pname);

	}
	


	
}

class Accountant extends Hospital {
	
	int bill=3000;
	Accountant() {
		
		System.out.println("You Are in Accountant constructor");
	}

	void gun() {
	
		System.out.println("Akshada overall bill amount is : "+bill);
	}


	void Medical() throws IOException{
		
		System.out.println("Enter the Medical Expenditure");
		int medbill=Integer.parseInt(br.readLine());
		System.out.println("You are generated medbill of amount:"+medbill);
	}
}

class client {
	
	public static void main(String [] args) throws IOException  {
		
		Accountant obj=new Accountant();
		obj.fun();
		obj.gun();
		obj.Medical();
	}

}
