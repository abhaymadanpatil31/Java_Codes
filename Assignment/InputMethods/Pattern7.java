import java.io.*;

class PatternDemo {
	public static void main(String [] abhay)throws IOException {
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	int n= Integer.parseInt(br.readLine());
	
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	

	}
	for (int i=n;i<0;i--) {
		for(int j=1;j<i;j++){
		
			System.out.print("*");
		}
		System.out.println();
	}
	}
	}


