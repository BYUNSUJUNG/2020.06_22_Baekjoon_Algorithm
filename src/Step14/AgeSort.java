package Step14;

//시간초과
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
		
		// 입력
		for(int i=0; i<iInputCnt; i++) {
			iAgeArr[i] = scan.nextInt();
			iNameArr[i] = scan.nextLine();
			iSortAgeArr[i] = iAgeArr[i];
		}
		
		// 나이순 정렬
		Arrays.sort(iSortAgeArr);
		
		// 나이에 해당하는 이름, 새로운 배열에 정렬
		for (int i = 0; i < iInputCnt; i++) {
			for (int j = 0; j < iInputCnt; j++) {
				// 정렬된 나이와 같은 나이배열의 index에 해당하는 이름을 
				// iSameAgeNameArr list에 넣는다.
				if(iSortAgeArr[i] == iAgeArr[j]) { 
					iSameAgeNameArr.add(iNameArr[j]);
					iSortNameArr.addAll(iSameAgeNameArr);
					iSameAgeNameArr.clear();
				}
			} // end of for
		} // end of for
		
		// 출력
		for (int i=0; i < iInputCnt; i++) {
			System.out.print(iSortAgeArr[i]);
			System.out.println(iSortNameArr.get(i));
		}
		
	}
}
