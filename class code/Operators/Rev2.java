
class Revesion extends Thread {

	public void run() {
	
		int x=10;
		int y=20;
		int ans=++x + ++y + ++x;
		System.out.println(ans);
	}
}

class ThreadDemo {

	public static void main(String [] args) {

		Revesion r = new Revesion();
		r.start();
		System.out.println("In Main:"+Thread.currentThread().getName());	
	}
}
