import java.io.*;

class IfElseDemo6 {
	public static void main(String [] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in)); 
		System.out.println("Enter the Month");
		System.out.println("Enter the year");
		int month= Integer.parseInt(br.readLine());
		int year = Integer.parseInt(br.readLine());
                
		if(year%4==0|| month==2) {
			System.out.println("This year is leap year");
			System.out.println("February have 29 days this year");

		}	
		
			else if(month==1||3||5||7||8||10||12) {
			System.out.println("This Month having 31 days"+month);

		}
		else if(month=4||6||9||11) {
			System.out.println("This month having 30 days");
		}
		
		else  {
			System.out.println("February have 28 days and 29 days if that year is leap year"+month);
		}
	}
}
