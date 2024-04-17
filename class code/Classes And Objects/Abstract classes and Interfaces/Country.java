
interface India {

	String str="India is my country";
	static void india() {
		
	
	
		
		System.out.println(India.str);
	}
}

interface Maharashtra {

	System.out.println(India.str);
	void districts();
}

class DemoChild implements India,Maharashtra {

	public void districts() {
	
		System.out.println("Maharashtra have 36 districts");
	}
		
	

}

class client {

	public static void main(String [] args) {
	
		DemoChild obj=new DemoChild();
		obj.districts();
	}
}
