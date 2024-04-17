
package def;

public class Defence {


	int no_of_batalians = 1;
	String name1 = "Maratha";

	public Defence(int no_of_batalains,String name1) {
	
		this.no_of_batalians = no_of_batalains;
		this.name1 = name1;	
	}

	public String war() {
	
		return name1+"war have been started war!";
	}
}
