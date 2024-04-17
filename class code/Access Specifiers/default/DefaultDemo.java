
class DefaultDemo {
	
	int a=30;//here before int default access specifier available by Default and his scope is only in one folder 
	String str="Abhay";//same as above mentioned comment
	void fun() {
		
		System.out.println(a);
		System.out.println(str);
		String str1="Core2Web";
		System.out.println(str1);
	}
}
/*class DefaultPractice {
	
	public static void main(String [] args) {
		
		DefaultDemo obj=new DefaultDemo();
		obj.fun();
	}
}this class is made on other file and from that file also i am able to run the program succesfully but it is avaible in one folder on which our program body is available*/
