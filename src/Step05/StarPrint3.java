// �Է� ���� ¦���� ��, ���� ������ ã�ƾ���

package Step05;

import java.util.Scanner;

public class StarPrint3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// �� ��° ���� ����� �� �Է�
		// iCnt�� 1���� 100���� ����
		int iCnt = scan.nextInt();
		
		/*
		 * �Է�	���� ����
			1	1		
			2	6 = 2*4 = (2*(2*2))-2
			3	18 = 3*6 = 3*(3*2)	
			4	28 = 4*8 = (4*(4*2))-4
		 * */

		// �Է��� ���� Ȧ�� �� ��
		if((iCnt%2)!=0) {
			for (int i = 1; i <= iCnt*(iCnt*2); i++) { // ���� ����iCnt*(iCnt*2)
				// i�� Ȧ���� ��, ��(*)�� ��µ�
				if((i%2)!=0) {
					System.out.print("*");
				} else { // i�� ¦���� ��, ������ ��µ�
					System.out.print(" ");
				}
				
				// i�� iCnt�� ��� �� �� �� �ٲ�
				if((i%iCnt)==0) {
					System.out.println(" ");
				}
				
			} // end of for
		} else { // �Է��� ���� ¦�� �� ��
			for (int i = 1; i <= (iCnt*(iCnt*2))-iCnt; i++) { // ���� ����iCnt*(iCnt*2)
				// i�� Ȧ���� ��, ��(*)�� ��µ�
				if((i%2)!=0) {
					System.out.print("*");
				} else { // i�� ¦���� ��, ������ ��µ�
					System.out.print(" ");
				}
				
				// i�� iCnt�� �������� �� �������� iCnt-1�� �� �ٹٲ�
				if((i%iCnt)==(iCnt-1)) {
					System.out.println(" ");
				}

			} // end of for
		}
	
	} // end of mainMethod

}
