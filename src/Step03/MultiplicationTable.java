package Step03;

import java.util.Scanner;

public class MultiplicationTable {

	// ������ ���
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// n�� �Է�
		int iNum = scan.nextInt();
		for (int i = 1; i < 10; i++) {
			System.out.println(iNum+" * "+i+" = "+(iNum*i));
		}
	}

}
