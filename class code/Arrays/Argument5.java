
class Demo {
	 void fun(int arr[]) {
		for(int x:arr) {
			System.out.println(x);
		}
		for(int i:arr) {
			System.out.println(i+50);
		}
	}
	
	
	
	public static void main(String [] args) {
		int arr[]={23,323,212,2122};
		for(int x:arr) {
			System.out.println(x);
		}
		fun(arr);
	}
	
}
