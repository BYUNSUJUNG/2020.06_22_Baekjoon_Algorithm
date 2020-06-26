package Step03;

import java.util.Scanner;

public class StarPrint {

	// 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
	// but, 오른쪽 정렬
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 몇 번째 까지 출력할 지 입력
		int iCnt = scan.nextInt();
		
		// 반복문
		for (int i = 0; i < iCnt; i++) {
			for (int j = 0; j < (iCnt-i)-1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
