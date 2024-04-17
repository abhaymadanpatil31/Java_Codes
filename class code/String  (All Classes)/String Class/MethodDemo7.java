
 class Demo {
 	void fun(float x) {
		System.out.println(x);
	}
		public static void main(String [] abhay) {
			Demo obj=new Demo();
			obj.fun(10);
			obj.fun(10.7);
			obj.fun(10.8f);
			obj.fun('Z');
			obj.fun(true);
		}
 }
