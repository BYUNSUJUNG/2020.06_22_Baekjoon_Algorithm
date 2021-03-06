package Step11;

import java.util.Scanner;

public class FibonacciNum {
	// 피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다. n=17일때 까지 피보나치 수를 써보면 다음과 같다.
	// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597 ......
	static Scanner scan = new Scanner(System.in);
	static int iNum = scan.nextInt();
	
	public static void main(String[] args) {
		System.out.println(FibonacciMethod(iNum));
	}
	static int FibonacciMethod(int iNum) {
		// iNum이 0이면 0, 1이면 1
		if(iNum<2) {
			return iNum;
		} else {
			return  FibonacciMethod(iNum-1) + FibonacciMethod(iNum-2);
		}
	}
}
