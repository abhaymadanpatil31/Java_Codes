
class MyThread extends Thread {


}

class Test {

	public static void main(String [] args) {
	
		MyThread obj = new MyThread();
		obj.start();
		
		for(int i = 0; i<10; i++) {
		
			System.out.println(obj.getThreadGroup());
		}
	}
}
