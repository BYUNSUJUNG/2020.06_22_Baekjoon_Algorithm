package Step14;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayDescending {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// �� ���� �Է�
		int iNum = scan.nextInt();
		// ���� �� �迭
		Integer[] iNumArray = new Integer[(int)(Math.log10(iNum)+1)];
		
		for (int i = 0; i < iNumArray.length; i++) {
			iNumArray[i] = iNum%10;
			iNum/=10;
			//System.out.println(iNumArray[i]);
		}
		
		Arrays.sort(iNumArray,Collections.reverseOrder());
		
		for (int i = 0; i < iNumArray.length; i++) {
			System.out.print(iNumArray[i]);
		}
	}

}
