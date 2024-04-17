
class SwitchDemo {
	
	public static void main(String []args) {
		
		String str="Abhay";
		switch(str) {
			
			case "Abhay":
				    System.out.println("you are in Abhay's world:"+"  "+str);
			String str1="Madan";
	    			switch(str1) {
					case "Madan":
						System.out.println("This is his Father's name:"+"  "+str1);
						String str2="Patil";
						switch(str2) {
							
							case "Patil":
								System.out.println("This is his Last name:"+"  "+str2);
							default: {
								System.out.println("You are in Default method");
							}
						}
				}		
		}	
	}
}
