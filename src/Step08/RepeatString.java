package Step08;
import java.util.Scanner;

public class RepeatString {

	public static void main(String[] args) {
		// 첫번째 줄은 테스트 케이스의 개수
		// 두번째 줄은 반복 횟수 
		Scanner scan = new Scanner(System.in);
		int iInput = scan.nextInt();
		int repeatCnt; // 반복 횟수
		String sInput;
		String[] sInputArray;
		
		for (int i = 0; i < iInput; i++) {
			repeatCnt = scan.nextInt(); // 반복 횟수 입력
			sInput = scan.next(); // 문자열 입력
			sInputArray=sInput.split(""); // 한글자씩 자르기
			for (int j = 0; j < sInputArray.length; j++) {
				for (int k = 0; k < repeatCnt; k++) {
					System.out.print(sInputArray[j]);
				}
			}
			System.out.println("");
			
		}
		
	}

}
