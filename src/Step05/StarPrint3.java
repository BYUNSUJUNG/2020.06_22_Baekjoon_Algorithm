// 입력 값이 짝수일 때, 개행 공식을 찾아야함

package Step05;

import java.util.Scanner;

public class StarPrint3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 몇 번째 까지 출력할 지 입력
		// iCnt는 1부터 100까지 가능
		int iCnt = scan.nextInt();
		
		/*
		 * 입력	공간 개수
			1	1		
			2	6 = 2*4 = (2*(2*2))-2
			3	18 = 3*6 = 3*(3*2)	
			4	28 = 4*8 = (4*(4*2))-4
		 * */

		// 입력한 수가 홀수 일 때
		if((iCnt%2)!=0) {
			for (int i = 1; i <= iCnt*(iCnt*2); i++) { // 공간 개수iCnt*(iCnt*2)
				// i가 홀수일 때, 별(*)이 출력됨
				if((i%2)!=0) {
					System.out.print("*");
				} else { // i가 짝수일 때, 공백이 출력됨
					System.out.print(" ");
				}
				
				// i가 iCnt의 배수 일 때 줄 바뀜
				if((i%iCnt)==0) {
					System.out.println(" ");
				}
				
			} // end of for
		} else { // 입력한 수가 짝수 일 때
			for (int i = 1; i <= (iCnt*(iCnt*2))-iCnt; i++) { // 공간 개수iCnt*(iCnt*2)
				// i가 홀수일 때, 별(*)이 출력됨
				if((i%2)!=0) {
					System.out.print("*");
				} else { // i가 짝수일 때, 공백이 출력됨
					System.out.print(" ");
				}
				
				// i를 iCnt로 나누었을 때 나머지가 iCnt-1일 때 줄바뀜
				if((i%iCnt)==(iCnt-1)) {
					System.out.println(" ");
				}

			} // end of for
		}
	
	} // end of mainMethod

}
