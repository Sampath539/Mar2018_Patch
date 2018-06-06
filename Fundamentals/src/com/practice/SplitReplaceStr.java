package com.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SplitReplaceStr extends Diff{

	public static void main(String[] args) {
		List ls = Arrays.asList("Hello","World");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some String to list: ");
		String[] strArr = new String[2];
		strArr[0] = sc.nextLine();
		strArr[1] = sc.nextLine();
		String stringArrToString = Arrays.toString(strArr).replace('[', ' ').replace(']', ' ').trim();
		List<String> strArrList = Arrays.asList(stringArrToString.split("\\s*,\\s*"));	// \\s means a space and \\s* means after space and \\s*,\\s* means it will take care of spaces also while replacing , before space and after , space it ill trim
		//stringArrToString = stringArrToString.replaceAll("\\s*,", "");
		//System.out.println(stringArrToString);
		strArrList.forEach(System.out::print);

	}
	public void m2(){
		
	}
	

}
abstract class Diff{
	private void m1() {
		
	}
	public abstract void m2();
	/*private abstract void m3() {
		
	}*/
	
}


/**	Interfaces									|			Abstract
 * 
 * 1.If you don't know the full implementation		1.If you know full implementation then you can go. 
 * then best to go										You can declare the methods and you can implement the methods.
*
*  2.methods should be public whether we are 		2. Methods can be private but should have implementation,
*  declaring or not. It gives 100% abstraction			Methods can be public abstract. abstract methods should be public.
*
*	3.Every variable in the interface should always 	3. No restrictions for variables
*	public static final.								
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*/


