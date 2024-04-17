
import java.util.*;
import java.io.*;

class Demo extends ArrayList {

	public static void main(String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Elements to add in ArrayList in the format of name,age,sal");
		String name = br.readLine();
		StringTokenizer tk = new StringTokenizer(name,",");
		String uname = tk.nextToken();
		int age = Integer.parseInt(tk.nextToken());//enter the int
		float sal = Float.parseFloat(tk.nextToken());//enter the float
		ArrayList al = new ArrayList();
		al.add(uname);
		al.add(age);
		al.add(sal);
		System.out.println(al);

		for(Object info:al) {
		
			System.out.print(info);
		}
		System.out.println();

	}
}
