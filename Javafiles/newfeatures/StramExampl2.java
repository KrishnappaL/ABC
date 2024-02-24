package java22;

import java.util.Arrays;

public class StramExampl2 {

	public static void main(String[] args) {
		int[] ar= {23,56,22,1,9};
// TODO Auto-generated method stub
Arrays.stream(ar).sorted().forEach(System.out::println);  //=======>called pipelining
	}

}
