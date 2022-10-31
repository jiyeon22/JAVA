package swea;

import java.util.Scanner;

public class Solution_2001 {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int T = sc.nextInt();
		
		int max = 0;
		
		
		for(int i = 0; i < T; i++) {
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[][] map = new int[N][N];
		
		for(int p = 0; p < N; p++) {
			for(int q= 0; q < N; q++) {
				map[p][q] = sc.nextInt();
			}
		}
		
		
		for(int n = 0; n < N-M; n++) {
			for(int m= 0; m < N-M; m++) {
				int sum = 0;
				for(int p = 0; p < M; p++) {
					for(int q = 0; q < M; q++) {
						sum += map[n+p][m+q];
			}
		}
				if(max < sum) max = sum;
			}
			
		}
		
		System.out.println("#"+(i+1)+" "+max);
		
		}
	}

}
