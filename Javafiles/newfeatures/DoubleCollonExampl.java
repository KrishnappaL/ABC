package java22;
//if you have one method in that time we go method reference or double colon operator,instead of lambda expression.

import java.util.ArrayList;

public class DoubleCollonExampl {
	

	public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList();
	al.add(10);
	al.add(20);
	al.add(30);
	//al.forEach(value -> System.out.println(value));
	al.forEach(System.out::println); //Double collon operator
	}

}
