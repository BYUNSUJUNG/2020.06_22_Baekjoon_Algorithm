package Step11;

import java.util.Scanner;

public class FibonacciNum {
	// �Ǻ���ġ ���� 0�� 1�� �����Ѵ�. 0��° �Ǻ���ġ ���� 0�̰�, 1��° �Ǻ���ġ ���� 1�̴�. n=17�϶� ���� �Ǻ���ġ ���� �Ẹ�� ������ ����.
	// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597 ......
	static Scanner scan = new Scanner(System.in);
	static int iNum = scan.nextInt();
	
	public static void main(String[] args) {
		System.out.println(FibonacciMethod(iNum));
	}
	static int FibonacciMethod(int iNum) {
		// iNum�� 0�̸� 0, 1�̸� 1
		if(iNum<2) {
			return iNum;
		} else {
			return  FibonacciMethod(iNum-1) + FibonacciMethod(iNum-2);
		}
	}
}
