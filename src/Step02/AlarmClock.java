package Step02;

import java.util.Scanner;

public class AlarmClock {

	
	// �ÿ� ���� �Է��ϰ�, �Էµ� �ð����� 45�� ���� �ð��� ����Ѵ�
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		// ��, �� �Է�
		int iHour = scan.nextInt();
		int iMinute = scan.nextInt();
		
		// �Է��� "��"�� 45�� �̻��� �� 
		if(iMinute>=45) {
			iMinute-=45;
		} else { // �Է��� "��"�� 45�� �̸��� ��
			if(iHour==0) { // "��"�� 0�� ���� ���
				iHour=23;
			}else {
				iHour-=1;
			}
			iMinute+=15;
		}
		System.out.println(iHour+" "+iMinute);
		
	}

}
