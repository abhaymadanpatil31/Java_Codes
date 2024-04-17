
class Class {
	
	static boolean eboard=true;
	int mobile=0;
	void Disp() {
		
		System.out.println("The Board which will turn of if any of present object turn it off!    "+"  "+eboard);
		System.out.println("If mobile is get turned of of any student then all students mobile will not turn of!  "+"  "+mobile);
	}


}

class MainDemo {
	
	public static void main(String [] args) {
	
		Class st1=new Class();
		Class st2=new Class();
		st1.Disp();
		st2.Disp();
		System.out.println("Change in static after from this line:");
		st1.eboard=false;
		st1.mobile=1;
		st1.Disp();
		st2.Disp();
		System.out.println("Above line shows that change in static variable can lead to change in other object also! but Change in One object that will not lead to change in every object becuase of static variable is class's variable but non static varaible is objects variable and objets have their own instance variable i will do blog of real time example on this concept ");
	}
}
