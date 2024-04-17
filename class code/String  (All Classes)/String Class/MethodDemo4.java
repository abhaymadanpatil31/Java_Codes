import java.util.*;


class MethodDemo {
	void add(int a,int b){
		int add = a+b;
			System.out.println("Addition of given values="+add);
	}
	void sub(int a,int b) {
		int sub = a-b;
			System.out.println("Substraction of given values="+sub);

	}
	void mult(int x,int y) {
		int mult=x*y;
			System.out.println("Multiplication of given values="+ mult);
	}
	void div(int z,int r) {
		int div= z/r;
			System.out.println("Division of given values are="+div);
	}
	
	public static void main(String [] abhay) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter values:");
		int a= sc.nextInt();
		int b= sc.nextInt();
			MethodDemo obj=new MethodDemo();
			obj.add(a,b);
			obj.sub(a,b);
			obj.mult(a,b);
			obj.div(a,b);

	
	} 
}
