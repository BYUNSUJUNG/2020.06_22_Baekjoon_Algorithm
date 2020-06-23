package Step02;

import java.util.Scanner;

// 사분면
public class Quadrant {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// X, Y 값 입력
		int X = scan.nextInt();
		int Y = scan.nextInt();
		
		// X, Y 값에 따른 사분면 출력
		if((X>0)&&(Y>0)) { // X > 0, Y > 0 : 1사분면
			System.out.println("1");
		} else if((X<0)&&(Y>0)) { // X < 0, Y > 0 : 2사분면
			System.out.println("2");
		} else if((X<0)&&(Y<0)) { // X < 0, Y < 0 : 3사분면
			System.out.println("3");
		} else { // X > 0, Y < 0 : 4사분면
			System.out.println("4");
		}
	}
}
