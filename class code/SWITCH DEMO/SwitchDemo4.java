
class SwitchDemo4 {
	public static void main(String [] abhay) {
		int x=3;
		int a=1;
		int b=2;
		switch(x) {
			case a:
				System.out.println("1");
				break;
			case b:
				System.out.println("2");
				break;
			case a+b:
				Sytem.out.println("3");
				break;
			case a+a+b:
				System.out.println("4");
				break;
			case a+b+b:
				System.out.println("5");
				break;
			default:
				System.out.println("Invalid");	
		
		
		}
		        }
    }		 
  /* in this example variable data type is used and according to switch rules we cant use variables in switching conditions
   * and we can only use integer, char,string,enum ,boolean only varibles are not used.*/ 
