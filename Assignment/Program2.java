import java.util.*;
class OTP {

	int otp(int data){
	
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		System.out.println("Please Enter the OTP you have get");
		int val = sc.nextInt();
		if(data == val) {
		
			System.out.println("Verified");
			flag = true;
		}else {
		
			System.out.println("Not Verified");
		}

		if(flag == true) {
		
			System.out.println("You are allowed to change or upgrade");
		}else {
		
			System.out.println("You are not system person you are Not Allowed to change the System");
		}
		return -1;
	}
	public static void main(String[] args) {
	
		OTP obj = new OTP();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the OTP");
		int val = sc.nextInt();
		int ret = obj.otp(val);
		if(ret == -1) {
		
			System.out.println("Operation Done");
		}
	}
}
