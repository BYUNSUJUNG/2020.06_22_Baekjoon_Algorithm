package Step01;
import java.util.Scanner;

public class ArithmeticOperations {

	public static void main(String[] args) {
		// �� ���� �Է¹ް�,
		// ù° �ٿ� A+B, ��° �ٿ� A-B, ��° �ٿ� A*B, ��° �ٿ� A/B, �ټ�° �ٿ� A%B�� ����Ѵ�.
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
