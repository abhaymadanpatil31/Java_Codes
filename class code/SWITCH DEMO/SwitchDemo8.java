import java.util.*;

class SwitchDemo {
  
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Which Operation you want to perform");
			
		String str=sc.nextLine();//if we mention break outside the switch or loop statement then it will show error of break outof Switch or loop
		break;
		String str1=sc.nextLine();
		break;
		String str2=sc.nextLine();
		break;
		String str3=sc.nextLine();
		break;
		
		switch(str) {
			case "+":
				System.out.println("Enter Two numbers");
				int a=sc.nextInt();
				int b=sc.nextInt();
				int c=a+b;
				System.out.println("Addition of Two Number is :"+ " "+c);
			break;	
		}
		
	}
	
}
