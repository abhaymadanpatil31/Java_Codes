import java.util.*;
class Percentage {

	Scanner sc = new Scanner(System.in);
	float math = sc.nextInt();
	float phy = sc.nextInt();
	float che = sc.nextInt();
	float per() {	
		
		float per1 = (math+phy+che)/300;
		return per1;
	}
}

class client {

	public static void main(String[] args) {
	
		Percentage obj = new Percentage();
		System.out.println(obj.per());
	}
}
