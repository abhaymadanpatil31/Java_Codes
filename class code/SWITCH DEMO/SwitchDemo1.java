
class SwitchDemo {
	public static void main(String [] args) {
		int x=65;
		Switch(x) {
			case 'A':
				System.out.println("A");
			case 65 :
				System.out.println("65");
			case 'B':
				System.out.println("B");
			case 66:
				System.out.println("66");
			default :
				System.out.println("Default");	
		}
		System.out.println("After Switch");
	}
}
