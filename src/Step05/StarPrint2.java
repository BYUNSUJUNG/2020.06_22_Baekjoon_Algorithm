package Step05;

import java.util.Scanner;

public class StarPrint2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 몇 번째 까지 출력할 지 입력
		int iCnt = scan.nextInt();
		
		// 반복문
		for (int i = 0; i < iCnt; i++) { 
			for (int j = 0; j < i; j++) { // 공백 출력
				System.out.print(" ");
			}
			/*
				for (int k = iCnt-i; k < (k*2)-1; k++) {  // 별 출력
					
				}
			*/
			System.out.println("");
		}


		
	}

}
