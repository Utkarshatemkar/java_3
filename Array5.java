

public class Array5 {
//finding number of occarance/frequency of element
	public static void main(String[] args) {
		int a[] = { 1, 2, 1, 2, 3 };
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}
			if (count == 0) {

				int cont = 0;
				for (int k = 0; k < a.length; k++) {
					if (a[i] == a[k]) {// count no of frequency
						cont++;
					}
				}
			
				System.out.println(a[i] + " " + cont);
			}

		}

	}
}
