package com.java;

public class Q111 {

}
interface I{
	public void readBook();
	public void setBook();
}
abstract class Book implements I{
	public void readBook() {
		
	}
}
abstract class EBook extends Book{
	public void readBook() {}
	public void setBook() {
		
	}
}