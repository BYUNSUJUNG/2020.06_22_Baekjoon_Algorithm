package Step05;

import java.util.Scanner;

public class StarPrint2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// �� ��° ���� ����� �� �Է�
		int iCnt = scan.nextInt();
		
		// �ݺ���
		for (int i = 0; i < iCnt; i++) { 
			for (int j = 0; j < i; j++) { // ���� ���
				System.out.print(" ");
			}
			/*
				for (int k = iCnt-i; k < (k*2)-1; k++) {  // �� ���
					
				}
			*/
			System.out.println("");
		}


		
	}

}
