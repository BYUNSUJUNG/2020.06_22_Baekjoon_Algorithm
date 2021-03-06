package Step07;

import java.util.Scanner;

public class ArraySum {

	 /*
	 * 	Java: long sum(int[] a); (클래스 이름: Test)
		a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 
		리턴값: a에 포함되어 있는 정수 n개의 합
	*/
	
	// 합
	static int iSum = 0;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// n개의 정수
		int iNum = scan.nextInt();
		// 정수를 담는 배열
		int[] arr = new int[iNum]; 
		for (int i = 0; i < arr.length; i++) {
			// 정수입력
			arr[i] = scan.nextInt();
		}
		arrSum(arr);
	
	}
	
	static long arrSum(int[] a) {
		// 합구하기
		for (int i = 0; i < a.length; i++) {
			iSum+= a[i];
		}
		return iSum;
		
	}

}
