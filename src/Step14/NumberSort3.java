// �Է�: BufferedReader
// ����: Arrays.sort()
// for �ݺ��� ���
// ���: �ð��ʰ�

package Step14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class NumberSort3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //����
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int iInput = Integer.parseInt(bf.readLine()); //Int
		
		// ���� �Է�
		int[] iNum = new int[iInput];
		for (int i = 0; i < iNum.length; i++) {
			iNum[i] = Integer.parseInt(bf.readLine());
		}
		
		// ���� ����(��������)
		Arrays.sort(iNum);
		
		// ���
		// ���
		for (int i = 0; i < iNum.length; i++) {
			bw.write(iNum[i]+"\n");
		}
		bw.flush();
		bw.close();
	}

}
