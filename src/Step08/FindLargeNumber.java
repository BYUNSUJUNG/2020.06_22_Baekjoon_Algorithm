package Step08;

import java.util.Scanner;

public class FindLargeNumber {

	/*
	 *  ������� ������ ����� ���ڸ� �дµ� ������ �ִ�
	 *  734�� 893�� ĥ�ǿ� �����ٸ�, ����� �� ���� 437�� 398�� �д´�
	 *  ����, ����� �� ���� ū ���� 437�� ū ����� ���� ���̴�.
	 *  
	 *  ���ڴ� ���ڸ� ��
	 * */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int iNum1 = scan.nextInt(); // ù��° ����
		int iNum2 = scan.nextInt(); // �ι�° ����
		int[] iNumChange1 = new int[3]; // ù��° ���� ���� �����⿡ ����� ���� ���
		int[] iNumChange2 = new int[3]; // �ι�° ���� ���� �����⿡ ����� ���� ���
		int temp; // �ӽ� ����
		
		// ���� �����⿡ ����� ���� ���
		for (int i = 0; i < iNumChange1.length; i++) {
			iNumChange1[i]=iNum1%10;
			iNum1/=10;
		}
		for (int i = 0; i < iNumChange2.length; i++) {
			iNumChange2[i]=iNum2%10;
			iNum2/=10;
		}
		
		// ���� ������
		iNum1 = iNumChange1[0]*100 + iNumChange1[1]*10 + iNumChange1[2]*1;
		iNum2 = iNumChange2[0]*100 + iNumChange2[1]*10 + iNumChange2[2]*1;
		
		// ���ٲ�ġ�� - iNum1�� ū ���� ������
		if(iNum2>iNum1) {
			temp = iNum2;
			iNum2 = iNum1;
			iNum1 = temp;
		}
		
		// ���
		System.out.println(iNum1);
				
	}

}
