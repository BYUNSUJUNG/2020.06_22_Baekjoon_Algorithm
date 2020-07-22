package Step14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class WordSort {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int iCnt = scan.nextInt(); // �ܾ� ��
		String[] sWord = new String[iCnt]; // �ߺ� ���� �� �ܾ�迭
		int[] sWordLength; // �ܾ� ����
		String[] sNoOverlapWord = new String[iCnt]; // �ߺ� ���� �� �ܾ� �迭
		ArrayList<String> list = new ArrayList<String>(); // ���� ���� �� �־�� list
		ArrayList<String> resultList = new ArrayList<String>(); // ��� ����Ʈ
		
		// �ܾ� ����ŭ �ܾ� �Է�
		for (int i=0; i<iCnt; i++) {
			sWord[i] = scan.next();
			//sWordLength[i] = sWord[i].length();
		}
		
		// �ߺ�����
		// HashSet�� ����Ʈ�� �ߺ��� ������
		// Arrays.asList(sWord): Array(�迭)�� List(����Ʈ)�� ������ ��
		// toArray(new String[0]): 	List(����Ʈ)�� Array(�迭)�� ������ �� ����ϴ� �޼���
		// 							list�� ũ�⸸ŭ Array�� �����ϱ� ���ؼ� 0���� ����
		sWord = new HashSet<String>(Arrays.asList(sWord)).toArray(new String[0]);
		sWordLength = new int[sWord.length]; // �ߺ��� ���ŵ� �ܾ�迭�� ���̸� �迭 ������� ����
		for (int i=0; i<sWord.length; i++) {
			sWordLength[i] = sWord[i].length();
		}
		
		// ����
		for(int i=0; i<50; i++) {
			for(int j=0; j<sWord.length; j++) {
				if(sWordLength[j]==i+1) { // ���� 1���� 50���� ���̰� ���� �ܾ� ����Ʈ�� �ֱ�
					list.add(sWord[j]);
				}
			}
			Collections.sort(list); // ���̰� ���� �ܾ� ����Ʈ, �������� ����
			resultList.addAll(list); // ��� ����Ʈ�� ���ĵ� ���̰��� ����Ʈ�� ���δ�
			list.clear(); // ����Ʈ ��� �� null�� �ʱ�ȭ
		}
	
		// ���
		for (int i=0; i < resultList.size(); i++) {
			System.out.println(resultList.get(i));
		}

	}
}
