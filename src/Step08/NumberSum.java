package Step08;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

// ù° �ٿ� ������ ���� N (1 �� N �� 100)�� �־�����. 
// ��° �ٿ� ���� N���� ������� �־�����.

// ��° �ٿ� �Էµ� ���ڵ��� ���� ���

public class NumberSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// ������ ���� �Է�
		int iCnt = scan.nextInt();
		// ���� �Է�
		double dNum = scan.nextDouble();
		BigDecimal dDecimalNum = BigDecimal.valueOf(dNum);
		BigDecimal iNum = BigDecimal.valueOf(10);
		// ��
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
