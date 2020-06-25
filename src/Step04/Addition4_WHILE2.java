package Step04;

import java.util.Scanner;

public class Addition4_WHILE2 {

	// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int iNum1, iNum2;
		
		while(true) {
			iNum1 = scan.nextInt();
			iNum2 = scan.nextInt();
			
			// 정수 A와 B가 모두 0일 경우 while반복문 종료
			if((iNum1==0)&&(iNum2==0)) break;
			System.out.println(iNum1 + iNum2);
		}
	}

}
