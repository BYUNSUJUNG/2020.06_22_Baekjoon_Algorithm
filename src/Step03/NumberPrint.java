package Step03;

import java.util.Scanner;

public class NumberPrint {

	public static void main(String[] args) {
		// 수를 입력하면 1부터 그 수까지 한 줄씩 출력하기
		
		Scanner scan = new Scanner(System.in);
		// 수 입력
		int iNum = scan.nextInt();
		for (int i = 0; i < iNum; i++) {
			System.out.println(i+1);
		}
	}

}
