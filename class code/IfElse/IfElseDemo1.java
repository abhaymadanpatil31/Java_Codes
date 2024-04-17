import java.io.*;

class IfElseDemo {
	public static void main(String [] args)throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the age of candidate:");
		int age= Integer.parseInt(br.readLine());
                if(age>=300) {
			System.out.println("He is not Human ,Please check his Adhar card and Voter card detail");
		}


		else if(age<=18 ) {
			System.out.println("He is not allowed to vote ");
		}
		
		
		else {
			System.out.println("He is allowed to vote");
		}
	}
}
