class BreakDemo  {
public static void main(String [] a)  {
               int N=15;
               int count=0;
    for(int i=1;i<=N;i++){
        if(N%i==0){
	count++;
	     }
     	if(count>2){ 
	     break;
	      }
	System.out.println(i);
          } 
     }
}
