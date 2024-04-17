class FizzBuzz{
public static void main(String []args){
	int x=15;
	 if(x%5==0&&x%3==0){
       System.out.println("Fizz-Buzz");
	
	}
	else if(x%3==0){
        System.out.println("Fizz");

	}
	else if(x%5==0){
	System.out.println("Buzz");
	}
	else  {
	System.out.println("Not Divisible");
	
	}

}
}
