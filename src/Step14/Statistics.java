package Step14;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
		
		int[] iIndex = new int[8001]; //�ε����� ī����
		ArrayList iMaxList = new ArrayList();
		
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

       
        // 3. �ֺ� ���ϱ�
        
        // (1) ������ ��� index������ ���� - > ����
        // �ذ�: �ԷµǴ� �������� ������ �ִ� 4000�̱⿡,
        // ���� �� ��� 4000 �ʰ��� index���� �־��ָ�
        // ����� ��ĥ ���� ����
        
        // (2) �ֺ��� �������� ���
        
        
        // �� �� 
        for (int i = 0; i < iNum.length; i++) {
        	if(iNum[i]<0) { // ������ ���
        	 iIndex[(-iNum[i])+4000]++; //COUNT   
        	} else {
        	 iIndex[iNum[i]]++; //COUNT   
        	}
                  
        }
        for (int i=0; i< iIndex.length; i++){
            if(iMode<iIndex[i]){
                iMode = iIndex[i]; // iMode: �ֺ��
                
            }          
        }      
        
        if(iMode>4000) { // ������ ���, index�� 4000�̻��̱⿡ -4000
        	iMode = -(iMode - 4000);
        }
        
		iMaxList.add(iNum[iMode]); // �ֺ���� �ش��ϴ� ����
		/*
        // �ֺ��� �������� ��� ã��
        for (int j = 0; j < iIndex.length; j++) {
        	if(iMode==iIndex[j]) {
        		if() {
        			(!iMaxList.contains(iNum[j]))) {
                		iMaxList.add(iNum[j]);
        		}
        	}
		}*/
        if(iMaxList.size()>1) {
        	Collections.sort(iMaxList);
        	iMode = (int) iMaxList.get(1);
        }
        
        
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