package Step03;

import java.util.Scanner;

public class StarPrint {

	// ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����
	// but, ������ ����
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// �� ��° ���� ����� �� �Է�
		int iCnt = scan.nextInt();
		
		// �ݺ���
		for (int i = 0; i < iCnt; i++) {
			for (int j = 0; j < (iCnt-i)-1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
