//*****
class Demo {
	
	void fun(Object obj) {
		
		System.out.println("object");
	}

	void fun(String str) {
		
		System.out.println("String");
	}
}

class client {
	
	public static void main(String [] args) {
		
		Demo obj=new Demo();
		obj.fun("Core2Web");
		obj.fun(new StringBuffer("Core2Web"));
		obj.fun(null);//exactly matches to String method but why i dont know but i will
	}
}
