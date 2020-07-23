package Step14;

//�ð��ʰ�
import java.util.*;

public class AgeSort {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int iInputCnt = scan.nextInt();
		int[] iAgeArr = new int[iInputCnt];	
		int[] iSortAgeArr = new int[iInputCnt];
		String[] iNameArr = new String[iInputCnt];
		List <String> iSameAgeNameArr = new ArrayList<String>();
		List <String> iSortNameArr = new ArrayList<String>();
		
		// �Է�
		for(int i=0; i<iInputCnt; i++) {
			iAgeArr[i] = scan.nextInt();
			iNameArr[i] = scan.nextLine();
			iSortAgeArr[i] = iAgeArr[i];
		}
		
		// ���̼� ����
		Arrays.sort(iSortAgeArr);
		
		// ���̿� �ش��ϴ� �̸�, ���ο� �迭�� ����
		for (int i = 0; i < iInputCnt; i++) {
			for (int j = 0; j < iInputCnt; j++) {
				// ���ĵ� ���̿� ���� ���̹迭�� index�� �ش��ϴ� �̸��� 
				// iSameAgeNameArr list�� �ִ´�.
				if(iSortAgeArr[i] == iAgeArr[j]) { 
					iSameAgeNameArr.add(iNameArr[j]);
					iSortNameArr.addAll(iSameAgeNameArr);
					iSameAgeNameArr.clear();
				}
			} // end of for
		} // end of for
		
		// ���
		for (int i=0; i < iInputCnt; i++) {
			System.out.print(iSortAgeArr[i]);
			System.out.println(iSortNameArr.get(i));
		}
		
	}
}
