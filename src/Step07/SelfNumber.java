package Step07;

import java.util.ArrayList;

public class SelfNumber {

	/*
	 * 	n�� d(n)�� ������
	 *  33���� �����Ѵٸ� ���� ���� 33 + 3 + 3 = 39�̰�, 
	 *  �� ���� ���� 39 + 3 + 9 = 51, 
	 *  ���� ���� 51 + 5 + 1 = 57�̴�
	 *  
	 *  33�� 39�� �������̰�, 39�� 51�� ������, 51�� 57�� ������
	 *  
	 *  ���� �ѹ�: �����ڰ� ���� ����
	 *  10000���� �۰ų� ���� ���� �ѹ��� �� �ٿ� �ϳ��� ���
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
			if (!iNotSelfNumber.contains(i)) { // �����ѹ�
				System.out.println(i);
			}
		}
		*/
		
	}

}
