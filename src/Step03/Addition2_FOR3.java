package Step03;

import java.util.Scanner;

public class Addition2_FOR3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// ������ Ƚ�� �Է�
		int iCnt = scan.nextInt();
		int iNum1, iNum2;
		int	iSum;
		// ������ �� �Է¹� ���
		for (int i = 0; i < iCnt; i++) {
			iNum1 = scan.nextInt();
			iNum2 = scan.nextInt();
			iSum =  iNum1 + iNum2;
			System.out.println("Case #"+(i+1)+": "+iNum1+" + "+iNum2+" = "+iSum);
		}
	}
}
