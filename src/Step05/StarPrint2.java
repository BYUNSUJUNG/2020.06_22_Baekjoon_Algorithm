package Step05;

import java.util.Scanner;

public class StarPrint2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 몇 번째 까지 출력할 지 입력
		int iCnt = scan.nextInt();
		
		// 뒤집어진 삼각형
		for (int i = 0; i < iCnt; i++) { // 0 1 2 3 4
			for (int j = 0; j < i; j++) { // 공백 출력
				System.out.print(" ");
			}
			
			for (int k = 0; k < (iCnt-i)*2-1; k++) {  // 별 출력
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		// 삼각형
		for (int i = 0; i < iCnt-1; i++) { // 0 1 2 3 
			for (int j = 0; j < (iCnt-2)-i; j++) { // 공백 출력
				System.out.print(" ");
			}
			
			for (int k = 0; k < (i*2)+3; k++) {  // 별 출력
				System.out.print("*");
			}
			System.out.println(" ");
		}


		
	}

}
