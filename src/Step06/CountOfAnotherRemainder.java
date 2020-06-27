// 다른 나머지가 몇개 있는지 계산

package Step06;

import java.util.Scanner;

public class CountOfAnotherRemainder {

	// 수 10개를 입력받은 뒤, 
	// 이를 42로 나눈 나머지를 구한다. 
	// 그 다음 서로 다른 값이 몇 개 있는지 출력
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] iNum = new int[10]; // 10개의 수
		int[] remainder = new int[10]; // 10개의 수에 대한 나머지
		int iCnt = 0; // 다른 나머지의 개수
		
		// 수 10개 입력하고
		// 42로 나눈 나머지를 구함
		for (int i = 0; i < iNum.length; i++) {
			iNum[i] = scan.nextInt();
			remainder[i]=iNum[i]%42;
			System.out.println(remainder[i]);
		}
		System.out.println("==============");
		/*
		// 다른 나머지가 몇개 있는지 계산
		for (int i = 0; i < iNum.length-1; i++) {
			if(remainder[i]!=remainder[i+1]) {
				iCnt++;
			}
		}
		*/
		// 출력
		System.out.println(iCnt);
	}
}
