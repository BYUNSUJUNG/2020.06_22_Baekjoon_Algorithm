package Step01;
import java.util.Scanner;

public class ArithmeticOperations2 {

	public static void main(String[] args) {
		/*
		 * 첫째 줄에 (A+B)%C, 
		 * 둘째 줄에 ((A%C) + (B%C))%C, 
		 * 셋째 줄에 (A×B)%C, 
		 * 넷째 줄에 ((A%C) × (B%C))%C를 출력
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
