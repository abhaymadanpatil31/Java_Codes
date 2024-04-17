
class StringDemo {
	public static void main(String []args) {
		String str1="core2Web";//this string goes to string constant pool.
		String str2=new String("Core2Web");// this goes to Heap memeory i.e new code is generated.for similar Stri//ng also
		char str3[]={'C','2','W'};//its values goes on Integer cache but its array is on heap section .

		

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		

	}	


}
