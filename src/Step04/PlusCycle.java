package Step04;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class PlusCycle {

	/*
	   	첫번째 정수 N은 0보다 크거나 같고, 99보다 작거나 같다
	  	0 <= N, 99 >= N
	  	
	 	N이 26이라면 2+6=8  => 68	-- (1)
	 	주어진 수의 가장 오른쪽 자리 수와 
		앞에서 구한 합의 가장 오른쪽 자리 수를 
		이어 붙이면 새로운 수가 나온다
		
	 	68, 6+8=14 --(2)
	 	84, 8+4=12 --(3)
	 	42, 4+2=6 --(4)
	 	4회의 더하기 사이클로 다시 26이 되었다.
	 	즉, 사이클의 길이는 4
	 	
	 */
	 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int	iInput; // 처음 입력하는 값
		int iNum = 0; // 더하기 사이클할 값 
		int iCnt = 0; // 사이클의 길이
		
		int iPlusNum1; // 덧셈에 사용되는 첫번째 값
		int iPlusNum2; // 덧셈에 사용되는 두번째 값
		int iSum; // 더한 값
		
		// 값 입력
		// 0 <= iInput, 99 >= iInput
		iInput = scan.nextInt();
		
		
		// iInput값과 iNum값이 같을 때, 반복문 종료
		// 주의: do-while문이 아닌 while문을 사용하면
		// 		iInput값이 0일 경우,
		//		원래 나와야하는 값인 1이 아닌 0이 나오게 된다.
		// 		따라서, do-while문을 사용하는 것이 적절하다
		do {
			if(iCnt==0) iNum = iInput;
			iPlusNum1 = iNum/10; // 입력 값의 10의 자리의 수가 덧셈에 사용되는 첫번째 값이 된다.
			iPlusNum2 = iNum%10; // 입력 값의 1의 자리의 수
			iSum = iPlusNum1 + iPlusNum2;
			
			// iPlusNum2의 1의 자리수를 iNum(더하기 사이클할 새로운 값)의 10의 자리수로
			iNum = (iPlusNum2%10)*10;
			// iSum의 1의 자리수를 iNum의 1의 자리수로
			iNum+= iSum%10;
				
			iCnt++; // 사이클 길이 +1
		} while(iInput!=iNum);
		System.out.println(iCnt);
		
	}

}
