package com.dwiardiirawan.zalora;

import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = n; i > 0; i--) {
			for (int j = 1; j>=0; j++) {
				if(i>j)
					System.out.print(" ");
				else
					System.out.print("*");
				
			}
			System.out.println("");
		}

	}

}
