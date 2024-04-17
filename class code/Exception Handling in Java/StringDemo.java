
class StringlengthException extends RuntimeException {
 
	StringlengthException(String msg) {
	
		super(msg);
	}
}

class ToCharArray {

	static int mystrlen(String str) {
	
		char ch[] = str.toCharArray();
		int count = 0;
		for(int i = 0; i<ch.length; i++) {
		
			count++;
		}

		if(count == 2) {
		
			throw new StringlengthException("Are vedya data neet tak na !");
			
		}
		
		return count;
	}
		public static void main(String[] args) {
		
			String str = "Om";
			int len = mystrlen(str);
			System.out.println(len);
		}
}
