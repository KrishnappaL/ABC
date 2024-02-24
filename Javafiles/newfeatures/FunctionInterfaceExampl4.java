package java22;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionInterfaceExampl4 {
	public static void main(String args[]) {
	
	List<Integer> values=Arrays.asList(10,4,6,7);
	values.forEach((no)->System.out.println(no));
	//no calls Consumer interface accept method internally
	}
}

