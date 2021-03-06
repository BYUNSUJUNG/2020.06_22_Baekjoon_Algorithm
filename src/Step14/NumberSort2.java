// 입력: Scanner
// 정렬: mergeSort() 메소드 
// for 반복문 사용
// 결과: 시간초과

package Step14;

import java.util.Arrays;
import java.util.Scanner;

public class NumberSort2 {
	static int[] iNum;
	static int[] tmp;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 숫자 개수 입력
		int iInput = scan.nextInt();
		
		// 숫자 입력
		iNum = new int[iInput];
		tmp = new int[iInput];
		
		for (int i = 0; i < iInput; i++) {
			iNum[i] = scan.nextInt();
		}
		
		// 정렬
		mergeSort(0,iNum.length-1);
		
		
		// 출력
		for (int result : iNum) {
			System.out.println(result);
		}
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
