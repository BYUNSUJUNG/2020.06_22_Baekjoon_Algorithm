package Step06;

import java.util.Scanner;

public class LargestNumber {
	
	// 9���� ���� �ٸ� �ڿ����� �־��� ��, 
	// �ִ��� ã��, �� �ִ��� �� ��° ������ ���
	// �־����� �ڿ����� 100 ���� �۴�
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// �ʱⰪ
		int largestNumber = 0; // �ִ�
		int[] iNum = new int[9]; // 9���� ���� �ٸ� �ڿ���
		int iCnt = 0; // �ִ��� ��ġ
		
		// �ڿ��� �Է� �ݺ���
		for (int i = 0; i < iNum.length; i++) {
			iNum[i] = scan.nextInt();
			// ���� ū �� ã��
			if(iNum[i]>largestNumber) {
				largestNumber=iNum[i];
				iCnt=i+1;
			}
		}
		System.out.println(largestNumber);
		System.out.println(iCnt);
	}
}
