import java.util.Scanner;

public class BaseClassTD {
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print ("������� ������ �� ����� � ������ (max = 9 ��������): ");
		String chislo = in.nextLine ();
		System.out.println ("������� ������ �� 9 ����� (� �������):");
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
			System.out.print("� ������ ��� ����� 1");
		}
		in.close ();
	}
}