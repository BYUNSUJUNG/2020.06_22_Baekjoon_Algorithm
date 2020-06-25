package Step05;

import java.util.Scanner;

	
public class HamburgerSet {
	
	// 햄버거 3종류, 음료 2종료
	// 세트 구입시 50할인
	// 가장 싼 세트 메뉴의 가격을 출력
	// 모든 가격은 2000원 이하
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		int[] iHamburger = new int[3]; // 햄버거 종류
		int[] iDrink = new int[2]; // 음료 종류
		
		int iCheapHamburge = 2000;
		int iCheapDrink = 2000;
		
		// 햄버거 가격 입력
		for(int i=0; i<iHamburger.length; i++) {
			iHamburger[i] = scan.nextInt();
			
			// 제일 싼 햄버거 값 찾기
			if(iHamburger[i]<iCheapHamburge) {
				iCheapHamburge=iHamburger[i];
			}
		}
		// 음료 가격 입력
		for(int i=0; i<iDrink.length; i++) {
			iDrink[i] = scan.nextInt();
			
			// 제일 싼 음료 값 찾기
			if(iDrink[i]<iCheapDrink) {
				iCheapDrink=iDrink[i];
			}
		}
		System.out.println(iCheapDrink+iCheapHamburge-50);
		
	}
}
