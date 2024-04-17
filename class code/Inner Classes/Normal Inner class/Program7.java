
class Outer {

	int x = 10;
	static int y = 20;
	void m1() {
	
		int a = 30;
		static int b = 23;//error bc of static things comes before non-static
	}

	public static void main(String[] args) {
	
		int p = 50;
		static int q = 60;//error bc static comes first

	}
}
