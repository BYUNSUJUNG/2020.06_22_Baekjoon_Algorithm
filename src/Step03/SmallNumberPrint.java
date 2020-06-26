package Step03;

import java.util.Scanner;

public class SmallNumberPrint {

	// 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 
	// 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 수열 A가 저장될 변수
		int[] iNumA;
		// 정수 N;
		int iNumN;
		// 정수 X;
		int iNumX;
		
		// 정수 N 입력
		iNumN = scan.nextInt();
		// 정수 N개로 이루어진 수열 A
		iNumA = new int[iNumN];
		
		// 정수 X 입력
		iNumX = scan.nextInt();
		
		// 수열 A에 들어갈 정수 N개입력
		for (int i = 0; i < iNumA.length; i++) {
			iNumA[i] = scan.nextInt();
		}
		
		// 수열 A에 있는 수와 정수 X를 비교
		for (int i = 0; i < iNumA.length; i++) {
			// 수열 A에서 정수 X보다 작은 수 출력
			if(iNumA[i]<iNumX) {
				System.out.print(iNumA[i]+" ");
			}
		}
	}
}
