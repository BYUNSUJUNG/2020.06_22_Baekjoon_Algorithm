package Step04;

import java.util.Scanner;

public class Addition4_WHILE2 {

	// �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷�
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int iNum1, iNum2;
		
		while(true) {
			iNum1 = scan.nextInt();
			iNum2 = scan.nextInt();
			
			// ���� A�� B�� ��� 0�� ��� while�ݺ��� ����
			if((iNum1==0)&&(iNum2==0)) break;
			System.out.println(iNum1 + iNum2);
		}
	}

}
