package Step06;

import java.util.Scanner;

public class oxQuiz {

	/*
	 * "OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. 
	 * O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 
	 * 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다.
	 *
	 *	"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 퀴즈 개수
		int iInput = scan.nextInt();
		// 퀴즈 답 
		String[] quiz = new String[iInput];
		// 퀴즈 결과 값
		int iScore = 0;
		// 연속적인 답: 연속하여 퀴즈의 답이 O가 나왔을 때
		int successiveAnswer = 0;
		
		// 퀴즈 답 입력
		for (int i = 0; i < quiz.length; i++) {
			quiz[i] = scan.next();
		}
		// 퀴즈 결과값 계산 및 출력
		for (int i = 0; i < quiz.length; i++) {
			for (int j = 0; j < quiz[i].length(); j++) {
				// 결과가 O
				if(quiz[i].charAt(j)=='O') {
					if(successiveAnswer>0) { // O가 연속되었다면
						iScore+=successiveAnswer+1;
					} else { // 연속되지 않았다면
						iScore+=1;
					}
					successiveAnswer++;
				} else { // 결과가 X
					iScore+=0;
					successiveAnswer=0;
				}
			}
			System.out.println(iScore);
			iScore=0;
			successiveAnswer=0;
		}
		
	}

}
