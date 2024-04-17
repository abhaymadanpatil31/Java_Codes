
class ConstDemo {
	//compile the program and see bytecode ,in that bytecode you will see constructer of present class is created by compiler automatically, and this comment will not available to see in bytecode
	//constructer is used to initialise the non static variable .this line is best to answer if someone ask why constructers is introduced, when we not write any code then then compiler will add constructer by itself and will call to Object(parent class) constructer and that Object class's conctruter will return even there void method because it will return 0 
	//if there is static global variable then it will get called earlier than main method because it has its special static block to store and if there is non static global then it will stored in constructers .
	//bipush is for small integer and sipush for bigger integer.and when we try to access that non static global variable without creating object then it will show error because of there is no space to store that varible on heap there are some steps to remember 
	//non static varible- constructer (requires object to store that non static varible)-object which stores the that non static variable - heap (on which object get stored) compile it and see bytecode , invokespecial(super()) is used to call constructer of object (parent class) class and that constructer will return 0 if it called by void method also 
}

