package Step06;

import java.util.Scanner;

public class LargestNumber {
	
	// 사용자가 비교할 정수 개수를 입력
	// 그 중에 가장 큰 수와 가장 작은 수를 출력
	// 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 초기값

		int SmallestNumber = 1000000; // 가장 작은 수
		int largestNumber = -1000000; // 가장 큰 수
		int iCnt = scan.nextInt(); // 정수 개수 입력
		
		int[] iNum = new int[iCnt];
		for (int i = 0; i < iNum.length; i++) {
			iNum[i] = scan.nextInt();
			// 가장 작은 값 찾기
			if(iNum[i]<SmallestNumber) {
				SmallestNumber=iNum[i];
			}
			// 가장 큰 값 찾기
			if(iNum[i]>largestNumber) {
				largestNumber=iNum[i];
			}
		}
		System.out.println(SmallestNumber+" "+largestNumber);
	}
}
