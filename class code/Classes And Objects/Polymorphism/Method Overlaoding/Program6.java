//*****
class Demo {
	
	void fun(String str) {
		
		System.out.println("String");
	}

	void fun(StringBuffer str1) {
		
		System.out.println("StringBuffer");
	}
}

class client {
	
	public static void main(String [] args) {
		
		Demo obj=new Demo();
		obj.fun("Core2Web");//String
		obj.fun(new StringBuffer("Core2Web"));
		obj.fun(null);//Ambiguity because of both of class are  now addressing same pointer where null is pointer because i passed string which are exactly matched to respective class but when i pass null then that null is exactly mathces both of them and thats why error comes
	}
}
