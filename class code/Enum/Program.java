/*So basically i would like to add some key points of enum so the points are mentioned below
 1. Enum is internally goes as class but that class constructor is final so wa cant inherit
 2. enum dont try to bind the things at runtime enum tries compile time 
 3. enum has class called Enum
 4. Enum class is abstract class but when we write enum we dont give the body to the abstract method , the answer of this quetion is that in Enum class there is no abstract method the reason behind the to call that class as Abstract class is nothing but the the developers dont want to make direct object of that class .
 5. enum every thing is object and every object is get created in array and that's why when we write multiple object and create the constructor then every time call goes to that constructor 
 6.every object is static and  */
 
enum ProgLang {

	C,
	CPP,
	Java,
	Python;

}

class Client {

	public static void main(String[] args) {
	
		//ProgLang pobj = new ProgLang(); not allowed
		ProgLang pobj = ProgLang.C;
		System.out.println(pobj.ordinal());//0
		System.out.println(pobj.hashCode());// 1414159026
		System.out.println(pobj.toString());
		System.out.println(pobj.getDeclaringClass());
	//	System.out.println(pobj.finalize()); 1414159026

	}
}
