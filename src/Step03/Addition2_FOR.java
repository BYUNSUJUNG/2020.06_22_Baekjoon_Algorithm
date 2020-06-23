package Step03;

import java.util.Scanner;

public class Addition2_FOR {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// µ¡¼ÀÇÒ È½¼ö ÀÔ·Â
		int iCnt = scan.nextInt();
		int	iSum;
		// µ¡¼ÀÇÒ °ª ÀÔ·Â¹× Ãâ·Â
		for (int i = 0; i < iCnt; i++) {
			iSum = scan.nextInt() + scan.nextInt();
			System.out.println(iSum);
		}
	}
}
