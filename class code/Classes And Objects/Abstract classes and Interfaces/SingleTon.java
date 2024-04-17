
class singleton {
	
	static singleton obj=new singleton();
       private singleton() {
       	
	       System.out.println("Constructor");
       }
	static singleton getobject() {
		
		return obj;
	}	
}

class client {
	
	public static void main(String [] args) {
		
		singleton obj1=singleton.getobject();
		System.out.println(obj1);//same address

		singleton obj2=singleton.getobject();
		System.out.println(obj2);//same address

		singleton obj3=singleton.getobject();
		System.out.println(obj3);//same address
		
	}
}
