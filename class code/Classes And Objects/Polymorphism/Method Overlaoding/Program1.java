
class IPL {
	
	void matchInfo(String team1,String team2) {
		
		System.out.println(team1+"vs"+team2);
	}

	void matchInfo(String team1,String team2,String venue) {
		
		System.out.println(team1+"Vs"+team2);
		System.out.println("Venue = "+venue);
	}

	void matchInfo(String Capname1,String Capname2,String toss,String winner) {
		
		System.out.println("Captains names are:"+"Captain of GT is="+Capname2+" and Captain of csk is="+Capname1);
		System.out.println(toss+" win the toss and opted to bowl first");
		System.out.println("Winner is!"+winner);
		
	}
}

class client {

	public static void main(String [] args) {
		
		IPL ipl2023=new IPL();
		ipl2023.matchInfo("CSK","GT");
		ipl2023.matchInfo("CSK","GT","Narendra Modi Stadium");
		ipl2023.matchInfo("MSD","Hardik","CSK","CSK");
	}
}
