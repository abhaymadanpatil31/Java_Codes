import java.io.*;
import java.util.*;

class IfElseDemo {
	public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any two values"); 
	int a= sc.nextInt();
	int b= sc.nextInt();
	if(a==b) {
		System.out.println("Both are equal");
	}
	else if(a>b) {
		System.out.println("a is greater than b");
	}
	else {
		System.out.println("b is greater than a");
	}
	}
}
