package Step01;
import java.util.Scanner;

public class Multiplication2 {

	public static void main(String[] args) {
		// (�� �ڸ� ��) �� (�� �ڸ� ��)�� ������ ���� ������ ���Ͽ� �̷������.
		/*
		 * 		 4 7 2		----(1) 
		 * 	x	 3 8 5		----(2) 
		 * ----------------
		 *     2 3 6 0 		----(3) 
		 * 	 3 7 7 6		----(4) 
		 * 1 4 1 6			----(5) 
		 * ----------------
		 * 1 8 1 7 2 0		----(6) 
		 * 
		 * */
		// ���: (3), (4), (5), (6)�� �� ���� ����Ѵ�

		Scanner scan = new Scanner(System.in);
		int iNum1 = scan.nextInt(); // 472
		int iNum2 = scan.nextInt(); // 385
		
		// (2)�� �ԷµǴ� ���� �ϳ��� ������ �ִ´�.
		// hundreds : �����ڸ�
		// tens : ���� �ڸ�
		// units : �����ڸ�

		int iNum2_hundreds = iNum2/100; // �����ڸ� // 3
		int iNum2_tens = (iNum2/10)%10; // ���� �ڸ� // 8
		int iNum2_units = iNum2%10; // ���� �ڸ� // 5
		
		/*
			System.out.println(iNum2_hundreds); // 3
			System.out.println(iNum2_tens); // 8
			System.out.println(iNum2_units); // 5 
		*/
		
		// (3)�� ��: 4 7 2 * 5  =  iNum1 * iNum2_units
		int iNum3 = iNum1 * iNum2_units;
		// (4)�� ��: 4 7 2 * 8  =  iNum1 * iNum2_tens
		int iNum4 = iNum1 * iNum2_tens;
		// (5)�� ��: 4 7 2 * 3  =  iNum1 * iNum2_hundreds
		int iNum5 = iNum1 * iNum2_hundreds;
		// (6)�� ��: (3) + ((4)*10) + ((5)*100) 
		int iNum6 = iNum3 + iNum4*10 + iNum5*100;
		
		System.out.print(iNum3+"\n"+iNum4+"\n"+iNum5+"\n"+iNum6);
	}

}
