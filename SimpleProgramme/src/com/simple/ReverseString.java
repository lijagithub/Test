package com.simple;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a String::");
		String str= scn.nextLine();
		reverseString(str);
	}

	private static void reverseString(String str) {
		String rev= "";
		for(int i=str.length()-1; i>=0;i--) {
			rev= rev + str.charAt(i);
		}
		System.out.println(rev);
		
	}

}
