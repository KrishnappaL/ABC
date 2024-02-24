package java22;

public class Mobile2 {
	public   static void show(int value) { 
		System.out.println(value);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Mobile2 m=new Mobile2();
//Contract c=a ->System.out.println(a);
Contract c= Mobile2::show;
c.display(12);

	}

}

//If both instance method do the same work then writing to statement is boring so we use double colon operator that is here
//show call print single output but this output is the output of two different methods like display() and show().


//Arguments of both methods should  match.