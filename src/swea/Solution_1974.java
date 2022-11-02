package swea;

import java.util.Scanner;

public class Solution_1974 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int[][] map = new int[9][9];
		
		
		
		for(int n = 1; n <= T; n++) {
			int ans = 1; 
		
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		
		//다른 풀이 
		//행, 열 체크 같이 
		for(int i = 0; i < 9; i ++) {
			int rsum = 0;
			int csum = 0;
			for(int j = 0; j < 9; j++) {
				rsum +=map[i][j];
				csum +=map[j][i];
				}
			if(rsum != 45 || csum != 45) {
				ans = 0;
				break;
					
				}
			}
		
		/*
		//열체크   
		for(int i = 0; i < 9; i ++) {
			int sum = 0;
			for(int j = 0; j < 9; j++) {
				sum +=map[i][j];
				}
			if(sum != 45) {
				ans = 0;
				break;
					
				}
			}
		
		
		//행체크 
		for(int i = 0; i < 9; i ++) {
			int sum = 0;
			for(int j = 0; j < 9; j++) {
				sum += map[j][i];
					
				}
			if(sum != 45) {
				ans = 0;
				break; 
			}
		}
		*/
		
		//유효하지 않은 경우 stop
		if(ans == 0) {
			System.out.println("#" + n + " 0");
			continue;
		}
		
		
		//격자 체크 
		for(int i = 0; i < 9; i+=3) {
			for(int j = 0; j < 9; j+=3) {
				int sum = 0;
				for(int x = 0; x < 3; x++) {
					for(int y = 0; y < 3; y++) {
						sum += map[i+x][j+y];
					}
				}
				if(sum != 45) {
					ans = 0;
					break;
				}
				
			} 
			if(ans == 0) break;
			}
		System.out.println("#" + n + " "+ ans);
		}
		
		
	}

}
