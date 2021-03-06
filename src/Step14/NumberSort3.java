// 입력: BufferedReader
// 정렬: Arrays.sort()
// for 반복문 사용
// 결과: 시간초과

package Step14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class NumberSort3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int iInput = Integer.parseInt(bf.readLine()); //Int
		
		// 숫자 입력
		int[] iNum = new int[iInput];
		for (int i = 0; i < iNum.length; i++) {
			iNum[i] = Integer.parseInt(bf.readLine());
		}
		
		// 숫자 정렬(오름차순)
		Arrays.sort(iNum);
		
		// 출력
		// 출력
		for (int i = 0; i < iNum.length; i++) {
			bw.write(iNum[i]+"\n");
		}
		bw.flush();
		bw.close();
	}

}
