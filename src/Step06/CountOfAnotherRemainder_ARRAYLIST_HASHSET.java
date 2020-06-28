// ArrayList, HashSet�� �̿�
// HashSet�� �ߺ��� ������� ����
package Step06;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class CountOfAnotherRemainder_ARRAYLIST_HASHSET {

	// �� 10���� �Է¹��� ��, 
	// �̸� 42�� ���� �������� ���Ѵ�. 
	// �� ���� ���� �ٸ� ���� �� �� �ִ��� ���
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] iNum = new int[10]; // 10���� ��
		ArrayList<Integer> remainder = new ArrayList<Integer>(); // 10���� ���� ���� ������
		
		// �� 10�� �Է��ϰ�
		// 42�� ���� �������� ����
		for (int i = 0; i < iNum.length; i++) {
			iNum[i] = scan.nextInt();
			remainder.add(iNum[i]%42);	
		}
		// System.out.println(remainder); 
		
		// ArrayList�� HashSet�� �־� �ߺ��� �����Ѵ�
		HashSet<Integer> anotherRemainder = new HashSet<Integer>(remainder);
		
		// ���� �ٸ� �������� ���� ���
		System.out.println(anotherRemainder.size());
	}
}