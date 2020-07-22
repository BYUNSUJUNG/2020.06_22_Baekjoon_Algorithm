package Step14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class WordSort2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int iCnt = scan.nextInt(); // 입력한 단어의 개수
		ArrayList<String> sWord = new ArrayList<String>(); // 단어
		ArrayList<Integer> sWordLength = new ArrayList<Integer>(); // 단어 길이
		
		ArrayList<String> list = new ArrayList<String>(); // 길이가 같은 단어를 넣어 둘 list
		ArrayList<String> resultList = new ArrayList<String>(); // 결과 리스트
		
		// 입력한 단어의 개수만큼 단어를 입력
		for (int i=0; i<iCnt; i++) {
			sWord.add(scan.next());
		}
		
		// 중복단어 제거 - HashSet 사용
		// <비교> TreeSet도 중복을 제거하지만, 오름차순 정렬까지 해서 더 오래걸림
		HashSet<String> arr = new HashSet<String>(sWord);
		
		// 중복제거된 리스트 다시 resultList에 넣기
		ArrayList<String> sWord2 = new ArrayList<String>(arr); 
		
		
		// 단어 길이 넣기
		for (int i=0; i<sWord2.size(); i++) {
			sWordLength.add(sWord.get(i).length());
		}			
		
		// 출력
		for (int i = 0; i < sWord2.size(); i++) {
			//String str = sWord.get(i);
			//System.out.println(sWord2.get(i)+","+sWordLength.get(i)+","+str.length());
			System.out.println(sWord2);
			System.out.println(sWordLength);
			
		}
//		
//		// 정렬
//		for(int i=0; i<50; i++) {
//			for(int j=0; j<sWord2.size(); j++) {
//				if(sWordLength.get(j)==i+1) { // 길이 1부터 50까지 길이가 같은 단어 리스트에 넣기
//					list.add(sWord2.get(j));
//				}
//			}
//			Collections.sort(list); // 길이가 같은 단어 리스트, 오름차순 정렬
//			resultList.addAll(list); // 결과 리스트에 정렬된 길이같은 리스트를 붙인다
//			list.clear(); // 리스트 모든 값 null로 초기화
//			
//		}
			/*
		// 출력
		for (int i = 0; i < sWord2.size(); i++) {
			System.out.println(sWord2.get(i));
			//System.out.println(resultList.get(i));
		}*/

	}
}
