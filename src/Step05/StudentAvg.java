package Step05;

import java.util.Scanner;

	
public class StudentAvg {
	
	// 학생들의 성적 평균 값 구하기
	// 학생 5명, 40점 이하의 학생은 40점으로 바꾸어 계산
	// 평균은 항상 정수
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 학생 5명의 점수
		int[] iScore = new int[5];
		int iSum = 0;		
		
		// 반복문을 이용
		for(int i=0; i<iScore.length; i++) {
			iScore[i] = scan.nextInt();
			// 40점 이하의 학생은 40점으로 바꾼다
			if(iScore[i]<40) iScore[i]=40;
			iSum+=iScore[i];
		}
		System.out.println(iSum/iScore.length);
		
	}
}
