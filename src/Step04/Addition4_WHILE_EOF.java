package Step04;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Addition4_WHILE_EOF {

	// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int	iSum; 
	
		// Scanner 클래스의 EOF처리 (End of File)
		while(scan.hasNextInt()) {
			iSum = scan.nextInt() + scan.nextInt();
			System.out.println(iSum);
		}	
	}

}
