package Step05;

import java.util.Scanner;

	
public class HamburgerSet {
	
	// �ܹ��� 3����, ���� 2����
	// ��Ʈ ���Խ� 50����
	// ���� �� ��Ʈ �޴��� ������ ���
	// ��� ������ 2000�� ����
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		int[] iHamburger = new int[3]; // �ܹ��� ����
		int[] iDrink = new int[2]; // ���� ����
		
		int iCheapHamburge = 2000;
		int iCheapDrink = 2000;
		
		// �ܹ��� ���� �Է�
		for(int i=0; i<iHamburger.length; i++) {
			iHamburger[i] = scan.nextInt();
			
			// ���� �� �ܹ��� �� ã��
			if(iHamburger[i]<iCheapHamburge) {
				iCheapHamburge=iHamburger[i];
			}
		}
		// ���� ���� �Է�
		for(int i=0; i<iDrink.length; i++) {
			iDrink[i] = scan.nextInt();
			
			// ���� �� ���� �� ã��
			if(iDrink[i]<iCheapDrink) {
				iCheapDrink=iDrink[i];
			}
		}
		System.out.println(iCheapDrink+iCheapHamburge-50);
		
	}
}
