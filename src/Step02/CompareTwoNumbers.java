package Step02;

import java.util.Scanner;

public class CompareTwoNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// �� �� �Է�
		int iNum1 = scan.nextInt();
		int iNum2 = scan.nextInt();
		// �� �� ��
		if(iNum1>iNum2) {
			System.out.println(">");
		} else if(iNum1<iNum2) {
			System.out.println("<");
		} else { // iNum1==iNum2
			System.out.println("==");
		}
	}
}
