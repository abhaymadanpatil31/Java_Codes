
class ReplaceDemo {
	
	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("know the code till the core");
		System.out.println(sb);

		sb.replace(14,20,"till");
		System.out.println(sb);
	}
}
