package Step14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class WordSort2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int iCnt = scan.nextInt(); // �Է��� �ܾ��� ����
		ArrayList<String> sWord = new ArrayList<String>(); // �ܾ�
		ArrayList<Integer> sWordLength = new ArrayList<Integer>(); // �ܾ� ����
		
		ArrayList<String> list = new ArrayList<String>(); // ���̰� ���� �ܾ �־� �� list
		ArrayList<String> resultList = new ArrayList<String>(); // ��� ����Ʈ
		
		// �Է��� �ܾ��� ������ŭ �ܾ �Է�
		for (int i=0; i<iCnt; i++) {
			sWord.add(scan.next());
		}
		
		// �ߺ��ܾ� ���� - HashSet ���
		// <��> TreeSet�� �ߺ��� ����������, �������� ���ı��� �ؼ� �� �����ɸ�
		HashSet<String> arr = new HashSet<String>(sWord);
		
		// �ߺ����ŵ� ����Ʈ �ٽ� resultList�� �ֱ�
		ArrayList<String> sWord2 = new ArrayList<String>(arr); 
		
		
		// �ܾ� ���� �ֱ�
		for (int i=0; i<sWord2.size(); i++) {
			sWordLength.add(sWord.get(i).length());
		}			
		
		// ���
		for (int i = 0; i < sWord2.size(); i++) {
			//String str = sWord.get(i);
			//System.out.println(sWord2.get(i)+","+sWordLength.get(i)+","+str.length());
			System.out.println(sWord2);
			System.out.println(sWordLength);
			
		}
//		
//		// ����
//		for(int i=0; i<50; i++) {
//			for(int j=0; j<sWord2.size(); j++) {
//				if(sWordLength.get(j)==i+1) { // ���� 1���� 50���� ���̰� ���� �ܾ� ����Ʈ�� �ֱ�
//					list.add(sWord2.get(j));
//				}
//			}
//			Collections.sort(list); // ���̰� ���� �ܾ� ����Ʈ, �������� ����
//			resultList.addAll(list); // ��� ����Ʈ�� ���ĵ� ���̰��� ����Ʈ�� ���δ�
//			list.clear(); // ����Ʈ ��� �� null�� �ʱ�ȭ
//			
//		}
			/*
		// ���
		for (int i = 0; i < sWord2.size(); i++) {
			System.out.println(sWord2.get(i));
			//System.out.println(resultList.get(i));
		}*/

	}
}
