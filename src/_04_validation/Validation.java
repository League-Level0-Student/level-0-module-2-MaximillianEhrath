//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _04_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		String compliments[] = {
				"You are awesome","I like you","You're cool","You are nice","You're the best"
		};
		Random randomMaker = new Random();
		for(int i=0; i<5; i++) {
			int randomNumber = randomMaker.nextInt(5);

			System.out.println(compliments[randomNumber]);
		}

		// 1. Use each value of randomNumber to give the user a random compliment.

		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
