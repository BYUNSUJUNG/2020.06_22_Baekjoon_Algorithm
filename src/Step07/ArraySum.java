package Step07;

import java.util.Scanner;

public class ArraySum {

	 /*
	 * 	Java: long sum(int[] a); (Ŭ���� �̸�: Test)
		a: ���� ���ؾ� �ϴ� ���� n���� ����Ǿ� �ִ� �迭 
		���ϰ�: a�� ���ԵǾ� �ִ� ���� n���� ��
	*/
	
	// ��
	static int iSum = 0;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// n���� ����
		int iNum = scan.nextInt();
		// ������ ��� �迭
		int[] arr = new int[iNum]; 
		for (int i = 0; i < arr.length; i++) {
			// �����Է�
			arr[i] = scan.nextInt();
		}
		arrSum(arr);
	
	}
	
	static long arrSum(int[] a) {
		// �ձ��ϱ�
		for (int i = 0; i < a.length; i++) {
			iSum+= a[i];
		}
		return iSum;
		
	}

}
