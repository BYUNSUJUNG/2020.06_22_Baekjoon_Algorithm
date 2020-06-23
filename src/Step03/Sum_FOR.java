package Step03;

import java.util.Scanner;

public class Sum_FOR {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 1부터 iNum까지 합을 출력
		int iNum = scan.nextInt();
		int iSum = 0;
		
		for (int i = 1; i <= iNum; i++) {
			iSum+=i;
		}
		System.out.println(iSum);
	}
}
