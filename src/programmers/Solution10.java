package programmers;

public class Solution10 {
	
	 public static int solution(int[][] sizes) {
	        int answer = 0;
	        int temp = 0;
	        int length = 0;
	        int height = 0;
	        /*[다른 사람 풀이] 
	         명함의 가로/세로 중 큰 값은 큰 값끼리, 작은 값은 작은 값끼리 비교하여 구할 수 있다.
	         * 
	         
	         
	         int length = 0, height = 0;
	         for(int[] card : sizes){
	        	System.out.println(card[0] +"/"+ card[1]);
	         	length = Math.max(length, Math.max(card[0], card[1]));
	         	height = Math.max(height, Math.min(card[0], card[1]));
	         	
	         	}
	         	
	         	int answer = length * height;
	         	return answer;
	         	
	         
	         }
	         */
	        
	      /*[풀이]
	        가로와 세로 중 긴 변을 가로에 몰아주고, 
	        가로 길이 중 가장 긴 것과 세로 길이 중 가장 긴 것을 곱해주었다.
	       */
	        for(int i = 0; i < sizes.length; i++) {
	        	if(sizes[i][0] < sizes[i][1]) {
	        		temp = sizes[i][0]; 
	        		sizes[i][0] = sizes[i][1];
	        		sizes[i][1] = temp;	
	        	}
	        		
	        }
	        
	        for(int p = 0; p < sizes.length; p++) {
	        
	        	length = Math.max(length, sizes[p][0]);
	        	height = Math.max(height, sizes[p][1]);
	        	
	        }
	       
	        answer = length * height;
	        
	        return answer;
	 }
	    
	 
	 public static void main(String[] args) {
		 
		 int[][] arr = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		 
		 System.out.println(solution(arr));
		 
		 
		 
	 }
	 
	 
	 

}
