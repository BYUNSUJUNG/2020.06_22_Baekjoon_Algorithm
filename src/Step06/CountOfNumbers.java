package Step06;

import java.util.Scanner;

public class CountOfNumbers {

	// �� ���� �ڿ��� A, B, C�� �־��� �� 
	// A��B��C�� ����� ����� 0���� 9���� ������ ���ڰ� �� ���� �������� ���
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int iInput = scan.nextInt()*scan.nextInt()*scan.nextInt(); // A��B��C
		int iLength = (int)(Math.log10(iInput)+1); // iInput�� ���� ���
		int[] iNum = new int[10]; // ������ ���ڰ� ���Ե� Ƚ��
		
		for (int i = 0; i < iLength; i++) {
			switch(iInput%10) {
				case 0: iNum[0]++; break;
				case 1: iNum[1]++; break;
				case 2: iNum[2]++; break;
				case 3: iNum[3]++; break;
				case 4: iNum[4]++; break;
				case 5: iNum[5]++; break;
				case 6: iNum[6]++; break;
				case 7: iNum[7]++; break;
				case 8: iNum[8]++; break;
				case 9: iNum[9]++; break;
			}
			iInput/=10; 
		}
		
		// ������ ���ڰ� ���Ե� �� ���
		for (int i = 0; i < iNum.length; i++) {
			System.out.println(iNum[i]);	
		}
		
	}

}
