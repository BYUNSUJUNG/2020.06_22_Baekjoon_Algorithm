package Step08;

import java.util.Scanner;

public class FindLargeNumber {

	/*
	 *  상근이의 동생인 상수는 숫자를 읽는데 문제가 있다
	 *  734와 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다
	 *  따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.
	 *  
	 *  숫자는 세자리 수
	 * */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int iNum1 = scan.nextInt(); // 첫번째 정수
		int iNum2 = scan.nextInt(); // 두번째 정수
		int[] iNumChange1 = new int[3]; // 첫번째 정수 숫자 뒤집기에 사용할 숫자 담기
		int[] iNumChange2 = new int[3]; // 두번째 정수 숫자 뒤집기에 사용할 숫자 담기
		int temp; // 임시 공간
		
		// 숫자 뒤집기에 사용할 숫자 담기
		for (int i = 0; i < iNumChange1.length; i++) {
			iNumChange1[i]=iNum1%10;
			iNum1/=10;
		}
		for (int i = 0; i < iNumChange2.length; i++) {
			iNumChange2[i]=iNum2%10;
			iNum2/=10;
		}
		
		// 숫자 뒤집기
		iNum1 = iNumChange1[0]*100 + iNumChange1[1]*10 + iNumChange1[2]*1;
		iNum2 = iNumChange2[0]*100 + iNumChange2[1]*10 + iNumChange2[2]*1;
		
		// 값바꿔치기 - iNum1에 큰 값이 들어가도록
		if(iNum2>iNum1) {
			temp = iNum2;
			iNum2 = iNum1;
			iNum1 = temp;
		}
		
		// 출력
		System.out.println(iNum1);
				
	}

}
