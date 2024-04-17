import java.util.Scanner;

class DataOverFlowException extends RuntimeException {

	DataOverFlowException(String msg) {
	
		super(msg);
	}
}

class DataUnderFlowException extends RuntimeException {
	 
	DataUnderFlowException(String msg) {
	
		super(msg);
	}

}

class Demo {

	public static void main(String [] args) {
	
		int arr[] = new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter data between 0 to 100");
		System.out.println("Note-0<element<100");

		for(int i = 0;i<arr.length;i++) {
		
			int data=sc.nextInt();
			if(data<0) {
			
				throw new DataUnderFlowException("Mitra Data 0 pekshya lahan ahe tu kay yeda ahes kay ");
			}

			if(data>100) {
			
			      	throw new DataOverFlowException("Mitra Data 100 pekshya jyast ahe ye vedya");
			}
			arr[i]=data;
		}

		for(int i = 0;i<arr.length;i++) {
		
			System.out.println(arr[i]+" ");
		}
	}
}
