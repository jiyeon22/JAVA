package programmers;

public class Solution8 {
	 public static int solution(int n) {
		 
	       
	      
	        int cnt = 0;
	        
	        for(int i = 2; i <= n; i++)
	        {
	        	boolean answer = true;
	        	//for(int j = 2; j <= i; j++) -> 시간초과 발생
	        	//n의 제곱근번 돌리게 하여 반복문 실행 횟수 줄이기 
	        	for(int j = 2; j <= Math.sqrt(i); j++) {
	        		if(i % j == 0) {
	        			answer = false;
	        			break;
	        	}
	        		
	        	
	        	}
	        	
	        	if(answer == true) cnt++;
	        }
	        
	        return cnt;
	    }
	    
	 
	 public static void main(String[] args) {
		 
		 System.out.println(solution(5));
	 }

}
