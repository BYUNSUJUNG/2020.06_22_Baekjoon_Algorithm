//�Է�: Scanner
//����: Arrays.sort()
//for �ݺ��� ���
//���: �ð��ʰ�

package Step14;

import java.util.Arrays;
import java.util.Scanner;

public class NumberSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// ���� ���� �Է�
		int iInput = scan.nextInt();
		
		// ���� �Է�
		int[] iNum = new int[iInput];
		for (int i = 0; i < iNum.length; i++) {
			iNum[i] = scan.nextInt();
		}
		
		// ���� ����(��������)
		Arrays.sort(iNum);
		
		// ���
		for (int i = 0; i < iNum.length; i++) {
			System.out.println(iNum[i]);
		}
	}

}
