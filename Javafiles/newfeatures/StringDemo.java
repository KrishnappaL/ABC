package java22;


public class StringDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer name=new StringBuffer("sivaramakrishnan");
System.out.println(name.hashCode());
StringBuffer name2=new StringBuffer();
for(int i=0;i<name.length();i++) {
	name2.append(name.charAt(i));
	System.out.println(name2.hashCode());
}
System.out.println();
	}
}
