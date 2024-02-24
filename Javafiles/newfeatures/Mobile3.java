package java22;

public class Mobile3 {
	public   static void show(int value) { //static method so use class name to call
		System.out.println(value);
	}
	int price=20;
	Mobile3(int price){ //arguments also matced.
		
	}
	public static void main(String[] args) {


Contract c= Mobile3::show;
c=Mobile3::new;//Constructor reference and method is static
c.display(12);

	}

}

