import java.io.*;

class IfElseDemo {
	public static void main(String [] args)throws IOException {
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the temperature of Patient:");
	float temp= Float.parseFloat(br.readLine());
	if(temp>37) {
		System.out.println("Patient have high temperature");
	}
	else if( temp==37) {
		System.out.println("Patient is Normal");
	}
	else {
		System.out.println("Patient have lower temperature");
	}
	}
}
