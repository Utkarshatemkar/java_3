
/*ARRAY:
 * fixed size sequential collection of elements of the same type
 * collection of similar type of data items stored at contiguous memory locations
 * store the primitive data type of data such as int ,char ,double ,float 
 * each data element can be randomly accessed by index number
 * the lowest address corresponding to first element and higher address is to last element
 * Advantages:
 * code optimization
 * ease of sorting ease of traversing 
 * random access
 * declaration:              creation
 * datatype arrayname[]=new datatype [size];  
 *  arrayname[index]=value;  initialization    
 *  */

public class Array {

	public static void main(String[] args) {
		int a[]=new int [3];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		System.out.println(a[0]+ " "+a[1]+ " "+a[2]);	
		System.out.println("...........................................................");
		int b[]= {12,24,34,45,56};
		for(int i=0;i<=4;i++) {
			if(b[i]==34) {
				System.out.println(b[i]);
			}
		}
		System.out.println("...........................................................");
String ch[]= {"adc","xyz","opq"};
for(int i=0;i<=2;i++) {
	if(ch[i]=="adc") {
		System.out.println(ch[i]);
	}
}
System.out.println("...........................................................");
int c[]= {12,23,34,45};
int sum=0;
for(int i=0;i<4;i++) {
	sum=sum+c[i];
}System.out.println("summation total array number: "+sum);
System.out.println("...........................................................");
int d[]= {12,23,34,45};
int add=0;
for(int i=0;i<4;i++) {
	add=add+d[i];
	System.out.println("addition of number: "+add);}
	System.out.println("...........................................................");
	int f[]= {1,0,1,0,1,0,1};
	for(int j=0;j<f.length;j++) {
		if(f[j]==0) {
			f[j]=1;
		}System.out.print(f[j]);
	}
	}
	//System.out.println("...........................................................");
	

}
	


