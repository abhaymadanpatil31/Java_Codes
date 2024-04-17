
import java.util.concurrent.*;

class Producer implements Runnable {

	BlockingQueue bQueue;
	Producer(BlockingQueue bQueue) {
	
		this.bQueue = bQueue;
	}

	public void run() {
	
		for(int i = 0; i<=7; i++) {
		
			try {
			
				bQueue.put(i);
				System.out.println("Produce"+i);
			}catch(InterruptedException ie) {
			
			}

			try {
			
				Thread.sleep(500);
			}catch(InterruptedException ie) {
			
			}
		}
	}
}

class Consumer implements Runnable {

	BlockingQueue bQueue = null;
	Consumer(BlockingQueue bQueue) {
	
		this.bQueue = bQueue;
	}

	public void run() {
	
		for(int i = 0; i<=7; i++) {
		
			try{
			
				bQueue.take();
				System.out.println("Consume:"+i);
			}catch(InterruptedException ie) {
			
			}

			try {
			
				Thread.sleep(700);
			}catch(InterruptedException ie) {
			
			}
		}
	}
}
class ProducerConsumer {

	public static void main(String[] args) {
	
		BlockingQueue bQueue = new ArrayBlockingQueue(3);
		Producer produce = new Producer(bQueue);
		Consumer consume = new Consumer(bQueue);
		Thread threadproduce = new Thread(produce);
		Thread threadconsume = new Thread(consume);
		threadproduce.start();
		threadconsume.start();
	}
}
