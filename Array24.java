

public class Array24 {
//Right shift array
	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40 };
		int temp = a[a.length - 1];// last index number store in temp variable
		for (int i = a.length - 1; i > 0; i--) {// read reverse array
			a[i] = a[i - 1];// assign last array element to its previous element
		}
		a[0] = temp;// assign temp variable value to first
		for (int arr : a) {
			System.out.print(arr + " ");
		}
	}

}
