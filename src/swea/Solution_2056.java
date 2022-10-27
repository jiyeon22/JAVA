package swea;

import java.util.Scanner;

public class Solution_2056 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		
		
		
		int[] d = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		for(int i = 1; i <= T; i++) {
			
			String Date = sc.next();
			
			String year = Date.substring(0, 4);
			String month = Date.substring(4, 6);
			String day = Date.substring(6, 8);

		if(Integer.parseInt(month) >= 1 && Integer.parseInt(month) <= 12 && Integer.parseInt(day) >= 1 && Integer.parseInt(day) <= d[Integer.parseInt(month)]){
			System.out.println("#"+i+" "+year+"/"+month+"/"+day);
			
		}else System.out.println("#"+i+" "+"-1");
		
		}
		
		
	}

}
