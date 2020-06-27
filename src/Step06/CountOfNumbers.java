package Step06;

import java.util.Scanner;

public class CountOfNumbers {

	// 세 개의 자연수 A, B, C가 주어질 때 
	// A×B×C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지 출력
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int iInput = scan.nextInt()*scan.nextInt()*scan.nextInt(); // A×B×C
		int iLength = (int)(Math.log10(iInput)+1); // iInput의 길이 계산
		int[] iNum = new int[10]; // 각각의 숫자가 포함된 횟수
		
		for (int i = 0; i < iLength; i++) {
			switch(iInput%10) {
				case 0: iNum[0]++; break;
				case 1: iNum[1]++; break;
				case 2: iNum[2]++; break;
				case 3: iNum[3]++; break;
				case 4: iNum[4]++; break;
				case 5: iNum[5]++; break;
				case 6: iNum[6]++; break;
				case 7: iNum[7]++; break;
				case 8: iNum[8]++; break;
				case 9: iNum[9]++; break;
			}
			iInput/=10; 
		}
		
		// 각각의 숫자가 포함된 수 출력
		for (int i = 0; i < iNum.length; i++) {
			System.out.println(iNum[i]);	
		}
		
	}

}
