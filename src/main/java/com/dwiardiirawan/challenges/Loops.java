package com.dwiardiirawan.challenges;

import java.util.Scanner;

/*
 * 
Objective
In this challenge, we're going to use loops to help us do some simple math. Check out the Tutorial tab to learn more.

Task
Given an integer, n, print its first 10 multiples. Each multiple n * i (where 1<= i <= 10 ) 
should be printed on a new line in the form: n x i = result.

Input Format

A single integer, n.

Constraints

2 <= n <= 20

Output Format

Print 10 lines of output; each line i(where 1 <= i <= 10) contains the of in the form:
n x i = result.

Sample Input

2

Sample Output

2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20




 * 
 */
public class Loops {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    
    if(2<=n && n<=20){
      for (int i = 1; i <= 10; i++) {
        System.out.println(n + " x " + i + " = " + (n*i));
      }
    }
    
    scan.close();

  }

}
