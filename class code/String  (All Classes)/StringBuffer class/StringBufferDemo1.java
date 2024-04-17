
class StringBufferDemo {
	
	public static void main(String [] args) {
	
		StringBuffer sb=new StringBuffer("Abhay madan  Patil,tal-Karmala,Dist-Solapur,Studing at -Zeal college,{une My Passion is Coding and  this is best, thing i have thnk you");
		System.out.println(sb.capacity());
		System.out.println(System.identityHashCode(sb));
		StringBuffer sb1=new StringBuffer("Abhay");
		System.out.println(sb1);
		System.out.println(System.identityHashCode(sb1));
	}

		
}
