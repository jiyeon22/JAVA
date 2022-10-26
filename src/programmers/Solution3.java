/*프로그래머스 lv1.문자열 내 p와 y의 개수
 *String 인스턴스는 한 번 생성되면 그 값을 읽기만 할 수 있고, 변경할 수 없다(불변객체)
 *charAt()메소드 : 해당 문자열의 특정 인스에 해당하는 문자를 반환 
*/
public class Solution3 {
	static boolean solution(String s) {
		
		int p = 0;
		int y = 0;
		
		boolean answer1 = true;
		boolean answer2 = false;
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'p' || s.charAt(i) == 'P') p++;
			if(s.charAt(i) == 'y'|| s.charAt(i) == 'Y') y++;
		}
		
		if(p == y || (p == 0 && y == 0)) return answer1;
		else return answer2;
		
		/*[다른 풀이]
		 변수 하나만 가져가기!
		 count = 0 
		 p인경우  count++, y인 경 count--;
		 count == 0 return true; 
		 else false;
		 * */
		
		
	}
	
	
	public static void main(String[] args) {
		String str = "pPoooyY";
		
	
		System.out.println(solution(str));
	}
}
