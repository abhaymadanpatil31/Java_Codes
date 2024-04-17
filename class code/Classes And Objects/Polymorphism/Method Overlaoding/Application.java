import java.io.*;
class Parent {
	
	int x=10;
	static int y=23;

	void fun() {
		
		System.out.println("In Parent instance method");
		System.out.println("The value of x is :"+ x + "The value of y is :"+y );
		System.out.println("I am going to create applicaton which is accepting parameters from user at run time ");
	}

	int accept(int x,float y) {
	
		y=x+10;
		System.out.println("Your application has been succesfull,Thank you");
		return y;
	}

}

class Child extends Parent {

	int neglect(float a,float b) {
		
		a=b+22;
		System.out.println("the updated value of a is:"+a);
		return a;
	}
}

class client {

	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String [] args)throws IOException {
		
		Child obj=new Child();
		System.out.println("Give me two numbersin the format of int and float to do operation");
		int c=Integer.parseInt(br.readLine());
		float d=Float.parseFloat(br.readLine());
		obj.accept(c,d);

		System.out.println("Give me two numbers in the format of float and float");

		float r=Float.parseFloat(br.readLine());
		float s=Float.parseFloat(br.readLine());
		obj.neglect(r,s);
		

	}
}
