// �Է�: BufferedReader
// ����: mergeSort() �޼ҵ�
// for �ݺ��� ���
// ���: �ð��ʰ�

package Step14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class NumberSort4 {
	static int[] iNum;
	static int[] tmp;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //����
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int iInput = Integer.parseInt(bf.readLine()); //Int
		
		// ���� �Է�
		int[] iNum = new int[iInput];
		for (int i = 0; i < iNum.length; i++) {
			iNum[i] = Integer.parseInt(bf.readLine());
		}
		
		// ����
		mergeSort(0,iNum.length-1);
		
		// ���
		for (int i = 0; i < iNum.length; i++) {
			bw.write(iNum[i]+"\n");
		}
		bw.flush();
		bw.close();
	}
	
	
	public static void mergeSort(int start, int end) {
		if (start<end) {
			int mid = (start+end) / 2; mergeSort(start, mid);
			mergeSort(mid+1, end); 
			int p = start; 
			int q = mid + 1; 
			int idx = p;
			while (p<=mid || q<=end) { 
				if (q>end || (p<=mid && iNum[p]<iNum[q])) {
					tmp[idx++] = iNum[p++]; 
				} else { 
					tmp[idx++] = iNum[q++]; 
				} 
			}
			for (int i=start;i<=end;i++) { 
				iNum[i]=tmp[i]; 
			} 
		}
	}
}
