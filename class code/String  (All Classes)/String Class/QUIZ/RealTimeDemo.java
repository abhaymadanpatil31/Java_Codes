//Real time Example for static methods,non static methods,non static variable ,static variable. 
class RealTimeDemo {
	
		static String Book(String str) {
			
			String str1=str+"Bhagawat Gita";
			System.out.println(str1);
			return str1;
		}
		String ClassName(String str2) {
			
			String str3=str2+"class";
			System.out.println(str3);
			return str3;
		}
		static int a=10;
			int b=20;
				public static void main(String [] args) {
					
					System.out.println("You are in main Method");
					String str="class Book=";
					String str2="Class Name";
					RealTimeDemo  obj=new RealTimeDemo();
					String str4=obj.ClassName(str2);
					String str5=Book(str);
					System.out.println(str5);
					System.out.println(obj.a);
					System.out.println(obj.b);
				}
					
			
}
