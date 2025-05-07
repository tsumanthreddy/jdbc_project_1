package com.test;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		System.out.println("Hello World Program");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Square Number: ");
		int a = sc.nextInt();
		System.out.println("Square of " + a + " is: " + (a * a));

		System.out.println("Queb of " + a + " is: " + (a * a * a));
	}

}
