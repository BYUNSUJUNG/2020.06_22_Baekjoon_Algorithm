package Step05;

import java.util.Scanner;

public class StarPrint2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// �� ��° ���� ����� �� �Է�
		int iCnt = scan.nextInt();
		
		// �������� �ﰢ��
		for (int i = 0; i < iCnt; i++) { // 0 1 2 3 4
			for (int j = 0; j < i; j++) { // ���� ���
				System.out.print(" ");
			}
			
			for (int k = 0; k < (iCnt-i)*2-1; k++) {  // �� ���
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		// �ﰢ��
		for (int i = 0; i < iCnt-1; i++) { // 0 1 2 3 
			for (int j = 0; j < (iCnt-2)-i; j++) { // ���� ���
				System.out.print(" ");
			}
			
			for (int k = 0; k < (i*2)+3; k++) {  // �� ���
				System.out.print("*");
			}
			System.out.println(" ");
		}


		
	}

}
