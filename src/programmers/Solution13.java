package programmers;

public class Solution13 {
	
	    public static String solution(String phone_number) {
	        
	    	String answer = "";
	    	
	        for(int i = 0; i < phone_number.length(); i++) {
	        	if(i < phone_number.length() - 4) {
	        		answer += "*";
	        	}
	        	else {
	        		answer += phone_number.charAt(i);
	        	}
	        }
	        
	        return answer;
	    }
	    
	    public static void main(String[] args) {
	    	String phone_number = "01012345555";
	    	System.out.println(solution(phone_number));
	    }
	
	
	
	

}
