package swea;

import java.util.Scanner;

public class Solution_1986 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++) {
			int N = sc.nextInt();
			
			int sum = 0;
			
			for(int n = 1; n <= N; n++) {
				if(n % 2 != 0) {
					sum += n;
				}
				else sum -=n;
			}
			
			System.out.println("#"+(i+1)+" "+sum);
			
		}
		
		
	}
}
