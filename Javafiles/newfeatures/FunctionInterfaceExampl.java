package java22;

import java.util.function.Function;

public class FunctionInterfaceExampl {
	public static void main(String args[]) {
		// Function<Input,Return type(output)>
		Function<String, Integer> f = name -> name.length(); // name is String
		System.out.println(f.apply("samsung")); // samsung is String
	}
}


//forEach method is iterable interface (Collection) method
//function returns any type of value
//function accepts two arguments

//predicate returns only boolean value and accepts only one argument