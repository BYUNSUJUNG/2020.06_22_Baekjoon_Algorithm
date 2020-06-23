package Step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Addition3_BUFFERED {

	public static void main(String[] args) throws IOException {
		// ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// ������ Ƚ�� �Է�
		int iCnt = Integer.parseInt(br.readLine().trim()); // Int , trim()�� ��������
		// String s = bf.readLine(); // readLine ��ü�� String, �׷��� ������ parseInt�� ����ؾ��Ѵ�.
		
		// ������ �� �Է¹� ���
		for (int i=0; i < iCnt; i++) {
            String text = br.readLine();
            String[] word = text.split(" "); // split(" ")�� ���, ������ �������� ���ڿ� �ڸ���
            int a = Integer.parseInt(word[0]);
            int b = Integer.parseInt(word[1]);
            bw.write((a+b) + "\n");
        }
		bw.flush();
        bw.close();
		
	}
}
