package com.dwiardiirawan.challenges;

import java.util.Scanner;

public class BinaryNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String binary = Integer.toBinaryString(n);
		char[] element = binary.toCharArray();
		
		int count = 0;
		int max = 0;
		boolean isvalid = false;
		System.out.println(binary);
		for (int i = 0; i < element.length; i++) {
			if(element[i]=='1'){
				count++;
				isvalid=true;
			} else if (element[i]=='0') {
				count=0;
			}
			
			if(count>max){
				max = count;
			}
		}
		
		
		System.out.println(max);
		scan.close();
		
	}

}
