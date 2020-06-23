package Step01;
import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// 두 정수 A와 B를 입력받은 다음, A+B를 출력
		Scanner scan = new Scanner(System.in);
		int iNum1 = scan.nextInt();
		int iNum2 = scan.nextInt();
		System.out.println(iNum1+iNum2);
	}

}
