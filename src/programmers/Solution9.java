package programmers;
//lv1. 부족한 금액 게산하기 
public class Solution9 {
	
	public static long solution(int price, int money, int count) {
        
		
		long answer = -1;
		
		int charge = 0;
		long result = 0;
		
	
		for(int i = 1; i <= count; i++) {
			charge += price * i;
			
		
			
		}
		
		
		
	
		if(charge >= money) {
			result = charge - money;
			answer = result;
			return answer;
		}
		else return 0;
		

       
    }
	

	public static void main(String[] args){
		System.out.println(solution(3, 20, 4));
	}

}
