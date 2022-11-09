package programmers;

import java.util.Stack;

public class Solution11 {
	 static boolean solution(String s) {
	        boolean answer = true;
	        Stack<Character> stack = new Stack<>();
	       
// 1. 여는 괄호 들어올 경우 스택에 push, 닫는 괄호 들어올 경우 스택 사이즈 확인
// 2. 만약 스택 사이즈가 0이라면 여는 괄호 없는 경우 -> false
// 3. 사이즈가 0이 아니라면 현재 비교중인 닫는 괄호와 짝을 이루는 괄호 있으므로 스택에서 pop하여 짝을 제거
	        
	        
	       for(int i = 0; i < s.length(); i++) {
	    	   char c = s.charAt(i);
	    	   if(c == '(') {
	    		   stack.push(c);
	    		    }
	    	   else {
	    		   if(stack.size() == 0) {
	    			   return false;
	    		   }
	    		   else stack.pop();		 
	    	   }
	       }
	       
	       if(stack.size() != 0) answer = false;
	       
	       return answer;
	   
	       
	       
	    }
	 
	 public static void main(String[] args) {
		 String s = "(())(";
		 
		 System.out.println(solution(s));
		 
	 }

}
