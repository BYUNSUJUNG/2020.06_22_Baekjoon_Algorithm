package Step04;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Addition4_WHILE_EOF {

	// �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷�
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int	iSum; 
	
		// Scanner Ŭ������ EOFó�� (End of File)
		while(scan.hasNextInt()) {
			iSum = scan.nextInt() + scan.nextInt();
			System.out.println(iSum);
		}	
	}

}
