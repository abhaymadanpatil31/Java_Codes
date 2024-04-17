import java.util.*;
class Bill {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Units");
		int units = sc.nextInt();
		System.out.println("Enter the total Units to calculate bill");
		int tunits = sc.nextInt();
			
		if(units<=tunits) {
		
			System.out.println("bill at fair price:"+units*1);
		}

		else {
		
			System.out.println("bill at abnormal price:"+100*1+(units-100)*2);
		}
	
	}
}
				
