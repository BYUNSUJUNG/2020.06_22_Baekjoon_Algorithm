package Step14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class WordSort {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int iCnt = scan.nextInt(); // 단어 수
		String[] sWord = new String[iCnt]; // 중복 제거 전 단어배열
		int[] sWordLength; // 단어 길이
		String[] sNoOverlapWord = new String[iCnt]; // 중복 제거 후 단어 배열
		ArrayList<String> list = new ArrayList<String>(); // 길이 같은 거 넣어둘 list
		ArrayList<String> resultList = new ArrayList<String>(); // 결과 리스트
		
		// 단어 수만큼 단어 입력
		for (int i=0; i<iCnt; i++) {
			sWord[i] = scan.next();
			//sWordLength[i] = sWord[i].length();
		}
		
		// 중복제거
		// HashSet은 리스트의 중복을 제거함
		// Arrays.asList(sWord): Array(배열)를 List(리스트)로 변경할 때
		// toArray(new String[0]): 	List(리스트)를 Array(배열)로 변경할 때 사용하는 메서드
		// 							list의 크기만큼 Array을 생성하기 위해서 0값을 넣음
		sWord = new HashSet<String>(Arrays.asList(sWord)).toArray(new String[0]);
		sWordLength = new int[sWord.length]; // 중복이 제거된 단어배열의 길이를 배열 사이즈로 삽입
		for (int i=0; i<sWord.length; i++) {
			sWordLength[i] = sWord[i].length();
		}
		
		// 정렬
		for(int i=0; i<50; i++) {
			for(int j=0; j<sWord.length; j++) {
				if(sWordLength[j]==i+1) { // 길이 1부터 50까지 길이가 같은 단어 리스트에 넣기
					list.add(sWord[j]);
				}
			}
			Collections.sort(list); // 길이가 같은 단어 리스트, 오름차순 정렬
			resultList.addAll(list); // 결과 리스트에 정렬된 길이같은 리스트를 붙인다
			list.clear(); // 리스트 모든 값 null로 초기화
		}
	
		// 출력
		for (int i=0; i < resultList.size(); i++) {
			System.out.println(resultList.get(i));
		}

	}
}
