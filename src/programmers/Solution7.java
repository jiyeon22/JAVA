package programmers;

import java.util.*;

public class Solution7 {
    public static ArrayList<Integer> solution(int []arr) {
        
        ArrayList<Integer> answerList = new ArrayList<Integer>();
        
        int value = -1;
        for(int i = 0; i < arr.length; i++) {
        	if(arr[i] != value) {
        		answerList.add(arr[i]);
        		value = arr[i];
        	}
        }

        return answerList;
    }
    
    
    public static void main(String[] args) {
    	int[] arr = {1, 1, 3, 3, 0, 1, 1};
    	
    	System.out.println(solution(arr));
    }
}

// 
//연속적으로 나타나는 숫자를 제거하는건데 겹치는 숫자가 아예 없어야 되는 걸로 잘못 이해했다.
//다른 사람의 풀이를 봐버렸엉.. 다음에는 더더 생각하기   
