// ArrayList를 이용

package Step06;

import java.util.ArrayList;
import java.util.Scanner;

public class CountOfAnotherRemainder_ARRAYLIST {

	// 수 10개를 입력받은 뒤, 
	// 이를 42로 나눈 나머지를 구한다. 
	// 그 다음 서로 다른 값이 몇 개 있는지 출력
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] iNum = new int[10]; // 10개의 수
		ArrayList<Integer> remainder = new ArrayList<Integer>(); // 10개의 수에 대한 나머지
		ArrayList<Integer> anotherRemainder = new ArrayList<Integer>(); // 중복제거한 나머지
		
		// 수 10개 입력하고
		// 42로 나눈 나머지를 구함
		for (int i = 0; i < iNum.length; i++) {
			iNum[i] = scan.nextInt();
			remainder.add(iNum[i]%42);	
		}
		// System.out.println(remainder); 
		
		// 서로 다른 나머지를 anotherRemainder 리스트에 넣는다.
		for (int i = 0; i < remainder.size(); i++) {
			if(!anotherRemainder.contains(remainder.get(i))) {
				anotherRemainder.add(remainder.get(i));
			}
		}
		// 서로 다른 나머지의 개수 출력
		//System.out.println(anotherRemainder);
		System.out.println(anotherRemainder.size());
	}
}
