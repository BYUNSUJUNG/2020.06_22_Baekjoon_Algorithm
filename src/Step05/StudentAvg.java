package Step05;

import java.util.Scanner;

	
public class StudentAvg {
	
	// �л����� ���� ��� �� ���ϱ�
	// �л� 5��, 40�� ������ �л��� 40������ �ٲپ� ���
	// ����� �׻� ����
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// �л� 5���� ����
		int[] iScore = new int[5];
		int iSum = 0;		
		
		// �ݺ����� �̿�
		for(int i=0; i<iScore.length; i++) {
			iScore[i] = scan.nextInt();
			// 40�� ������ �л��� 40������ �ٲ۴�
			if(iScore[i]<40) iScore[i]=40;
			iSum+=iScore[i];
		}
		System.out.println(iSum/iScore.length);
		
	}
}
