
class Parent {
	
	Object fun() {//Object return type liha
		
		System.out.println("In Parent fun");
		return "Abhay";
	}
}

class Child extends Parent {
	
	String fun() {//yethe error ala karan ki,Parent class madhil class retrun type ha Parent asto Child class madhil class return type cha ani tymule ithe pan parent-child relationship pahili jate. 
		
		System.out.println("in child");
		return "Abhay";
	}
}

class client {
	
	public static void main(String [] args) {
		
		Child ch=new Child();
		ch.fun();
	}
}
