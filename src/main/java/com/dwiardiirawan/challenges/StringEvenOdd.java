package com.dwiardiirawan.challenges;

import java.util.Scanner;

public class StringEvenOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] words = new String[n];
		
		for (int i = 0; i < words.length; i++) {
			words[i] = scan.next();
		}
		
		for (int i = 0; i < words.length; i++) {
			char[] wordChar = words[i].toCharArray();
			String odd = "";
			String even ="";
			
			for (int j = 0; j < wordChar.length; j++) {
				if(j%2==0){
					even+=wordChar[j];
				}else{
					odd+=wordChar[j];
				}
			}
			
			System.out.println(even+" "+odd);
			
			
		}
		
		scan.close();

	}

}
