package Step02;

import java.util.Scanner;

public class AlarmClock {

	
	// 시와 분을 입력하고, 입력된 시간보다 45분 빠른 시간을 출력한다
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		// 시, 분 입력
		int iHour = scan.nextInt();
		int iMinute = scan.nextInt();
		
		// 입력한 "분"이 45분 이상일 때 
		if(iMinute>=45) {
			iMinute-=45;
		} else { // 입력한 "분"이 45분 미만일 때
			if(iHour==0) { // "시"가 0시 였을 경우
				iHour=23;
			}else {
				iHour-=1;
			}
			iMinute+=15;
		}
		System.out.println(iHour+" "+iMinute);
		
	}

}
