
class ReverseDemo {
	
	public static void main(String []args) {
		
		String str1="Abhay";
		StringBuffer sb=new StringBuffer(str1);
		str1=sb.reverse().toString();
		System.out.println(str1);
	}
}
