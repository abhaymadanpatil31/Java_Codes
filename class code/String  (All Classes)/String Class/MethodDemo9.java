
class Demo {
	int fun(int a) {
		int b= a+10;
		System.out.println(b);
		return b+10;
	}
	
	
	public static void main(String [] abhay) {
		Demo obj=new Demo();
		int c=obj.fun(10);
		System.out.println(c);

		
	}
}


