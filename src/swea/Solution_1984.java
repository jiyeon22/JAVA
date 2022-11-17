package swea;

import java.util.Scanner;

public class Solution_1984 {
	
	//반올림 Math.round(a)
	//올림  Math.ceil(a)
	//버림  Math.floor(a)
	//절대값 Math.abs(a)
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int[] arr = new int[10];
		
		for(int i = 0; i < T; i++) {
			int min = 9999999;
			int max = 0;
			double sum = 0.0;
			
			
			for(int j=0; j < 10; j++) {
				arr[j] =sc.nextInt();
				sum += arr[j];
				min = Math.min(min, arr[j]);
				max = Math.max(max, arr[j]);
			}
			
	
			//형변환 
			int answer = (int) Math.round((sum-min-max)/8);
			
			
			System.out.println("#"+(i+1)+" "+answer);
			
		}
		
	}

}

//22 8 5 123 7 2 63 7 3 46 
