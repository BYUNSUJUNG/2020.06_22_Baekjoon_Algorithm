package Step08;
import java.util.Scanner;

public class RepeatString {

	public static void main(String[] args) {
		// ù��° ���� �׽�Ʈ ���̽��� ����
		// �ι�° ���� �ݺ� Ƚ�� 
		Scanner scan = new Scanner(System.in);
		int iInput = scan.nextInt();
		int repeatCnt; // �ݺ� Ƚ��
		String sInput;
		String[] sInputArray;
		
		for (int i = 0; i < iInput; i++) {
			repeatCnt = scan.nextInt(); // �ݺ� Ƚ�� �Է�
			sInput = scan.next(); // ���ڿ� �Է�
			sInputArray=sInput.split(""); // �ѱ��ھ� �ڸ���
			for (int j = 0; j < sInputArray.length; j++) {
				for (int k = 0; k < repeatCnt; k++) {
					System.out.print(sInputArray[j]);
				}
			}
			System.out.println("");
			
		}
		
	}

}
