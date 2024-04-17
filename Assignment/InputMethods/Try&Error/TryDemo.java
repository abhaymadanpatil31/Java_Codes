import java.io.*;

class Try {
	public static void main(String [] args) throws IOException       { 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	       System.out.println("Enter the user value:");/*here i tried to take i/p from the user at the sop but it didnt worked so it is not valid now i am tryingin proper way*/
									  
       	       String n= br.readLine();
	       System.out.println("Enter the value of n="+n);
	}
}
