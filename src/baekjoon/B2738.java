package baekjoon;

import java.util.Scanner;

public class B2738 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[][] matrix1 = new int[N][M];
		int[][] matrix2 = new int[N][M];
		
		
		//행렬 1
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				matrix1[i][j] = sc.nextInt();
			}
		}
		//행렬 2
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				matrix2[i][j] = sc.nextInt();
			}
		}
		
		//행렬의 덧셈 
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				
				System.out.print(matrix1[i][j]+matrix2[i][j]+" ");
				}
			System.out.println();
			
			}
		
			
			
		}
		
	}

