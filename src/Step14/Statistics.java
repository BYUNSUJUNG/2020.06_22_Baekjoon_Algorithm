package Step14;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Statistics {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 수 개수 입력
		int iCnt = scan.nextInt();
		// 수가 들어갈 배열
		int[] iNum = new int[iCnt];
		
		int iSum=0;
		int iAvg;
		
		int iMedian; // 중앙값
		int iMode = 0; // 최빈값
		
		int[] iIndex = new int[8001]; //인덱스의 카운터
		ArrayList iMaxList = new ArrayList();
		
		int iMaxNum; // 최댓값
		int iMinNum; // 최솟값
		int iMaxMinDifference; // 최댓값과 최솟값의 차
		 
		// 수 입력
		for (int i = 0; i < iNum.length; i++) {
			iNum[i] = scan.nextInt();
			iSum+=iNum[i]; // 1. 산술평균을 구하기 위한 iSum
		}
		iAvg = iSum/iNum.length;
		
		// 2. 중앙값 구하기
		Arrays.sort(iNum);//오름차순 정렬

        int size = iNum.length;

        iMedian = iNum[size / 2];

       
        // 3. 최빈값 구하기
        
        // (1) 음수일 경우 index값으로 못들어감 - > 에러
        // 해결: 입력되는 정수값의 절댓값이 최대 4000이기에,
        // 음수 일 경우 4000 초과의 index값을 넣어주면
        // 양수와 겹칠 일이 없다
        
        // (2) 최빈값이 여러개일 경우
        
        
        // 각 빈도 
        for (int i = 0; i < iNum.length; i++) {
        	if(iNum[i]<0) { // 음수일 경우
        	 iIndex[(-iNum[i])+4000]++; //COUNT   
        	} else {
        	 iIndex[iNum[i]]++; //COUNT   
        	}
                  
        }
        for (int i=0; i< iIndex.length; i++){
            if(iMode<iIndex[i]){
                iMode = iIndex[i]; // iMode: 최빈수
                
            }          
        }      
        
        if(iMode>4000) { // 음수일 경우, index가 4000이상이기에 -4000
        	iMode = -(iMode - 4000);
        }
        
		iMaxList.add(iNum[iMode]); // 최빈수에 해당하는 숫자
		/*
        // 최빈값이 여러개일 경우 찾기
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
        
        
        // 4. 최솟값, 최댓값 차이 구하기
        iMaxNum = iNum[iCnt-1];
        iMinNum = iNum[0];
        iMaxMinDifference = iMaxNum - iMinNum;
        
        
        // 출력
		System.out.println(iAvg);
		System.out.println(iMedian);
		System.out.println(iMode);
		System.out.println(iMaxMinDifference);
		
	}

}