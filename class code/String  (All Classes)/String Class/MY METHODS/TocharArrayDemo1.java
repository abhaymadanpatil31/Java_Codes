import java.util.*;
class StringLenDemo {
	
	int mystrLen(String str,String str3) {
		char arr[]=str.toCharArray();
		int count =0;
		for(int i=0;i<arr.length;i++) {
			count++;
		}
		return count++;
	}
	
	public static void main(String []arr){
	
	Scanner sc=new Scanner(System.in); 
	System.out.println("Enter first String to get its Length");
	String str1=sc.next();
	System.out.println("Enter second String to get its length");
	String str2=sc.next();
	int len=myStrLen(str1,str2);
	if(myStrLen(str1)==myStrLen(str2)) {
		System.out.println("Both Strings are same ");
	}
	else {
		System.out.println("Both Strings are not equal");
	}
	}
}	
