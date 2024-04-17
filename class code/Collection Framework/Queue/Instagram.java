
import java.util.concurrent.*;

class Vk implements Runnable {

	BlockingQueue bq = null;
	Vk(BlockingQueue bq) {
	
		this.bq = bq;
	}

	public void run() {
	
		for(int i = 0; i<7; i++) {
		
			try {
			
				bq.put(i);
				System.out.println("Reels by Virat kohli:"+i);
			}catch(InterruptedException ie) {
			

			}

			try {
			
				Thread.sleep(500);
			}catch(InterruptedException ie) {
			
			}
		}
	}
}

class Ms implements Runnable {

	BlockingQueue bq;
	Ms(BlockingQueue bq) {
	
		this.bq = bq;
	}

	public void run() {
	
		for(int i = 0; i<7; i++) {
		
			try {
			
				bq.take();
				System.out.println("Reels are inspiring"+i);
			}catch(InterruptedException ie) {
			
				
			}
		}
	}
}
class Instagram {

	public static void main(String[] args) {
	
		BlockingQueue bq = new ArrayBlockingQueue(3);
		Vk obj1 = new Vk(bq);
		Ms obj2 = new Ms(bq);
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.start();
		t2.start();
	}
}
