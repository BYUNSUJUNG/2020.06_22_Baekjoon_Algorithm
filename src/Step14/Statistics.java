package Step14;
import java.util.Arrays;
import java.util.Scanner;

public class Statistics {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// �� ���� �Է�
		int iCnt = scan.nextInt();
		// ���� �� �迭
		int[] iNum = new int[iCnt];
		
		int iSum=0;
		int iAvg;
		
		int iMedian; // �߾Ӱ�
		int iMode = 0; // �ֺ�
		
		int[] iIndex = new int[iCnt]; //�ε����� ī����
		int iMax = Integer.MIN_VALUE; //�ִ밪�� �����ϱ����� ���� 
		
		int iMaxNum; // �ִ�
		int iMinNum; // �ּڰ�
		int iMaxMinDifference; // �ִ񰪰� �ּڰ��� ��
		 
		// �� �Է�
		for (int i = 0; i < iNum.length; i++) {
			iNum[i] = scan.nextInt();
			iSum+=iNum[i]; // 1. �������� ���ϱ� ���� iSum
		}
		iAvg = iSum/iNum.length;
		
		// 2. �߾Ӱ� ���ϱ�
		Arrays.sort(iNum);//�������� ����

        int size = iNum.length;

        iMedian = iNum[size / 2];
/*
 * ������ ��� index������ ���� - > ����
 * 
 * 
        // 3. �ֺ� ���ϱ�

        for (int i = 0; i < iNum.length; i++) {
            iIndex[iNum[i]]++; //COUNT          
        }
        for (int i=0; i< iIndex.length; i++){
            if(iMax<iIndex[i]){
                iMax = iIndex[i]; //MAX
                iMode = i; //�ֺ� : MODE
            }          
        }      
        */
        // 4. �ּڰ�, �ִ� ���� ���ϱ�
        iMaxNum = iNum[iCnt-1];
        iMinNum = iNum[0];
        iMaxMinDifference = iMaxNum - iMinNum;
        
        
        // ���
		System.out.println(iAvg);
		System.out.println(iMedian);
		System.out.println(iMode);
		System.out.println(iMaxMinDifference);
		
	}

}
