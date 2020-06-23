package Step01;
import java.util.Scanner;

public class ArithmeticOperations {

	public static void main(String[] args) {
		// 두 수를 입력받고,
		// 첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.
		Scanner scan = new Scanner(System.in);
		int iNum1 = scan.nextInt();
		int iNum2 = scan.nextInt();
		System.out.println(iNum1+iNum2);
		System.out.println(iNum1-iNum2);
		System.out.println(iNum1*iNum2);
		System.out.println(iNum1/iNum2);
		System.out.println(iNum1%iNum2);
	}

}
