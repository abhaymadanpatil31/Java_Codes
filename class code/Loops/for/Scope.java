
class Scope{
public static void main(String [] a){
int x=10,y=20;
{
System.out.println(x+" "+y);
}	
{
x=15;
System.out.println(x+" "+y);
}
System.out.println(x+" "+y);
}	
}
	
