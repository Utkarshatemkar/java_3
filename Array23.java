

public class Array23 {
//left shift array
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		int temp=a[0];//store variable in temp
		for(int i=1;i<a.length;i++)
		{
			a[i-1]=a[i];	//left shift of the element
		}
		a[a.length-1]=temp;//assign temp variable at the last of the array
	//for(int i=0;i<a.length;i++) 
	//{
    //System.out.print(a[i]+" ");
	//}
	//for each loop
	//for(datatype variable_name= arrayname){}
	for(int arr:a) {
		System.out.print(arr);
	}
	}

}
