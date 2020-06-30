// https://www.acmicpc.net/board/view/22366
// 40.000%를 출력해야 하는데 40%, 40.0%, 40.000, 40.000 % 등을 출력하면 오답입니다
package Step06;

import java.util.Scanner;

public class ScoreAverage {
	/*
	 * 	첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
		둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 
		이어서 N명의 점수가 주어진다. 
		점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int iInput = scan.nextInt(); // 프로그램 총 반복 횟수
		int iScoreCnt; // 점수 개수
		int[] iScore; // 점수 배열
		int iSum; // 점수 합
		int iAvg; // 점수 평균
		double dAboveAverage; // 평균 이상
		
		// 프로그램 반복
		for (int i = 0; i < iInput; i++) {
			
			iScoreCnt = scan.nextInt();
			iScore = new int[iScoreCnt]; 
			
			// 값 초기화
			iSum = 0;
			iAvg = 0;
			dAboveAverage = 0;
			
			// 점수 입력
			for (int j = 0; j < iScore.length; j++) {
				iScore[j]=scan.nextInt();
				iSum+=iScore[j];
			}
			// 평균 구하기
			iAvg=iSum/iScore.length;
			// 평균 초과 찾기
			for (int k = 0; k < iScore.length; k++) {
				// 만약 평균보다 크다면
				if(iScore[k]>iAvg) {
					dAboveAverage++;
				}
			}
			dAboveAverage=dAboveAverage/iScore.length;
			System.out.println(Math.round(dAboveAverage*100000)/1000.0+"%");
			
		}

	}

}
