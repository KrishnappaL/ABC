package java11;

public class MultiplicationOfArray {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,8,9};
		int[] b= {6,7};
		int len1=a.length;
		int len2=b.length;
		int small=len1<len2?len1:len2;
		int big=len1>len2?len1:len2;
		int c[]=new int[big];
		for(int i=0;i<small;i++) {
			c[i]=a[i]*b[i];
		}
		if(a.length>b.length) {
			for(int i=small;i<c.length;i++) {
				c[i]=a[i];
			}
		}
		else if(b.length>a.length) {
			for(int i=small;i<c.length;i++) {
				c[i]=b[i];
			}
		}
		for(int i=0;i<c.length;i++) {
			
			System.out.println(c[i]+" ");

		}
	}

}
