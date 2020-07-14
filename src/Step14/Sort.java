package Step14;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Sort {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //����
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//����
		
		// �� ���� �Է�
		int iCnt = Integer.parseInt(bf.readLine());
		// ���� �� �迭
		int[] iNum = new int[iCnt];
		
		// �� �Է�
		for (int i = 0; i < iNum.length; i++) {
			iNum[i] = Integer.parseInt(bf.readLine());
		}
		
		// ����
		Arrays.sort(iNum);
		
		// ���
		for (int i = 0; i < iNum.length; i++) {
			bw.write(iNum[i]+"\n");
		}
		
		bw.flush();//�����ִ� �����͸� ��� ��½�Ŵ
		bw.close();//��Ʈ���� ����
	}

}
