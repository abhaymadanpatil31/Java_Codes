
import java.io.*;
import java.util.*;

class ListDemo extends ArrayList {

	public static void main(String[] args) {
	
		ArrayList al = new ArrayList();
		System.out.println("Enter the Info Electroral Bonds");
		Scanner sc = new Scanner(System.in);
		int totalBonds = sc.nextInt();
		float totalMoney = sc.nextFloat();
		al.add(totalBonds);
		al.add(totalMoney);
		System.out.println(al);
	}
}
