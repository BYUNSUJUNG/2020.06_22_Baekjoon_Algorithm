package Step02;

import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {
		// ���: ������ 4�� ����̸鼭, 100�� ����� �ƴ� �� 
		//		�Ǵ� 400�� ��� �� ��
		
		Scanner scan = new Scanner(System.in);
		// ���� �Է�
		int iYear = scan.nextInt();
		
		// �����̸� 1�� ���, ������ �ƴϸ� 0�� ���
		if((iYear%4==0)&&(iYear%100!=0)||(iYear%400==0)) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}

}
