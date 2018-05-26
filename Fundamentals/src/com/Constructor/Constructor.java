package com.Constructor;

//For Constructors Overriding and inheritance concepts are not applicable(with Conditions,check ExceptionCons and ConstructorMistakes for more info), but overloading is applicable
//Every class in java including abstract can contain Constructor but interface can not
//To perform initialization of the object. Type of modifier to use in Constructors are public,private, protected, default
//Prototype of Default COnst::Access modifier of default constructor is same as Class modifier applicable only for public and default
//Default modifier contains only 1 line, i.e., super();
//Inside default/no-arg constructor then this or super is mandatory, If user not defined then Compiler will generate
//No-arg constructor will not be default constructor, default cons. contains super(), but no-arg cons. user can edit
//Ex: If you want to create multi num of Object and if you want to initialize of your Object and to do an activity(assigning diff. value to Variables and all for every Object)
public class Constructor {
	String name;
	int rollNo;

	private Constructor() {
		
	}
	public Constructor(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}
	public static void main(String[] args) {
		/*Constructor o = new Constructor();
		o.name="Sampath";
		o.rollNo = 1;								//General type of initialization
		
		Constructor o1 = new Constructor();
		o1.name="Ss";
		o1.rollNo = 2;*/
		
		
		Constructor c = new Constructor("Sampath",1);
		
		

	}

}
