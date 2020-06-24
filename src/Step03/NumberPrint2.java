package Step03;

import java.util.Scanner;

public class NumberPrint2 {

	public static void main(String[] args) {
		// 수를 입력하면 그 수부터 1까지 한 줄씩 출력하기
		
		Scanner scan = new Scanner(System.in);
		// 수 입력
		int iNum = scan.nextInt();
		for (int i = iNum; i > 0 ; i--) {
			System.out.println(i);
		}
	}

}
