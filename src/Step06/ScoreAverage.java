// ������ �κ�

// 1. 	40.000%�� ����ؾ� �ϴµ� 40%, 40.0%, 40.000, 40.000 % ���� ����ϸ� ����

// 2.
// 		1
// 		5 0 0 0 0 0�� �Է����� ��
// 		0.000%�� ���;��Ѵ�.

package Step06;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ScoreAverage {
	/*
	 * 	ù° �ٿ��� �׽�Ʈ ���̽��� ���� C�� �־�����.
		��° �ٺ��� �� �׽�Ʈ ���̽����� �л��� �� N(1 �� N �� 1000, N�� ����)�� ù ���� �־�����, 
		�̾ N���� ������ �־�����. 
		������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.000%");
		// 0: ���ڸ��� 0���� ä���.
		// #: ���ڸ��� ä���� �ʴ´�.
		
		int iInput = scan.nextInt(); // ���α׷� �� �ݺ� Ƚ��
		int iScoreCnt; // ���� ����
		int[] iScore; // ���� �迭
		int iSum; // ���� ��
		int iAvg; // ���� ���
		double dAboveAverage; // ��� �̻�
		
		// ���α׷� �ݺ�
		for (int i = 0; i < iInput; i++) {
			
			iScoreCnt = scan.nextInt();
			iScore = new int[iScoreCnt]; 
			
			// �� �ʱ�ȭ
			iSum = 0;
			iAvg = 0;
			dAboveAverage = 0;
			
			// ���� �Է�
			for (int j = 0; j < iScore.length; j++) {
				iScore[j]=scan.nextInt();
				iSum+=iScore[j];
			}
			// ��� ���ϱ�
			iAvg=iSum/iScore.length;
			// ��� �ʰ� ã��
			for (int k = 0; k < iScore.length; k++) {
				// ���� ��պ��� ũ�ٸ�
				if(iScore[k]>iAvg) {
					dAboveAverage++;
				}
			}
			System.out.println(df.format(dAboveAverage/iScore.length));
		}

	}

}
