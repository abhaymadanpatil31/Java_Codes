
class AnagramDemo {
	
	
	void AnagramDemo(String str1,String str2) {
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		if(str1.length()!=str2.length()){
			
			System.out.println("Not an Anagram String");
		}
		char [] ch1=str1.toCharArray();
		char [] ch2=str2.toCharArray();
		int n=arr1.length;
		
		for(int i=0;i<n;i++) {
			
			boolean b=false;
			for(int j=0;j<n;j++) {
				if(ch1[i]==ch[2]) {
					
					b=true;
					ch2[j]='#';
					break;
				}
					
			}
			if(b==false) {
				
				System.out.println("Not an Anagram");
			}
		}
		System.out.println("Anagram Strings");
		
	}
	public static void main(String [] args) throws IOException {

		
		BufferedReder br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Checking an Anagram");
		System.out.println("Enter two Strings");
		String st1=br.readLine();
		String st2=br.readLine();
		StringDemo sb=new StringDemo ();
		System.out.println(st1+"and "+st2+"these are");
		sb.AnagramDemo(st1,st2);
	}
}
