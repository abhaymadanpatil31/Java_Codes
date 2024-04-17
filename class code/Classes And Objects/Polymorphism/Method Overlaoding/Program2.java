
class Cricket {
	
	void cricketInfo(String playing_nations,String God_of_Cricket) {
	
		System.out.println("Playing nations in numbers are:"+playing_nations);
		System.out.println("GOD OF CRICKET IS:"+God_of_Cricket);
	}

	void cricketInfo(String Top_batsmen,String Top_bowler,String Top_Allrounder) {
		
		System.out.println("ICC Top Batsmen name is:"+Top_batsmen);
		System.out.println("ICC Top bowler name is:"+Top_bowler);
		System.out.println("ICC Top Allrounder name is:"+Top_Allrounder);
	}

}

class client {
	
	public static void main (String [] args) {
		
		Cricket cr=new Cricket();
		cr.cricketInfo("12","Sachin Tendulkar");
		cr.cricketInfo("Virat Kohli","Jasprit Bumrah","Ravindra Jadeja");
	}
}
