package Step02;

import java.util.Scanner;

// ��и�
public class Quadrant {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// X, Y �� �Է�
		int X = scan.nextInt();
		int Y = scan.nextInt();
		
		// X, Y ���� ���� ��и� ���
		if((X>0)&&(Y>0)) { // X > 0, Y > 0 : 1��и�
			System.out.println("1");
		} else if((X<0)&&(Y>0)) { // X < 0, Y > 0 : 2��и�
			System.out.println("2");
		} else if((X<0)&&(Y<0)) { // X < 0, Y < 0 : 3��и�
			System.out.println("3");
		} else { // X > 0, Y < 0 : 4��и�
			System.out.println("4");
		}
	}
}
