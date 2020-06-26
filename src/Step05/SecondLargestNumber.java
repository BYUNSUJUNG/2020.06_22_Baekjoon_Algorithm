package Step05;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SecondLargestNumber {

	// 정수 A, B, C를 입력한다
	// 두번째로 큰 정수를 찾는다
	// 정수 A, B, C는 1이상 100이하의 정수이다
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 초기값
		int largestNumber = 0;
		int SmallestNumber = 100;
		
		int[] iNum = new int[3];
		iNum[0] = scan.nextInt();
		iNum[1] = scan.nextInt();
		iNum[2] = scan.nextInt();
		
		// 오름차순
		Arrays.sort(iNum);
		System.out.println(iNum[1]);
		/*
			for (int i = 0; i < iNum.length; i++) {
				System.out.println(iNum[i]);
			}
		*/
	}

}
