package baekjoon;

import java.util.Scanner;

public class B9086 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        int N = sc.nextInt();

	        for (int i = 0 ; i < N ; i++) {
	            String str = sc.next();
	            
	          
	            
	            String first = String.valueOf(str.charAt(0));
	            String last = String.valueOf(str.charAt(str.length()-1));
	            System.out.println(first + "" + last);
	        }
	    }
	}