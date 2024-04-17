import java.io.*;
class Home {

	String family(int mem) {
	
		System.out.println("Welcome to Family");
		System.out.println("We have members"+mem);
		return "HI";
	}
	Home(){
	
		System.out.println("I am The Home thouch which you will get the access the to family members");
	}

	String work() {


		System.out.println("We do Regular work only");
		return new String("Work");
	
	}
}

class Hostel extends Home {

	String family(int mem) {
	
		System.out.println("we have memebers only"+mem);
		return "Bye bye Home";
	}

	Hostel(){
	
		System.out.println("Before Calling me i will call to Home");
	}
	
	String work() {
	
		System.out.println("We do Regular Study!");
		return "Good Work";
	}
}

class Client {

	public static void main(String [] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		Hostel obj = new Hostel();
		obj.family(num);
		String work = br.readLine();
		obj.work();	

	}
}
