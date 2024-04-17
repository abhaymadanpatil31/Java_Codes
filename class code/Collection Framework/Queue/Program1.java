
import java.util.*;

class PQueueDemo {

	public static void main(String[] args) {
	
		PriorityQueue pq = new PriorityQueue();
		pq.offer(22);
		pq.offer(33);
		pq.offer(43);
		System.out.println(pq);
		pq.offer("Kanha");
		pq.offer("Ashish");
		pq.offer("Rahul");
		pq.offer("Kanha");
		pq.offer("Badhe");
		System.out.println(pq);
		/*the working of PriorityQueue is based on Heap Data structres and sir said they will teach after one month in dsa and that ds uses binaryTree algorithm*/

	}
}
