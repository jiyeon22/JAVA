package swea;

import java.util.Scanner;

public class Solution_1954 {
	public static void main(String[] args) {
		
		//우,하,좌,상 
		int[] dx = {0, 1, 0, -1};
		int[] dy = {1, 0, -1, 0};
		
		
		Scanner sc = new Scanner(System.in);
		
		//테스트 케이스 수 입력 
		int T = sc.nextInt();
		
		for(int i = 1; i <= T; i++) {
			int num = 1;
			int x = 0, y = 0, dir = 0;
			
			//지도 크기 
			int N = sc.nextInt();
		
		
			int[][] map = new int[N][N];
			int[][] new_map = new int[N][N];
			
			while(num <= (N*N)) {
				map[x][y] = num++;
				x+=dx[dir];
				y+=dy[dir];
				
				//배열의 끝을 만나거나 이미 채워진 부분을 만났을 때 방향 전환 
				if(x < 0 || x > N-1 || y < 0 || y > N-1 || map[x][y] != 0) {
					//이전 자리로 다시 돌아가고, 
					x-= dx[dir];
					y-= dy[dir];
					
					//방향 전환
					dir = (dir + 1)%4;
					
					//바뀐 방향으로 이동 
					x+=dx[dir];
					y+=dy[dir];
				}
			}
			
			System.out.println("#"+i);
			for(int p = 0; p < N; p++) {
				for(int q = 0; q < N; q++) {
					System.out.print(map[p][q] + " ");
					
				}
				System.out.println();
				}				
			}								
		}				
	}
    

