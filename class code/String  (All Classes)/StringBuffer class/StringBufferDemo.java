
class StringBufferDemo {
	
	public static void main(String [] args) {
	
		StringBuffer sb=new StringBuffer("Abhay Patil");
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		StringBuffer sb1=sb.append("Sarapdoh");
		System.out.println(sb1);
		System.out.println(System.identityHashCode(sb1));
	}
}
