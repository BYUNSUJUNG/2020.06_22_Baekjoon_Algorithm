// �ٸ� �������� � �ִ��� ���

package Step06;

import java.util.Scanner;

public class CountOfAnotherRemainder {

	// �� 10���� �Է¹��� ��, 
	// �̸� 42�� ���� �������� ���Ѵ�. 
	// �� ���� ���� �ٸ� ���� �� �� �ִ��� ���
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] iNum = new int[10]; // 10���� ��
		int[] remainder = new int[10]; // 10���� ���� ���� ������
		int iCnt = 0; // �ٸ� �������� ����
		
		// �� 10�� �Է��ϰ�
		// 42�� ���� �������� ����
		for (int i = 0; i < iNum.length; i++) {
			iNum[i] = scan.nextInt();
			remainder[i]=iNum[i]%42;
			System.out.println(remainder[i]);
		}
		System.out.println("==============");
		/*
		// �ٸ� �������� � �ִ��� ���
		for (int i = 0; i < iNum.length-1; i++) {
			if(remainder[i]!=remainder[i+1]) {
				iCnt++;
			}
		}
		*/
		// ���
		System.out.println(iCnt);
	}
}
