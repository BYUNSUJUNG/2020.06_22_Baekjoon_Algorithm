package Step03;

import java.util.Scanner;

public class MultiplicationTable {

	// 구구단 출력
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// n단 입력
		int iNum = scan.nextInt();
		for (int i = 1; i < 10; i++) {
			System.out.println(iNum+" * "+i+" = "+(iNum*i));
		}
	}

}
