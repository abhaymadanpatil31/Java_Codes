
class MatchInfo {
	
	void matchInfo(String team1,String team2) {
		
		System.out.println("Team Qualified for finals are :"+team1+"VS"+team2);
	}

	void matchInfo(String team1,String team2,int runsof_CSK,int runsof_GT) {
		
		System.out.println("Teams are qualified for final and runs of each team are:");
		System.out.println("team1"+team1+"team2"+team2+"runsofcsk"+runsof_CSK+"runsofGT"+runsof_GT);
	}
}

class client {
	
	public static void main(String [] args) {
		
		MatchInfo ipl2023=new MatchInfo();
		ipl2023.matchInfo("CSK","GT");
		ipl2023.matchInfo("CSK","GT",209,205);
	}
}
