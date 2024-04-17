/*the adding methods and their errors , there are four method are mentioned  below
 * public abstract boolean add(E);
  public abstract boolean offer(E);
  public abstract void put(E) throws java.lang.InterruptedException;
  public abstract boolean offer(E, long, java.util.concurrent.TimeUnit) throws java.lang.InterruptedException;*/

import java.util.concurrent.*;
import java.util.*;//this for ArrayList for use of drainTo();

class BlockingQueueDemo {

	public static void main(String[] args)throws InterruptedException {
	
		BlockingQueue bQueue = new ArrayBlockingQueue(3);//size is due to blockingQ is bounded and doent not allow us to expand it , it is like normal array when we try to give fixed sized data then we cant expand and if we try it then it gives error of ArrayIndexOutOfBound

		bQueue.offer(23);
		bQueue.offer(43);
		bQueue.offer(53);
		System.out.println(bQueue);

		bQueue.offer(33);//due to limit of 3 values this data cant be added but if try to add with put method then it gives deadlock
	//	bQueue.put(32);//specifically put method la deadlock code hoto in adding the values and in removing the values take() method makes code deaklock on the terminal, 
		System.out.println(bQueue);//there is error if you remove comment of put method 
		//and some method,- throws the unreported exception InterruptedException; must be caught or declared to be thrown
		bQueue.take();
		System.out.println(bQueue);//it will remove the 23 bc queue work like fifo 
		bQueue.offer(3,5,TimeUnit.SECONDS);
		System.out.println(bQueue);
		bQueue.poll();
		System.out.println(bQueue);
		bQueue.poll(5,TimeUnit.SECONDS);
		System.out.println(bQueue.remainingCapacity());
		bQueue.add(44);
		//System.out.println(bQueue.remove(3,44)); the error is actual and formal but if you see there are three different remove () method who get call at single time
		System.out.println(bQueue);
		ArrayList al = new ArrayList();
		bQueue.drainTo(al);
		System.out.println("ArrayList"+al);
		bQueue.drainTo(al,0);
		System.out.println(al+"new ArrayList");
		


	}
}
