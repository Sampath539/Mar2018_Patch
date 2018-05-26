package com.Constructor;

public class ConstructorMistakes extends P{
	
	public ConstructorMistakes() {		//4. 1 more way to resolve this issue is passing parameters in super()
		super(2);						//5. like this it will call arg cons in P(int a), So no need of no-arg const now
	}
	public static void main(String[] args) {

		ConstructorMistakes c = new ConstructorMistakes();
	}

}

class P {

	/*P(int a){						//1.With single arg Constructor we can't extend, If we want to extend should create Obj with Arg.
		
	}*/
	
				//2. Best way to resolve this issue
	P(){
		
	}			//3.Should create both no-arg and arg Constructor
	P(int a){
		
	}
}