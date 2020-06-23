package Step02;

import java.util.Scanner;

public class CompareTwoNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 두 수 입력
		int iNum1 = scan.nextInt();
		int iNum2 = scan.nextInt();
		// 두 수 비교
		if(iNum1>iNum2) {
			System.out.println(">");
		} else if(iNum1<iNum2) {
			System.out.println("<");
		} else { // iNum1==iNum2
			System.out.println("==");
		}
	}
}
