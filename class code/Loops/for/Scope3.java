
class Scope3{
public static void main(String []a){
int x=10;
{
int x=20;
System.out.println(x);
}
{
int x=30;
System.out.println(x);
}
System.out.println(x);
}
}
