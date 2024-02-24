package java22;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionInterfaceExampl5 {
	public static void main(String args[]) {
	
	List<Integer> l=Arrays.asList(10,4,6,7);
	
	/*
	 * Consumer <Integer> cc=(t)-> System.out.println(t); l.forEach(cc);
	 */
	l.forEach((no)-> System.out.println(no));
	}
}

