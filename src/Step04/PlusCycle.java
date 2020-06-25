package Step04;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class PlusCycle {

	/*
	   	ù��° ���� N�� 0���� ũ�ų� ����, 99���� �۰ų� ����
	  	0 <= N, 99 >= N
	  	
	 	N�� 26�̶�� 2+6=8  => 68	-- (1)
	 	�־��� ���� ���� ������ �ڸ� ���� 
		�տ��� ���� ���� ���� ������ �ڸ� ���� 
		�̾� ���̸� ���ο� ���� ���´�
		
	 	68, 6+8=14 --(2)
	 	84, 8+4=12 --(3)
	 	42, 4+2=6 --(4)
	 	4ȸ�� ���ϱ� ����Ŭ�� �ٽ� 26�� �Ǿ���.
	 	��, ����Ŭ�� ���̴� 4
	 	
	 */
	 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int	iInput; // ó�� �Է��ϴ� ��
		int iNum = 0; // ���ϱ� ����Ŭ�� �� 
		int iCnt = 0; // ����Ŭ�� ����
		
		int iPlusNum1; // ������ ���Ǵ� ù��° ��
		int iPlusNum2; // ������ ���Ǵ� �ι�° ��
		int iSum; // ���� ��
		
		// �� �Է�
		// 0 <= iInput, 99 >= iInput
		iInput = scan.nextInt();
		
		
		// iInput���� iNum���� ���� ��, �ݺ��� ����
		// ����: do-while���� �ƴ� while���� ����ϸ�
		// 		iInput���� 0�� ���,
		//		���� ���;��ϴ� ���� 1�� �ƴ� 0�� ������ �ȴ�.
		// 		����, do-while���� ����ϴ� ���� �����ϴ�
		do {
			if(iCnt==0) iNum = iInput;
			iPlusNum1 = iNum/10; // �Է� ���� 10�� �ڸ��� ���� ������ ���Ǵ� ù��° ���� �ȴ�.
			iPlusNum2 = iNum%10; // �Է� ���� 1�� �ڸ��� ��
			iSum = iPlusNum1 + iPlusNum2;
			
			// iPlusNum2�� 1�� �ڸ����� iNum(���ϱ� ����Ŭ�� ���ο� ��)�� 10�� �ڸ�����
			iNum = (iPlusNum2%10)*10;
			// iSum�� 1�� �ڸ����� iNum�� 1�� �ڸ�����
			iNum+= iSum%10;
				
			iCnt++; // ����Ŭ ���� +1
		} while(iInput!=iNum);
		System.out.println(iCnt);
		
	}

}
