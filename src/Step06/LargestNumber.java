package Step06;

import java.util.Scanner;

public class LargestNumber {
	
	// 9개의 서로 다른 자연수가 주어질 때, 
	// 최댓값을 찾고, 그 최댓값이 몇 번째 수인지 출력
	// 주어지는 자연수는 100 보다 작다
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 초기값
		int largestNumber = 0; // 최댓값
		int[] iNum = new int[9]; // 9개의 서로 다른 자연수
		int iCnt = 0; // 최댓값의 위치
		
		// 자연수 입력 반복문
		for (int i = 0; i < iNum.length; i++) {
			iNum[i] = scan.nextInt();
			// 가장 큰 값 찾기
			if(iNum[i]>largestNumber) {
				largestNumber=iNum[i];
				iCnt=i+1;
			}
		}
		System.out.println(largestNumber);
		System.out.println(iCnt);
	}
}
