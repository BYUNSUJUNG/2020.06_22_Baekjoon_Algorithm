package Step01;
import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		// 두 정수 A와 B를 입력받은 다음, A/B를 출력
		Scanner scan = new Scanner(System.in);
		// 실수 값을 출력하기 위해서 double 자료형을 사용하여 수를 입력받는다.
		double iNum1 = scan.nextInt();
		double iNum2 = scan.nextInt();
		System.out.println(iNum1/iNum2);
	}

}
