
class PrimeDemo {

	public static void main(String[] args) {
	
		int count = 0;
		int num = 0;
		if(num == 0){
		
			System.out.println("Please Enter Valid Number");
			return; 
		}
		for (int i = num;i>0;i--) {
		
			if(num%i == 0) {
			
				count++;
			}
		}
		if(count<=1) {
		
			System.out.println(num+" "+"Given Number is Prime Number");
		}else {
		
			System.out.println(num+" "+"Given Number is Not Prime Number");
		}
	}
}
