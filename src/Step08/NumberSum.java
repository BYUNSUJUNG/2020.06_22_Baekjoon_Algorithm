package Step08;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

// 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 
// 둘째 줄에 숫자 N개가 공백없이 주어진다.

// 둘째 줄에 입력된 숫자들의 합을 출력

public class NumberSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 숫자의 개수 입력
		int iCnt = scan.nextInt();
		// 숫자 입력
		double dNum = scan.nextDouble();
		BigDecimal dDecimalNum = BigDecimal.valueOf(dNum);
		BigDecimal iNum = BigDecimal.valueOf(10);
		// 합
		BigDecimal iSum = BigDecimal.valueOf(0);
		for (int i = 0; i < iCnt; i++) {
			iSum = iSum.add(dDecimalNum.remainder(iNum, MathContext.DECIMAL128));
			//System.out.println(i+":"+dNum % 10);
			dDecimalNum = dDecimalNum.divide(iNum, 0, RoundingMode.HALF_EVEN);
			//System.out.println(i+":"+iSum);

		}
		System.out.println(iSum);
		
	}

}
