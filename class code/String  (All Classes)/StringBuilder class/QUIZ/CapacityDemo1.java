
class CapacityDemo {


	public static void main(String [] args) {
	
		StringBuffer str=new StringBuffer(400);
		str.append("java_Development_kit");
		str.trimToSize();
		str.setLength(10);
		System.out.println(str.capacity());
		System.out.println(str.length());
	}
}
