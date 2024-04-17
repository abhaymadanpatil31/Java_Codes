
class Avinash {
	
	void AvinashInfo(String sirname,String villagename,String girlfriendname,String look,String favcric) {
		
		System.out.println("Sirname of Avinash is:"+sirname);
		System.out.println("Village name of Avinash is:"+villagename);
		System.out.println("girlfriend name of Avinash:"+girlfriendname);
		System.out.println("Look of Avinash:"+look);
		System.out.println("Favorite cricketer:"+favcric);
	}

	void AvinashInfo(int noOffriends,float weight,int grades) {
		
		System.out.println("No of friends of Avinash are:"+noOffriends);
		System.out.println("Weight of Avinash is:"+weight);
		System.out.println("Grades of Avinash are:"+grades);
	}
}

class client {
	
	public static void main(String [] aegs) {
		
		Avinash av=new Avinash();
		av.AvinashInfo("Gaikwad","Vadgaon","Vankhede","Handsome","BKL");
		av.AvinashInfo(4,54.4f,9);
	}
}
