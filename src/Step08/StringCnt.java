package Step08;

//�����ؾ� �ߴ� �κ�: ���鸸 �Է�
import java.util.Scanner;

public class StringCnt {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// nextLine(): ���ڶǴ� ���ڿ��� �Ѷ��� ��ü�� �Է¹޴´�.
		// next(): ���ڶǴ� ���ڿ��� ������ �������� �Ѵܾ� �Ǵ� �ѹ��ھ� �Է¹޴´�.
		String sInput = scan.nextLine();
		String[] sArray = sInput.split(" ");
		
		// ������ �Է� ���� ���
		if(sArray.length==0) {
			System.out.println(0);
		} else if(sArray[0].equals("")) { // ������ ù�κ��� ""(����)�� ���
			System.out.println(sArray.length-1);
		} else {
			System.out.println(sArray.length);
		}
	}
}
