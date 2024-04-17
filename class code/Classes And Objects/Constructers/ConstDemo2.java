
class Core2Web {
	
	Core2Web() {
		
		System.out.println("In core2Web");
	}
	
	int x=20;
	public static void main(String [] args) {
	
		System.out.println("In main");
		//System.out.println(x);if you try to access directly then it will show error because this is non static global varible which get stored in constructer and constructer get stored on object and here  we not initiated object and that why we have to intialize the object  
		Core2Web obj =new Core2Web();//when we initialise the object then constructer will get call automatically
		int a=obj.x;
		System.out.println(a);
	}
}
