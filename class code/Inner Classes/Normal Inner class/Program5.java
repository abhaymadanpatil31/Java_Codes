
class Defence {

	String rule() {
	
		String aim = "No one is allowed to enter in the prohibited area";
		return aim;
	}

	class Navy {
	
		String navyrules() {
		
			String navyaim = "Only Navy man's family is allowd!Thank you";
			return navyaim;
		}
	}

}

class Client {

	public static void main(String[] args) {
	
		Defence d = new Defence();
		Defence.Navy n = new Defence().new Navy();
		String navy = (n.navyrules());
		String def = (d.rule());
		System.out.println(def);
		System.out.println(navy);
	}	
}
