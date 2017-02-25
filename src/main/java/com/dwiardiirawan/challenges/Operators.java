package com.dwiardiirawan.challenges;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		String ans = "";
		System.out.println(n%2);
		if(n%2==1){
			ans = "Weird";
		}else{
			if(n>=2 && n<=5){
				ans = "Not Weird";
			}else if (n>=6 && n<=20) {
				ans = "Weird";
			}else{
				ans = "Not Weird";
			}
		}
			
		System.out.println(ans);
	}

}
