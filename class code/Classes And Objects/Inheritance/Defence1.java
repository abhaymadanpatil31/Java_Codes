
class Defence {
	

	
	String str="we are for Protection of India";
	 Defence() {
		
		System.out.println("Indias Defence Budget is 78 billion Dollars ");
		
	}
	
}

class Army extends Defence {
	


	void infantry_regiment() {
		
		String str="Maratha Light Infantry";
		String str1="Bihar Regiment";
		String str2="Parachute Regiment";
		
		
		System.out.println(str);
		System.out.println(str1);
		
		System.out.println(str2);	
	}

	Army() {
	
		System.out.println(super.str);
	}
}

class client {
	
	public static void main(String [] args) {
		
		Army obj=new Army();
		obj.infantry_regiment();
	}
}
