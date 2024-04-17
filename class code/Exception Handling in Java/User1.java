import java.util.Scanner;
class DataOverFlowException extends RuntimeException {
	
	DataOverFlowException(String msg) {
	
		super(msg);
	}

}
class DataUnderFlowException extends RuntimeException {

	DataUnderFlowException(String msg) {
	
		super(msg);//we have send received messege to Throwable class with that we cant print msg
	}
}



class ArrayDemo {

	public static void main(String [] arhs) {
	
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer value");
		System.out.println("Note -0<element<100");
		
		for(int i = 0; i<arr.length;i++) {
		
			int data=sc.nextInt();
			if(data<0) {
			
				throw new DataUnderFlowException("Mitra Data 0 peksha lahan ahe");
			}
			if(data>100) {
			
				throw new DataOverFlowException ("Mitra Data 100 peksha jyast ahe");
			}
			
			arr[i]=data;
		}

		for(int i = 0;i<arr.length;i++) {
		
			System.out.println(arr[i]+" ");
		}
	}
}
