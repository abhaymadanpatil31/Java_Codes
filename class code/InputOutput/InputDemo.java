
 import java.io.*;
 class Inputdemo {
 	public static void main(String [] a) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br1= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a player name");
		String name = br.readLine();	
		br.close();
		System.out.println("Enter Score");
		float score= Float.parseFloat(br1.readLine());
		System.out.println("Enter a Avg");
		float avg =Float.parseFloat(br.readLine());

		System.out.println("Name of player is:"+name);
		System.out.println("Average of player is:"+ avg);
	}
 }
