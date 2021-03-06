//입력: Scanner
//정렬: Arrays.sort()
//for 반복문 사용
//결과: 시간초과

package Step14;

import java.util.Arrays;
import java.util.Scanner;

public class NumberSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 숫자 개수 입력
		int iInput = scan.nextInt();
		
		// 숫자 입력
		int[] iNum = new int[iInput];
		for (int i = 0; i < iNum.length; i++) {
			iNum[i] = scan.nextInt();
		}
		
		// 숫자 정렬(오름차순)
		Arrays.sort(iNum);
		
		// 출력
		for (int i = 0; i < iNum.length; i++) {
			System.out.println(iNum[i]);
		}
	}

}
