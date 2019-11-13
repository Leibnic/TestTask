import java.util.Scanner;

public class BaseClassTD {
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print ("Entered a string (max = 9 num): ");
		String chislo = in.nextLine ();
		System.out.println ("Enter an array of 9 lines (Into a column):");
		String[] A = new String[9];
		for (int l = 0; l < 9; l++) {
			   A[l] = in.nextLine ();
			}
		int i = 0;
		int k =0;
		String[] B = new String[9];
		while (chislo.indexOf("1",i) > -1) {
			B[i] = A[chislo.indexOf("1",i)];
			i = chislo.indexOf("1",i)+1;
			System.out.print(B[k]);
			k++;
		}
		if (i == 0) {
			System.out.print("There is NO number 1 in the line");
		}
		in.close ();
	}
}
