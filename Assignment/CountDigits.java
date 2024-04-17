class CountDigits{
public static void main(String []abhay){
int count=0;
int num=942111423;
while(num!=0){
num/=10;
++count;
}	
System.out.println("Number of digits"+count);
}	
}
