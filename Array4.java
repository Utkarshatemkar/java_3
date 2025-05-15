

public class Array4 {

	public static void main(String[] args) {
		int a[]= {1,2,1};
		for(int i=0;i<a.length;i++) //0<3 //1<3//2<3
		{//i=0  
			int count=0;
			for(int j=i+1;j<a.length;j++)//1<3 2<3 3<3f // 2<3 
			{
				if(a[i]==a[j]) {//1==2f 1==1f //
				count++; 
			   }
				}
		    if(count==0){ //1==0f {//if elements are not matched then print original elements of array
			
			System.out.println(a[i]);}
		}
		

	}

}
