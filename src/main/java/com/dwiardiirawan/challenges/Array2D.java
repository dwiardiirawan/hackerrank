package com.dwiardiirawan.challenges;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] arr = new int[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		int sum = 0;
		int max = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				sum = (arr[i][j]+arr[i][j+1]+arr[i][j+2]+
						arr[i+1][j+1]+
					   arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2]);
				if(i==0 && j==0)
					max = sum;
				else if(sum>max)
					max = sum;
			}
		}
		System.out.println(max);
		scan.close();

	}

}
