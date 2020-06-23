package Step02;

import java.util.Scanner;

public class GradesPrint2_SWITCH {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 점수 입력
		int iScore = scan.nextInt();
		// 점수에 따른 출력
		switch(iScore/10) {
			case 10: 
			case 9: System.out.println("A"); // 90 ~ 100
					break;
			case 8: System.out.println("B"); // 80 ~ 89
					break;
			case 7: System.out.println("C"); // 70 ~ 79
					break;
			case 6: System.out.println("D"); // 60 ~ 69
					break;
			default: System.out.println("F"); // ~ 59
					break;
				
		}
	}
}
