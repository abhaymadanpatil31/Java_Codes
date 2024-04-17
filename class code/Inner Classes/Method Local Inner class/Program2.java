
class Home {

	void abhay() {
	
		class Dream {
		
			void Billinior () {
			
				System.out.println("I will become Billinior");

				class Healthy {
				
					void healtyLife() {
					
						System.out.println("Healthy life is more important");
					}
				}
			Healthy h = new Healthy();
				h.healtyLife();	
			}
		}
		Dream d = new Dream();
		d.Billinior();
	}
}

class Client {

	public static void main(String[]args) {
	
		Home h = new Home();
		h.abhay();
	}
}
