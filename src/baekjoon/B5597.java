package baekjoon;

import java.util.Scanner;

//

public class B5597 {
	public static void main(String[] args) {
		int[] num = new int [31];
		int[] num2 = new int [2];
		int max = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i <= 28; i++) {
			int n = sc.nextInt();
			num[n] = n;
		}
		
		for(int i = 1; i <=30; i++) {
			if(num[i] == 0) {
				System.out.println(i);
				}
			
			}
			
		}
		
		
	}


