package Step03;

import java.util.Scanner;

public class SmallNumberPrint {

	// ���� N���� �̷���� ���� A�� ���� X�� �־�����. 
	// �̶�, A���� X���� ���� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// ���� A�� ����� ����
		int[] iNumA;
		// ���� N;
		int iNumN;
		// ���� X;
		int iNumX;
		
		// ���� N �Է�
		iNumN = scan.nextInt();
		// ���� N���� �̷���� ���� A
		iNumA = new int[iNumN];
		
		// ���� X �Է�
		iNumX = scan.nextInt();
		
		// ���� A�� �� ���� N���Է�
		for (int i = 0; i < iNumA.length; i++) {
			iNumA[i] = scan.nextInt();
		}
		
		// ���� A�� �ִ� ���� ���� X�� ��
		for (int i = 0; i < iNumA.length; i++) {
			// ���� A���� ���� X���� ���� �� ���
			if(iNumA[i]<iNumX) {
				System.out.print(iNumA[i]+" ");
			}
		}
	}
}
