
class MagicNoDemo {
	public static void main(String [] args) {
		int arr[]=new int[]{1,2,3};
		int i=1;
		System.out.println(System.identityHashCode(arr));
				
		System.out.println(System.identityHashCode(i));
		System.out.println(System.identityHashCode(arr[0]));
		System.out.println(System.identityHashCode(arr));
		System.out.println(System.identityHashCode(arr[2]));
				
				
				
				


	}
}
