package com.Loop;

import java.util.Scanner;

public class PanlindromRange {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting number : ");
		int start = sc.nextInt();
		System.out.println("Enter the ending number : ");
		int end = sc.nextInt();
		for(int i = start; i<=end;i++) {
			int n = i;
			int m =0;
			
			while(n>0) {
				m=(m*10)+(n%10);
				n=n/10;
			}
			if(m>9) {
				if(m==i)
					System.out.println(m);
			}
		}

	}

}
