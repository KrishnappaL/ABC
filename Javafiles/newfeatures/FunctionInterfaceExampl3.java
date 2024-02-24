package java22;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionInterfaceExampl3 {
	public static void main(String args[]) {
	
	List<Integer> values=Arrays.asList(10,4,6,7);
	/*
	 * Consumer cc=new Consumer_Implements(); cc.accept(45); //it calls accept
	 * method in Consumer_Implementation
	 */
	//Its a functional interface so use lambda expression
	/*
	 * Consumer <Integer> cc=new Consumer<Integer>() {
	 * 
	 * @Override public void accept(Integer t) { System.out.println(t); }
	 * 
	 * }; cc.accept(66);
	 */
						  //t=66
	Consumer <Integer> cc=(t)-> { System.out.println(t);	};
	cc.accept(66); //calls Consumer
	}
}

