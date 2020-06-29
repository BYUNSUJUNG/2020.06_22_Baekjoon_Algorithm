package Step06;

import java.util.Scanner;

public class NewAverage {

	/*
	 * 세준이는 기말고사를 망쳤다. 
	 * 세준이는 점수를 조작해서 집에 가져가기로 했다. 
	 * 일단 세준이는 자기 점수 중에 최댓값을 골랐다. 
	 * 이 값을 M이라고 한다. 
	 * 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
	 * 
	 * 새로운 평균을 구하는 프로그램를 구하시오
	 * 점수의 범위는 0 ~ 100
	 * */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 과목 개수 입력
		int iInput = scan.nextInt();
		// 각 과목에 따른 점수
		double[] dScore = new double[iInput];
		// 가장 높은 점수(최댓값)
		double dMaximum = 0;
		// 모든 점수의 합
		double dSum = 0;
		
		// 점수 입력 및 가장 높은 점수(최댓값) 구하기
		for (int i = 0; i < dScore.length; i++) {
			dScore[i] = scan.nextDouble();
			if(dScore[i]>dMaximum) {
				dMaximum = dScore[i];
			}
		}
		
		// 모든 점수 조작
		// 실제 점수/가장높은점수(최댓값)*100
		for (int i = 0; i < dScore.length; i++) {
			dScore[i]=dScore[i]/dMaximum*100;
			dSum+=dScore[i];
		}
		
		// 평균 출력
		System.out.println(dSum/dScore.length);
		
	}

}
