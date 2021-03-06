package Step08;

//주의해야 했던 부분: 공백만 입력
import java.util.Scanner;

public class StringCnt {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// nextLine(): 문자또는 문자열을 한라인 전체를 입력받는다.
		// next(): 문자또는 문자열을 공백을 기준으로 한단어 또는 한문자씩 입력받는다.
		String sInput = scan.nextLine();
		String[] sArray = sInput.split(" ");
		
		// 공백을 입력 했을 경우
		if(sArray.length==0) {
			System.out.println(0);
		} else if(sArray[0].equals("")) { // 문장의 첫부분이 ""(공백)일 경우
			System.out.println(sArray.length-1);
		} else {
			System.out.println(sArray.length);
		}
	}
}

