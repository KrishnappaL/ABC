package java22;


import java.util.Arrays;
import java.util.stream.IntStream;

public class StreaamExampl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar= {10,20,50,65};
		IntStream s=Arrays.stream(ar);
//		long len=s.count();
		System.out.println(Arrays.stream(ar).count());
//	System.out.println(len);
s=	s.sorted();
	s.forEach(no->System.out.println(no));
 //s.forEach(System.out::println);
	}

}
//Stream-->stream the objects/data but it doesn't save like tv shows,flipkart,etc
//*Increase performance.
//Iteration and Sequential processing both are replaced by  the Stream API
//*Provide internal iteration
//Sequential,parallel and grouping type of operations do by stream ,using this we find maximum,average etc.







//	Collection of data ===>Intermediate  Operations ===>Terminal operations
//	(Arraylist,array,HashSet)		(filter(),map())		(final stage forEach)
	//									STREAM