package Step06;

import java.util.Scanner;

public class LargestNumber {
	
	// ����ڰ� ���� ���� ������ �Է�
	// �� �߿� ���� ū ���� ���� ���� ���� ���
	// ��� ������ -1,000,000���� ũ�ų� ����, 1,000,000���� �۰ų� ���� �����̴�.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// �ʱⰪ

		int SmallestNumber = 1000000; // ���� ���� ��
		int largestNumber = -1000000; // ���� ū ��
		int iCnt = scan.nextInt(); // ���� ���� �Է�
		
		int[] iNum = new int[iCnt];
		for (int i = 0; i < iNum.length; i++) {
			iNum[i] = scan.nextInt();
			// ���� ���� �� ã��
			if(iNum[i]<SmallestNumber) {
				SmallestNumber=iNum[i];
			}
			// ���� ū �� ã��
			if(iNum[i]>largestNumber) {
				largestNumber=iNum[i];
			}
		}
		System.out.println(SmallestNumber+" "+largestNumber);
	}
}
