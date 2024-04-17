
interface Demo1 {
	
	default void fun() {
		
		System.out.println("In fun-Demo1");
	}
}

interface Demo2 {
	
	default void fun() {
		
		System.out.println("In fun-Demo2");
	}
}

class DemoChild implements Demo1,Demo2 {


	//public default fun() {
	//}
	//public default fun() {}
	//these are the method which came in inheitance and we are trying to print at single time and if you want to reomove these error then you have to override at least one method and that why i have written below code
	public void fun() {//if we not call by the parent child relation then call will be that own class method and not the inherited.
		
		System.out.println("In fun-DemoChild");
	}

}

class client {
	
	public static void main(String [] args) {
		
		DemoChild obj=new DemoChild();
		obj.fun();
	}
}
