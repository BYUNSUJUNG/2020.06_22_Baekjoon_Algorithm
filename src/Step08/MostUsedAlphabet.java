package Step08;
import java.util.ArrayList;
import java.util.Scanner;

public class MostUsedAlphabet {

	// ���ĺ� ��ҹ��ڷ� �� �ܾ �־�����, 
	// �� �ܾ�� ���� ���� ���� ���ĺ��� �������� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�. 
	// ��, �빮�ڿ� �ҹ��ڸ� �������� �ʴ´�.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sInput = scan.next();
		String[] sInputArray;
		int[] sUsedCnt;
		int largestNum = 0;
		int mostUsedAlphabetNum = 0;
		
		int multipleBeings = 0;
		
		sInputArray=sInput.split(""); // �ѱ��ھ� �迭�� �ֱ�
		sUsedCnt = new int[sInputArray.length];
		
		// ���ĺ� ���� Ƚ���� sUsedCnt �迭�� �ִ´�.
		for (int i = 0; i < sInputArray.length; i++) {
			for (int j = 0; j < sInputArray.length; j++) {
				if(sInputArray[i].equalsIgnoreCase(sInputArray[j])) {
					sUsedCnt[i] += 1;
				}
			}
		}
		
		// sUsedCnt �迭���� ���� ū ���� ã�´�.
		for (int k = 0; k < sUsedCnt.length; k++) {
			if(sUsedCnt[k]>largestNum) {
				largestNum = sUsedCnt[k];
				mostUsedAlphabetNum=k;
			} 
		}
		
		// sUsedCnt �迭���� ���� ū ��(mostUsedAlphabetNum)�� �������� ���
		for (int k = 0; k < sUsedCnt.length; k++) {
			if(sUsedCnt[k]==largestNum) {
				multipleBeings++;
			} 
		}
		//System.out.println(largestNum);
		//System.out.println(multipleBeings);
		// �ڱ� �ڽŵ� ���ԵǱ� ������ multipleBeings�� 2�̻��� �� "?" ���
		if(multipleBeings>largestNum)  {
			System.out.println("?");
		} else { // multipleBeings == false
			// toUpperCase() : ��� ���ڿ��� �빮�ڷ� ��ȯ
			System.out.println(sInputArray[mostUsedAlphabetNum].toUpperCase());
		}
		
		
		
	}

}
