package baekjoon;

import java.util.Scanner;

public class B10951 {
	public static void main(String[] args) {
//	입력받는 값이 있는가 확인하는 방법 
//	hasNext(), hasNextInt() 사용
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()) {
			int A, B;
			A = sc.nextInt();
			B = sc.nextInt();
			
			System.out.println(A+B);
		}
		System.out.println("종료");
		sc.close();
	}

}
