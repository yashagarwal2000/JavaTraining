package com.lumen.basics;

import java.util.Scanner;

public class LongestWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the statement ");
		String sentence = scanner.nextLine();
		String []words = sentence.split(" ");
		String longestWord = "";
		for (String word : words) {
			if(word.length() > longestWord.length()) longestWord = word;
		}
		System.out.println("The longest word is : "+longestWord);
		scanner.close();
	}
	

}
