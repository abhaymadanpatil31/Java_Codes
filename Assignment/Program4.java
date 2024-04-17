import java.io.*;
class SBI {

	int security(int pass) {
	
		System.out.println("Security policy of sbi is Strong");
		if(pass>=7) {
		
			System.out.println("Please Enter the Strong password");
			return 0;
		}else {
		
			System.out.println("Strong Password!");
			if(pass == 0000000000){
			
				System.out.println("Please dont enter the Same Numbers");
			}
		}
		return -1;
	}

	public static void main(String [] args) throws IOException{
	
		SBI obj = new SBI();
		System.out.println("Entre the Password from 4 to 11 range ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int pass = Integer.parseInt(br.readLine());
		obj.security(pass);
	}
}
