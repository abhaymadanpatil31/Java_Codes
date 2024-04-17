//*****
class Parent {
	
	static void fun() {
		
		System.out.println("In Parent fun");
	}
}

class Child extends Parent {
	
	static void fun() {//static madhe ekach static method asun chalat nahi donhi pan asayla pahijet jar ek jar dili tar compiler ti method static ahe asa error dete , but hyacha arth ha nahi ki donhi kade static lihun code run zalymule ovrriding method hi concept static madhe sudha available ahe tar hya conept la method hidding ase mhntat. i.e jyacha cha refernce asel tyachich method call hoil to instance method sarakha run time la object chi method call nahi karnar karan ki to static ahe jo compile time lach output kay yenar ahe he tharvun thevto ,to run time cha vat baghat nahi.
		
		System.out.println("In Child fun");
	}
}

class client {
	
	public static void main(String [] args) {
		
		Child ch=new Child();
		ch.fun();//op-In Child Fun.
	}
}
