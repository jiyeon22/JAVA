package baekjoon;

import java.util.Scanner;

public class B10872 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int ans = 1;
		
		if(N == 0) System.out.println(1);
		
		else{
			for(int i = 1; i <= N; i++) {
		
			ans *=i;
			}
			System.out.println(ans);
		}
	
		
	}

}
