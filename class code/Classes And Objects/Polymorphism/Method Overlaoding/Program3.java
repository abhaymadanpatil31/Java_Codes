
class Bag {
	
	void BagInfo(String Brand,String look,String Quality,String sellar,String features) {
		
		System.out.println("Brand name of Bag is:\n"+Brand+"\nLooks of Bag are:\n"+look+"\nQualti of Bag is:\n"+Quality+"\nOffline from:\n"+sellar+"\nFeatures are:\n"+features);
	}

	void BagInfo(int price,float weight,int noOfChains) {
		
		System.out.println("Price of bag is:"+price);
		System.out.println("weight of bag is:"+weight);
		System.out.println("No of chains are:"+noOfChains);
	}
		
}

class client {
	
	public static void main(String [] args) {
		
		Bag bg=new Bag();
		bg.BagInfo("American Tourister","Class","High Build Quality","Young retails sellars","High security,digital");
		bg.BagInfo(2000,3.5f,7);
	}
}
