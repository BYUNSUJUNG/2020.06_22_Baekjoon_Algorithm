package Step05;

import java.util.Scanner;

public class StarPrint3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int iCnt = scan.nextInt();
		
		for (int i = 1; i <= iCnt; i++) {
			for (int j = 1; j <= iCnt; j++) {
				if(j%2==0) {// ¦���� ��
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
				if(j==iCnt) {
					System.out.println();
				}
			}
			for (int j = 1; j <= iCnt; j++) {
				if(j%2==0) {// ¦���� ��
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				if(j==iCnt) {
					System.out.println();
				}
			}
		}
	}
}
