package Step01;
import java.util.Scanner;

public class ArithmeticOperations2 {

	public static void main(String[] args) {
		/*
		 * ù° �ٿ� (A+B)%C, 
		 * ��° �ٿ� ((A%C) + (B%C))%C, 
		 * ��° �ٿ� (A��B)%C, 
		 * ��° �ٿ� ((A%C) �� (B%C))%C�� ���
		 * */
		Scanner scan = new Scanner(System.in);
		int iNum1 = scan.nextInt();
		int iNum2 = scan.nextInt();
		int iNum3 = scan.nextInt();
		System.out.println((iNum1+iNum2)%iNum3);
		System.out.println(((iNum1%iNum3) + (iNum2%iNum3))%iNum3);
		System.out.println((iNum1*iNum2)%iNum3);
		System.out.println(((iNum1%iNum3)*(iNum2%iNum3))%iNum3);
	}

}
