package Step08;

import java.util.Scanner;

public class Dial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// ���ڿ� �Է�
		String sInput = scan.nextLine();
		
		// ���ڿ� �ϳ��� �߶� �迭��  �ֱ�
		String[] sArr = sInput.split("");
		int[] iNum = new int[sArr.length];
		int iSum = 0;
		
		for (int i = 0; i < sArr.length; i++) {
			if(sArr[i].equals("A")||sArr[i].equals("B")||sArr[i].equals("C")) {
				iNum[i]=2+1;
			} else if(sArr[i].equals("D")||sArr[i].equals("E")||sArr[i].equals("F")) {
				iNum[i]=3+1;
			} else if(sArr[i].equals("G")||sArr[i].equals("H")||sArr[i].equals("I")) {
				iNum[i]=4+1;
			} else if(sArr[i].equals("J")||sArr[i].equals("K")||sArr[i].equals("L")) {
				iNum[i]=5+1;
			} else if(sArr[i].equals("M")||sArr[i].equals("N")||sArr[i].equals("O")) {
				iNum[i]=6+1;
			} else if(sArr[i].equals("P")||sArr[i].equals("Q")||sArr[i].equals("R")||sArr[i].equals("S")) {
				iNum[i]=7+1;
			} else if(sArr[i].equals("T")||sArr[i].equals("U")||sArr[i].equals("V")) {
				iNum[i]=8+1;
			} else if(sArr[i].equals("W")||sArr[i].equals("X")||sArr[i].equals("Y")||sArr[i].equals("Z")) {
				iNum[i]=9+1;
			}
		}
		// �ձ��ϱ�
		for (int i = 0; i < sArr.length; i++) {
			iSum+=iNum[i];
		}
		System.out.println(iSum);
	}
}
