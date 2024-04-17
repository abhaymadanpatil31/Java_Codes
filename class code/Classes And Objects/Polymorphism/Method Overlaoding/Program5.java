
class Demo {
	
	void fun(int x,float y) {
		
		System.out.println("int-float para");
	}

	void fun(float x,int y) {
		
		System.out.println("float-int para");
	}

}

class client {
	
	public static void main(String [] args) {
		
		Demo obj=new Demo();
		obj.fun(10,10);/*here i passed two integer as an argument but in method there is int and float and when time comes to pass the integer then complier get confused because of first int can be stored but second one is float which cant be passed as integer because same condition in other method and thats why passed int can fit in any mentioned method and thats why error comes */
	}
}
