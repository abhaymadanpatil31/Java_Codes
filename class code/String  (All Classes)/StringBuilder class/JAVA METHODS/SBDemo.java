
class SBDemo {
	public static void main(String [] args) {
		
		StringBuffer sb=new StringBuffer("ABHAY");//
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.append("Abhay");
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.append("Patil");
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.append("Sarapdoh");
		System.out.println(sb);
		System.out.println(sb.capacity());
		
		
	}
}
