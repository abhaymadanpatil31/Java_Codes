import java.util.*;
class DataOverFlow extends RuntimeException {

	DataOverFlowException(String msg) {
	
		super(msg);
	}

}

class DataUnderFlowException  {

	DataUnderFlowException(String [] args) {
	
		super(msg);
	}
}

class ArrayDemo {

	public static void main(String [] args) {
	
		Scanner sc=new Scanner(System.in);
		int arr[] =new int[5];
		System.out.println("Please Enter valid data");
		System.out.printl("from 0 to 100 not below -0 and not above of 100");
		int data=sc.nextInt();
		for(int i = 0;i<arr.length;i++) {
		
			if(data<0)
		}

	}
}
