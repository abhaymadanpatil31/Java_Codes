import java.util.*;

class MethodDemo {
	int prime(int N) {
	int count=0;
	
	int N=sc.nextInt();
		for(int i =1;i<=N;i++ ) {
			if(N%i==0) {
		    count++;

			}
			else if(count==2) {
				System.out.println("It is prime number");
			}
			else {
			System.out.println("it is not prime number");
			}

		}
	}

	public static void main(String [] abhay) {
		Scanner sc= new Scanner(System.in);
	       MethodDemo obj=new MethodDemo();
	       obj.prime(N);	       
	}
}
