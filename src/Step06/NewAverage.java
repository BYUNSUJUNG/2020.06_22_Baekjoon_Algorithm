package Step06;

import java.util.Scanner;

public class NewAverage {

	/*
	 * �����̴� �⸻��縦 ���ƴ�. 
	 * �����̴� ������ �����ؼ� ���� ��������� �ߴ�. 
	 * �ϴ� �����̴� �ڱ� ���� �߿� �ִ��� �����. 
	 * �� ���� M�̶�� �Ѵ�. 
	 * �׸��� ���� ��� ������ ����/M*100���� ���ƴ�.
	 * 
	 * ���ο� ����� ���ϴ� ���α׷��� ���Ͻÿ�
	 * ������ ������ 0 ~ 100
	 * */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// ���� ���� �Է�
		int iInput = scan.nextInt();
		// �� ���� ���� ����
		double[] dScore = new double[iInput];
		// ���� ���� ����(�ִ�)
		double dMaximum = 0;
		// ��� ������ ��
		double dSum = 0;
		
		// ���� �Է� �� ���� ���� ����(�ִ�) ���ϱ�
		for (int i = 0; i < dScore.length; i++) {
			dScore[i] = scan.nextDouble();
			if(dScore[i]>dMaximum) {
				dMaximum = dScore[i];
			}
		}
		
		// ��� ���� ����
		// ���� ����/�����������(�ִ�)*100
		for (int i = 0; i < dScore.length; i++) {
			dScore[i]=dScore[i]/dMaximum*100;
			dSum+=dScore[i];
		}
		
		// ��� ���
		System.out.println(dSum/dScore.length);
		
	}

}
