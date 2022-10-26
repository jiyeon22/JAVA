

/*
 * 프로그래머스 lv1. 수박수박수 
 */
public class Solution4 {
	

		public static String solution(int n) {
			String str1 = "수";
			String str2 = "박";
			String answer = "";
			
				for(int i = 1; i <= n; i++) {
					if(i % 2 == 0) {
						answer += str2;
					}else answer += str1;
					
				}
				return answer;
			}
			
			
			
			
			
				
	
	public static void main(String[] args) {
		

		
		System.out.println(solution(8));
	}
}


