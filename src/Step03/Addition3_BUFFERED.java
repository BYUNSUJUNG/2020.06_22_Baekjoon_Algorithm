package Step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Addition3_BUFFERED {

	public static void main(String[] args) throws IOException {
		// 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 덧셈할 횟수 입력
		int iCnt = Integer.parseInt(br.readLine().trim()); // Int , trim()은 공백제거
		// String s = bf.readLine(); // readLine 자체는 String, 그렇기 때문에 parseInt를 사용해야한다.
		
		// 덧셈할 값 입력및 출력
		for (int i=0; i < iCnt; i++) {
            String text = br.readLine();
            String[] word = text.split(" "); // split(" ")일 경우, 공백을 기준으로 문자열 자르기
            int a = Integer.parseInt(word[0]);
            int b = Integer.parseInt(word[1]);
            bw.write((a+b) + "\n");
        }
		bw.flush();
        bw.close();
		
	}
}
