package Step03;

import java.util.Scanner;

public class NumberPrint {

	public static void main(String[] args) {
		// ���� �Է��ϸ� 1���� �� ������ �� �پ� ����ϱ�
		
		Scanner scan = new Scanner(System.in);
		// �� �Է�
		int iNum = scan.nextInt();
		for (int i = 0; i < iNum; i++) {
			System.out.println(i+1);
		}
	}

}
