package swea;

import java.util.Scanner;

public class Solution_2050 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		for(int i = 0; i < s.length(); i++) {
			System.out.print((int)s.charAt(i)-64+" ");
		}
        
	       
	}

}

//'A'= 65 / 'a' = 97 / '0' = 48
