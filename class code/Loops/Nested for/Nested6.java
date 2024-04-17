
class Nested6{
public static void main(String [] a){
    for(int i=1;i<=3;i++){
    char ch='A';
    int var=33;
    for(int j=1;j<=3;j++){
      if(j%2==1){
         System.out.println(ch++);
                }
               else{
	       System.out.println(var++);
	       }
      }
    }
   }
}
