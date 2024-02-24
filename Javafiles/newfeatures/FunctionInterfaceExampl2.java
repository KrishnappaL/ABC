package java22;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionInterfaceExampl2 {
	public static void main(String args[]) {
	
	List<Integer> values=Arrays.asList(10,4,6,7);
	System.out.println(values);
	values.forEach(elem -> System.out.println(elem));
	}
}

//forEach() uses Consumer interface on a background ,It is also a functional interface but we can't used here directly .
//If  you like to know Consumer interface then you know about anonymous  inner class.

//Inner class:
//1.Regular inner class/Nested class
//2.Method local inner class
//3.Anonymous inner class
//4.static nested inner class -->it is only possible to create a inner static class.

//Anonymous inner class -->Inner class without name we create when we have only one method in inner class
//3 ways to create
//1.Anonymous inner class extend from normal class
/*
 * class A{ A obj=new A() {
 * 
 * }; }
 */
//2.Anonymous inner class implemented from interface

/*
 * class Demo{ public static void main(String[] a) { Contract2 cc=new
 * Contract2() {
 * 
 * @Override public void display() { System.out.println(); }
 * 
 * }; cc.display(); } }
 */
//3.Anonymous inner class inside Arguments.
