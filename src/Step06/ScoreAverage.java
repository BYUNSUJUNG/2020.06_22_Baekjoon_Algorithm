// https://www.acmicpc.net/board/view/22366
// 40.000%�� ����ؾ� �ϴµ� 40%, 40.0%, 40.000, 40.000 % ���� ����ϸ� �����Դϴ�
package Step06;

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
			dAboveAverage=dAboveAverage/iScore.length;
			System.out.println(Math.round(dAboveAverage*100000)/1000.0+"%");
			
		}

	}

}
