

public class Array6 {

	public static void main(String[] args) {
		int a[] = { 1, 2, 1, 2, 1 };
		int max = Integer.MIN_VALUE;//0
		int min = Integer.MAX_VALUE;//a[0]
		int ch = 0;
		int ch1 = 0;
		for (int i = 0; i < a.length; i++) { 
			int count = 0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {//remove duplicates
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
				if (max < cont) {
					max = cont;//max freq
					ch = a[i];
				}
				if (min > cont) {
					min = cont;
					ch1 = a[i];//min freq
				}
			}

		}

	System.out.println("max value ="+ch+" "+max);
	System.out.println("min value ="+ch1+" "+min);

}

}
