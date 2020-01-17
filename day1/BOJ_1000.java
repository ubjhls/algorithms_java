package day1;

import java.util.Scanner;

public class BOJ_1000 {
	static int d = 3;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
		int[][] abc = new int[5][5];
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				abc[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < abc.length; i++) {
			for (int j = 0; j < abc[i].length; j++) {
				System.out.print(abc[i][j] + " ");							
			}
			System.out.println();
		}
		
		
		int b = 2;
//		int c = plus(a, b);
//		System.out.print(c);
//		System.out.println(c);
	}
		
	public static int plus(int a, int b) {
		return a + b + d;
	}
}
