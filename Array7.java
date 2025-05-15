

public class Array7 {
//find triplets
	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		for(int i=0;i<a.length;i++) {//i=0<4=1//i=1<4=2
			for(int j=i+1;j<a.length;j++){//j=1<4=2 //j=2<4=3
				for(int k=j+1;k<a.length;k++) {//k=2<4=3 //k=3<4=4//k=4<4f
					System.out.println(a[i]+" "+a[j]+" "+a[k]);//123//124//134//234
				}
			}
		}

	}

}
