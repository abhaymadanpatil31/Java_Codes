
class BadThreads {

	static String mes;

	private static class Collector extends Thread {
	
		public void run() {
		
			try {
			
				sleep(1000);
			} catch(InterruptedException ie) {
			
				mes = "mery do eat oats";
			}
		}

	}
}	
class ThreadDemo {
		
	
		public static void main(String[] args )throwsInterruptedException {
		
			mes = "Mery do not eat oats";
			Thread.sleep(2000);
			System.out.println(mes);
		}

}


