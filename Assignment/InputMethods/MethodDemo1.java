import java.util.*;
class Method {
	
	void fun(){
		System.out.println("In non parametrised fun method");
		this.fun(212.2f);
	
	void fun(float x) {
			System.out.println("In float method");
			Scanner sc=new Scanner(System.in);
			System.out.println("User value");
			int c= sc.nextInt();
	}
	}

	public static void main(String [] args) {
		Method obj=new Method();
		obj.fun();
	//	obj.fun(22.21f);
		/*Scanner sc= new Scanner (System.in);
		System.out.println("user value");
		int c= sc.nextInt();*/
	}
}

