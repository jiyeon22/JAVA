package baekjoon;

import java.util.Scanner;
public class B10807 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] num = new int[N];
		int count = 0;
		
		for(int i = 0; i < N; i++) {
			num[i] = sc.nextInt();
		}
		
		int search_num = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			if(search_num == num[i]) count++;
		}
		
		System.out.println(count);
	}

}
