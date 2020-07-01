package Step07;

import java.util.ArrayList;

public class SelfNumber {

	/*
	 * 	n는 d(n)의 생성자
	 *  33으로 시작한다면 다음 수는 33 + 3 + 3 = 39이고, 
	 *  그 다음 수는 39 + 3 + 9 = 51, 
	 *  다음 수는 51 + 5 + 1 = 57이다
	 *  
	 *  33은 39의 생성자이고, 39는 51의 생성자, 51은 57의 생성자
	 *  
	 *  셀프 넘버: 생성자가 없는 숫자
	 *  10000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 출력
	 * */
	public static void main(String[] args) {
		int iNum = 0;
		ArrayList iNotSelfNumber = new ArrayList();
		for (int i = 1; ; i++) {
			
			iNum = i;
			while(i!=0) {
				iNum += i % 10;
				i = i / 10;
			}
			if(iNum>=10000) break;
			System.out.println(iNum);
			//iNotSelfNumber.add(iNum);
			
		}
		/*
		for (int j = 0; j < iNotSelfNumber.size(); j++) {
			System.out.println(iNotSelfNumber.get(j));
		}*/
		/*
		
		for (int i = 0; i < 10000; i++) {
			if (!iNotSelfNumber.contains(i)) { // 셀프넘버
				System.out.println(i);
			}
		}
		*/
		
	}

}
