package Step14;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Sort {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//선언
		
		// 수 개수 입력
		int iCnt = Integer.parseInt(bf.readLine());
		// 수가 들어갈 배열
		int[] iNum = new int[iCnt];
		
		// 수 입력
		for (int i = 0; i < iNum.length; i++) {
			iNum[i] = Integer.parseInt(bf.readLine());
		}
		
		// 정렬
		Arrays.sort(iNum);
		
		// 출력
		for (int i = 0; i < iNum.length; i++) {
			bw.write(iNum[i]+"\n");
		}
		
		bw.flush();//남아있는 데이터를 모두 출력시킴
		bw.close();//스트림을 닫음
	}

}
