package Step03;

import java.util.Scanner;

public class Addition2_FOR2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// ������ Ƚ�� �Է�
		int iCnt = scan.nextInt();
		int	iSum;
		// ������ �� �Է¹� ���
		for (int i = 0; i < iCnt; i++) {
			iSum = scan.nextInt() + scan.nextInt();
			System.out.println("Case #"+(i+1)+": "+iSum);
		}
	}
}
