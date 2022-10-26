package programmers;

/**lv1. 문자열 다루기 
문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, 
 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.
 */

public class Solution5 {
	public static boolean solution(String s) {
       
        
        if((s.length() == 4 || s.length() == 6)) {
        	for(int i = 0; i < s.length(); i++) {
        		if(!(s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
        			return false;
        		}
        	}
        	 return true;
        }
       
        else return false;
       
	}
	
	/*
	 [다른풀이] 문자열읉 통으로 정수로 바꾸고 예외 터지면 false
	 
	public static boolean solution(String s) {
		if((s.length() == 4 || s.length() == 6)) {
			try {
				int x = Integer.parseInt(s);
				return true;
				} catch(NumberFormatException e) {
					return false;
				}
		}
		else return false;
       
	}


	
<try-catch문 : 예외 처리하기 위한 구문>
	try {

//예외발생할 가능성이 있는 문장 
    
}catch(Exception1 e1) {

 //Exception1이 발생했을 경우, 이를 처리하기 위한 문장적기 
 //보통 이곳에 예외메세지를 출력하고 로그로 남김.
 
}catch(Exception2 e2) {

 //Exception2이 발생했을 경우, 이를 처리하기 위한 문장적
 
}finally{

//예외발생여부에 관계없이 상항 수행되어야 하는 문장적기 

}

<NumberFormatException>
숫자형 포맷 오류 발생. 
1) 문자를 숫자로 변경시도하다가 에러 발생
2) 변경하는 자료형보다 범위 클 경우 에러 발생
3) null을 변환시키려고 하면 에러 발생
4) 문자 앞뒤로 공백 있어서 에러 발생 

*/

	
	public static void main(String[] args) {
		String s = "123456";
		
		System.out.println(solution(s));
	}
	
	

}
