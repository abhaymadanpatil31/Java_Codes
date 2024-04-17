
class Demo {
	static  int fun(int x,int y)  {
		System.out.println(x);
		System.out.println(y);
		x=x+20;
		y=y+70;
		System.out.println(x);
		System.out.println(y);
		return x;
		
	}
	
	
	
	public static void main(String ... args) {
		Demo obj=new Demo ();
		int a=obj.fun(10,32);
		System.out.println(a);

	}
}
