package Step06;

import java.util.Scanner;

public class oxQuiz {

	/*
	 * "OOXXOXXOOO"�� ���� OX������ ����� �ִ�. 
	 * O�� ������ ���� ���̰�, X�� ������ Ʋ�� ���̴�. 
	 * ������ ���� ��� �� ������ ������ �� �������� ���ӵ� O�� ������ �ȴ�.
	 *
	 *	"OOXXOXXOOO"�� ������ 1+2+0+0+1+0+0+1+2+3 = 10���̴�.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// ���� ����
		int iInput = scan.nextInt();
		// ���� �� 
		String[] quiz = new String[iInput];
		// ���� ��� ��
		int iScore = 0;
		// �������� ��: �����Ͽ� ������ ���� O�� ������ ��
		int successiveAnswer = 0;
		
		// ���� �� �Է�
		for (int i = 0; i < quiz.length; i++) {
			quiz[i] = scan.next();
		}
		// ���� ����� ��� �� ���
		for (int i = 0; i < quiz.length; i++) {
			for (int j = 0; j < quiz[i].length(); j++) {
				// ����� O
				if(quiz[i].charAt(j)=='O') {
					if(successiveAnswer>0) { // O�� ���ӵǾ��ٸ�
						iScore+=successiveAnswer+1;
					} else { // ���ӵ��� �ʾҴٸ�
						iScore+=1;
					}
					successiveAnswer++;
				} else { // ����� X
					iScore+=0;
					successiveAnswer=0;
				}
			}
			System.out.println(iScore);
			iScore=0;
			successiveAnswer=0;
		}
		
	}

}
