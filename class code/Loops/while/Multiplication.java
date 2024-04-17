
class Multiplication{
   
	public static void main(String []abhay){
              int mult=1;
              int N=654;
              while(N!=0){
                   int rem=N%10;
                   mult=mult*rem;
                   N=N/10;
               }
                System.out.println(mult);
        }
}
