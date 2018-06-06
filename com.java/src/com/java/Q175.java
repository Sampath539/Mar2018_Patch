package com.java;

public class Q175 {

	public static void main(String[] args) {
		try {
		Candidate c = new Candidate("Williom",20);
		Candidate c1 = new Candidate(null,20);
		}catch(AgeOutOfBoundsException e) {
			
		}catch(MissingInfoException e) {
			
		}catch(Exception e) {
			
		}

	}

}
class AgeOutOfBoundsException extends Exception{
	
}
class MissingInfoException extends Exception{
	
}
class Candidate{
	String name;
	int age;
	public Candidate(String name, int age) throws Exception {
		if(name == null) {
			throw new MissingInfoException();
		}else if(age <=13 || age >= 100) {
			throw new AgeOutOfBoundsException();
		}else {
			this.name = name;
			this.age  = age;
		}
	}
}