
class House {

	void Discipline() {
	
		System.out.println("House members should be disciplined");
		
		class Members {
		
			void nature() {
			
				System.out.println("Nature should be kind of all family members");
			}
		}
		Members m = new Members();
		m.nature();
	}
}

class Client {

	public static void main(String[] args) {
	
		House h = new House();
		h.Discipline();
	}
}
