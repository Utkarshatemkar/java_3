

public class Array22 {

	public static void main(String[] args) {
		//Find equality of array
int a[]= {1,2,3,4};
int b[]= {2,4,3,6};
int count=0;
if(a.length==b.length) {
	for(int i=0;i<b.length;i++) {//0<4 1<4 2<4
		
		if(a[i]!=b[i]) {//1==2t 2==4t 3==3 
			
			count++;//1//2//
		}
	    }
	    if(count==0) {
		System.out.println("elements are equal");
	     }
	    else
	    {
		System.out.println("elements are not equal");
	      }
	System.out.println("length of array are equal");
}else {
	System.out.println("length of Arrays are not equal");
}
	}

}
