
class Demo {

	public static void main(String[] args) {
	
		int count = 0;
		int prime = new List[];
		int comp = new List[];
		for(int i = 10; i<=20; i++) {
		
			for(int j = 1; j<=20; j++) {
			
				if(i%j == 0) {
				
					count++;
					comp = [i];
				}else {
				
					prime = [i];
				}
			}
			if(count<1) {
			
				for(int i = 1;i<prime.length-1;i++) {
				
					System.out.println("Prime :: "+prime[i]);
				}
			}else {
			
				for(int j = 1;j<comp.length-1;j++) {
				
					System.out.println("Compo ::"+compo[j]);
				}
			}
		}
	}
}
