
class SBDemo {
	public static void main(String [] args) {
		StringBuffer sb =new StringBuffer("ShashiCore2Web");
		System.out.println(sb);
		sb.insert(6,"Bagal");
		System.out.println(sb);//ShashiBagaliCore2Web
		sb.insert(6,"Biencaps");
		System.out.println(sb);//ShashiBiencapsBagaliCore2Web
	}
}
