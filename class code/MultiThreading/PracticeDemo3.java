

class Demo implements Runnable {

	public void run() {
	
		Thread t = Thread.currentThread();
		
		System.out.println(t.getPriority());//5
		System.out.println(t);//Thread-[ans]
		t.setPriority(7);//7 will be replace old priority
		
		System.out.println(t.getPriority());//7
	}
}
class MyClass extends Thread {

	public void run() {
	
		Thread t = Thread.currentThread();
		t.getPriority();//5
		t.setPriority(10);//10 will repacce 5
		System.out.println(t.getPriority());//10
		Demo obj = new Demo();
		Thread tm = new Thread(obj);
		tm.start();
		Thread t1 = Thread.currentThread();		
		System.out.println(t.getPriority());
		tm.setPriority(10);
		
		System.out.println(t.getPriority());//10
	}
}

class Client {

	public static void main(String[] arfs) {
	
		MyClass mc = new MyClass();
		mc.start();
		System.out.println(mc+"Only mc is printed");//adress has to print but it prints the ThreadGroup
		Thread t = Thread.currentThread();	
		System.out.println(t.getPriority());//5
		t.setPriority(8);

		System.out.println(t.getPriority());//8
	}
}
