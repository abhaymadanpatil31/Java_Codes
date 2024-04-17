
class Scope1{
public static void main(String [] a){
int x=10;{
int y=20;
System.out.println(x+" "+y);
}
{
System.out.println(x+" "+y);
}
System.out.println(x+" "+y);
}	
}
