import java.util.*;
public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int a[]= {23,34,45};
		int b[]= {12,34,45};
		int c[]=new int[a.length];
			for(int i=0;i<a.length;i++) {
			c[i]=a[i]+b[i];
			System.out.println(c[i]+" "+i);
		}*/
			/*System.out.println("......................................................");
			System.out.println("enter size of array");
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int a[]=new int[n];
			System.out.println("enter elemnt of array");
			for(int i=0;i<a.length;i++) {
				a[i]=sc.nextInt();	
			}for(int i=0;i<a.length;i++) {
				System.out.println(a[i]+" "+i);
			}*/
		int a[]= {2,3,4,5,6};
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==5) {
				count++;}
			}if(count==0) {
				System.out.println("not found");
			}else {
				System.out.println("found");
				}
			}
}
