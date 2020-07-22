package Step14;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

public class LocationSort {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int iCnt = scan.nextInt();
		int[][] iLocation = new int[iCnt][2];
		int[] iXLocation = new int[iCnt];
		int[] iYLocation = new int[iCnt];
		
		for(int i=0; i<iCnt; i++) {
			iLocation[i][0] = scan.nextInt(); // X ÁÂÇ¥
			iLocation[i][1] = scan.nextInt(); // Y ÁÂÇ¥
			
			iXLocation[i] = iLocation[i][0];
		}
		
	}
	
}
