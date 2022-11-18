package programmers;

import java.util.Arrays;

public class Solution14 {
	public static int[] solution(int[] arr) {
		
		//배열의 길이가 1인 경우 
		if(arr.length == 1) {
			int[] answer = {-1};
			return answer;
		}
		
		//배열 길이가 1보다 클 때
		//가장 작은 수를 뺀 길이로 초기화 
		int[] answer = new int[arr.length -1];
		
		//하나의 값을 기준으로 최솟값 잡음. 
		int min = arr[0];
	
		//최솟값 구하기. 
		for(int i = 0; i < arr.length; i++) {
			min = Math.min(min, arr[i]);
		}
		
		
		//반복문 index용 
		int index = 0;
		for(int j = 0; j < arr.length; j++) {
			//배열의 값이 가장 작은 수라면 
			if(arr[j] == min) continue;
			else answer[index++] = arr[j];
		
	}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		int[] arr = {10};
		System.out.println(Arrays.toString(solution(arr)));
		
	}

}
