import java.util.*;
class Parent {

	void fun() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the ProtedNumber !");
	int protected num = 10;
	}

}

class Child extends Parent {

	void gun() {
	System.out.println("The Value Of num from Parent is: "+num);
	}
}

class Client {

	public static void main(String[] args) {
	
		Child obj = new Child();
		obj.gun();
	}
}
