package Step01;
import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		// �� ���� A�� B�� �Է¹��� ����, A/B�� ���
		Scanner scan = new Scanner(System.in);
		// �Ǽ� ���� ����ϱ� ���ؼ� double �ڷ����� ����Ͽ� ���� �Է¹޴´�.
		double iNum1 = scan.nextInt();
		double iNum2 = scan.nextInt();
		System.out.println(iNum1/iNum2);
	}

}
