package Step02;

import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {
		// 운년: 연도가 4의 배수이면서, 100의 배수가 아닐 때 
		//		또는 400의 배수 일 때
		
		Scanner scan = new Scanner(System.in);
		// 연도 입력
		int iYear = scan.nextInt();
		
		// 윤년이면 1를 출력, 윤년이 아니면 0를 출력
		if((iYear%4==0)&&(iYear%100!=0)||(iYear%400==0)) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}

}
