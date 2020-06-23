package Step01;
import java.util.Scanner;

public class Multiplication2 {

	public static void main(String[] args) {
		// (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
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
		// 출력: (3), (4), (5), (6)에 들어갈 값을 출력한다

		Scanner scan = new Scanner(System.in);
		int iNum1 = scan.nextInt(); // 472
		int iNum2 = scan.nextInt(); // 385
		
		// (2)에 입력되는 수를 하나씩 변수에 넣는다.
		// hundreds : 백의자리
		// tens : 십의 자리
		// units : 일의자리

		int iNum2_hundreds = iNum2/100; // 백의자리 // 3
		int iNum2_tens = (iNum2/10)%10; // 십의 자리 // 8
		int iNum2_units = iNum2%10; // 일의 자리 // 5
		
		/*
			System.out.println(iNum2_hundreds); // 3
			System.out.println(iNum2_tens); // 8
			System.out.println(iNum2_units); // 5 
		*/
		
		// (3)의 값: 4 7 2 * 5  =  iNum1 * iNum2_units
		int iNum3 = iNum1 * iNum2_units;
		// (4)의 값: 4 7 2 * 8  =  iNum1 * iNum2_tens
		int iNum4 = iNum1 * iNum2_tens;
		// (5)의 값: 4 7 2 * 3  =  iNum1 * iNum2_hundreds
		int iNum5 = iNum1 * iNum2_hundreds;
		// (6)의 값: (3) + ((4)*10) + ((5)*100) 
		int iNum6 = iNum3 + iNum4*10 + iNum5*100;
		
		System.out.print(iNum3+"\n"+iNum4+"\n"+iNum5+"\n"+iNum6);
	}

}
