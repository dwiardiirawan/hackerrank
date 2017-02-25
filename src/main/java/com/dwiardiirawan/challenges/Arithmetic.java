package com.dwiardiirawan.challenges;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double mealCost = scan.nextDouble();
		int tipPercent = scan.nextInt();
		int taxPercent = scan.nextInt();
		System.out.println("meal cost: "+mealCost);
		System.out.println("tip percent: "+tipPercent);
		System.out.println("tax percent: "+taxPercent);
		double tip = mealCost * (tipPercent/100d);
		System.out.println(tip);
		double tax = mealCost * (taxPercent/100d);
		System.out.println(tax);
		int totalCost = (int) Math.round(mealCost + mealCost * ((tipPercent/100d)+(taxPercent/100d)));
		System.out.println(totalCost);

	}

}
