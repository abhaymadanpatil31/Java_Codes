
class StringDemo {
	public static void main(String [] args) {
		Integer i []={1000,2000,3000};
		int str[]={1000,2000,3000};
		char ch[]={'A','B','0'};
		System.out.println(System.identityHashCode(i));
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(ch));
		System.out.println(System.identityHashCode(str));
                System.out.println(System.identityHashCode(i));
		System.out.println(System.identityHashCode(i));





	}
}
