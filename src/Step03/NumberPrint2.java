package Step03;

import java.util.Scanner;

public class NumberPrint2 {

	public static void main(String[] args) {
		// ���� �Է��ϸ� �� ������ 1���� �� �پ� ����ϱ�
		
		Scanner scan = new Scanner(System.in);
		// �� �Է�
		int iNum = scan.nextInt();
		for (int i = iNum; i > 0 ; i--) {
			System.out.println(i);
		}
	}

}
