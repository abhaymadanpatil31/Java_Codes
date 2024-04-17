
class ConstDemo {
	
	int x=10;
	static int y=20;
	void fun() {
		
		int z=30;
		/*bytecode
		 
			class Core2Web {
			
				int x; (declaration) global varible not mentioned in any method
				core2Web ()//constructer {
					super();//invokespecial calls to parent constructer
					x=10;//initialization if we have to say it but syntaxycally its assigned
					}
		     void fun() {
		     
		     		z=30

		     }		
			static {
				
				y=20
			}	
				}
			}
		 */
	}
}
