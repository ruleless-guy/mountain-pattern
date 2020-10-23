package com.asg.app;

public class Main {
	public static void main(String[] args) {
		int num = 8;
		showMountainPattern(num);
		
	}
	
	private static void showMountainPattern(int num) {
		for(int i = 1; i<=num; i++) {
			for(int j = 1; j <= num-i; j++) {
				System.out.print(" ");
			}
			
			for(int k = 1; k<= 2*i-1; k++) {
				System.out.print(k);
			}
			System.out.println();
		}
	}
}
