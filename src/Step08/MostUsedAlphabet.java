package Step08;
import java.util.ArrayList;
import java.util.Scanner;

public class MostUsedAlphabet {

	// 알파벳 대소문자로 된 단어가 주어지면, 
	// 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 
	// 단, 대문자와 소문자를 구분하지 않는다.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sInput = scan.next();
		String[] sInputArray;
		int[] sUsedCnt;
		int largestNum = 0;
		int mostUsedAlphabetNum = 0;
		
		int multipleBeings = 0;
		
		sInputArray=sInput.split(""); // 한글자씩 배열에 넣기
		sUsedCnt = new int[sInputArray.length];
		
		// 알파벳 나온 횟수를 sUsedCnt 배열에 넣는다.
		for (int i = 0; i < sInputArray.length; i++) {
			for (int j = 0; j < sInputArray.length; j++) {
				if(sInputArray[i].equalsIgnoreCase(sInputArray[j])) {
					sUsedCnt[i] += 1;
				}
			}
		}
		
		// sUsedCnt 배열에서 가장 큰 수를 찾는다.
		for (int k = 0; k < sUsedCnt.length; k++) {
			if(sUsedCnt[k]>largestNum) {
				largestNum = sUsedCnt[k];
				mostUsedAlphabetNum=k;
			} 
		}
		
		// sUsedCnt 배열에서 가장 큰 수(mostUsedAlphabetNum)가 여러개일 경우
		for (int k = 0; k < sUsedCnt.length; k++) {
			if(sUsedCnt[k]==largestNum) {
				multipleBeings++;
			} 
		}
		//System.out.println(largestNum);
		//System.out.println(multipleBeings);
		// 자기 자신도 포함되기 때문에 multipleBeings이 2이상일 때 "?" 출력
		if(multipleBeings>largestNum)  {
			System.out.println("?");
		} else { // multipleBeings == false
			// toUpperCase() : 대상 문자열을 대문자로 변환
			System.out.println(sInputArray[mostUsedAlphabetNum].toUpperCase());
		}
		
		
		
	}

}
