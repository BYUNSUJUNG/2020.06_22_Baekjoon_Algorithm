package Step05;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SecondLargestNumber {

	// ���� A, B, C�� �Է��Ѵ�
	// �ι�°�� ū ������ ã�´�
	// ���� A, B, C�� 1�̻� 100������ �����̴�
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// �ʱⰪ
		int largestNumber = 0;
		int SmallestNumber = 100;
		
		int[] iNum = new int[3];
		iNum[0] = scan.nextInt();
		iNum[1] = scan.nextInt();
		iNum[2] = scan.nextInt();
		
		// ��������
		Arrays.sort(iNum);
		System.out.println(iNum[1]);
		/*
			for (int i = 0; i < iNum.length; i++) {
				System.out.println(iNum[i]);
			}
		*/
	}

}
