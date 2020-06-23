package Step02;

import java.util.Scanner;

public class GradesPrint_IF {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 점수 입력
		int iScore = scan.nextInt();
		// 점수에 따른 출력
		if((iScore>=90)&&(iScore<=100)) { // 90 ~ 100
			System.out.println("A");
		} else if((iScore>=80)&&(iScore<90)) { // 80 ~ 89
			System.out.println("B");
		} else if((iScore>=70)&&(iScore<80)) { // 70 ~ 79
			System.out.println("C");
		} else if((iScore>=60)&&(iScore<70)) { // 60 ~ 69
				System.out.println("D");
		} else { // ~ 59
			System.out.println("F");
		}
	}
}
