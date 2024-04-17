import java.io.*;//try to correct it.

class Home {

	public void run() {
		
		int i=10;
		float f=23.4f;
		System.out.println("int value:"+i+"Float value :"+f);
		
	}

	void fun(int a,int b) {
	
		int c=a+b;
		System.out.println(c);
	}

}

class DemoChild extends Home implements Runnable {


	 public void run() {
	
		System.out.println("In Run"+Thread.currentThread().getName());
	}
}

class ThreadDemo {

	public static void main(String [] ags) {
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		DemoChild obj=new DemoChild();
		Thread t=new Thread(obj);
		t.start();
		Home h=new Home();
		try{
		int s=IntegerparseInt(br.readLine());
		int g=Integer.parseInt(br.readLine());
		}catch(IOException ie) {
		
			System.out.println("Please throw the IOException");
		}
		h.fun(s,g);
	}
}
