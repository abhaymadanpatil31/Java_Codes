
class BreakDemo2{
public static void main(String [] a){
    int N=40;
    for(int i=1;i<=N;i++){
      if(i%3==0 && i%5==0){
         break;
                          }
      else{
           System.out.println(i);
          }
       }
    }
}
