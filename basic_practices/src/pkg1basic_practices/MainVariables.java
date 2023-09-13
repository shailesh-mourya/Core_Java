package pkg1basic_practices;
//1.types of variables (static ,global,local)
//2.static variable call by class_name and non-static variable call by object_name
//3.static variable : A variable outside of method and within the class with static keyword is called static variable
//3.1. static variable and method  call by only in static thing
//4.global variable : A variable outside of method and within the class is called global variable
//5.local variable  : A variable within the method is called local variable

class VariableTypes {
	static int static_v = 4;  //static variable
	int global_v = 5;		//global or instance variable

	void method1() {
		int local_v = 6;	// local variable
		System.out.println(local_v);
	}
}

public class MainVariables {
	public static void main(String[] args) {
		VariableTypes vt = new VariableTypes();
		
		System.out.println(VariableTypes.static_v); //calling static variable
		
		System.out.println(vt.global_v);	//calling global variable
		
		vt.method1(); 						//calling local variable
	
	
	}
}
