import java.io.*;
class OTPGen {

	int otp(int size,int arr[])throws IOException{
	
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		if(size<0) {
		
			System.out.println("Enter the Valid Number");
			return 0;
		}else if(size>0 && size<2) {
		
			System.out.println("Enter the OTP you need");
			int otp1 = Integer.parseInt(br1.readLine());
			int otp2 = Integer.parseInt(br1.readLine());
			arr[0] = otp1;
			arr[1] = otp2;
		}
		return -1;
	}
	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Number Of OTP you need!");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		OTPGen obj = new OTPGen();
		obj.otp(size,arr);
	}	
}
