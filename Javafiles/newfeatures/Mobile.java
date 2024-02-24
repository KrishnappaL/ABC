package java22;

public class Mobile {
	public  void show(int value) { //if static is error
		System.out.println(value);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Mobile m=new Mobile()










;
//Contract c=a ->System.out.println(a);
Contract c= m::show;
c.display(12);

	}

}

//If both instance method do the same work then writing to statement is boring so we use double colon operator that is here
//show call print single output but this output is the output of two different methods like display() and show().


//Arguments of both methods should  match.

//===>Increase readability