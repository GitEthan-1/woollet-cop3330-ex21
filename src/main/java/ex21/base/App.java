/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ethan Woollet
 */
package ex21.base;

import java.util.Scanner;

/**
 * Exercise 21 - Numbers to Names
 * Many programs display information to the end user in one form but use a different form inside the program.
 * For example, you may show the word Blue on the screen, but behind the scenes you’ll have a numerical value for that color or an internal
 * value because you may need to represent the textual description in another language for Spanish-speaking visitors.
 *
 * Write a program that converts a number from 1 to 12 to the corresponding month.
 * Prompt for a number and display the corresponding calendar month, with 1 being January and 12 being December.
 * For any value outside that range, display an appropriate error message.
 *
 * Example Output
 *
 * Please enter the number of the month: 3
 * The name of the month is March.
 *
 * Constraints
 *
 * Use a switch or case statement for this program.
 * Use a single output statement for this program.
 *
 * Challenges
 *
 * Use a map or dictionary to remove the switch statement from the program.
 * Support multiple languages. Prompt for the language at the beginning of the program.
 */

public class App {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter the number of the month: ");
		int numMonth = Integer.parseInt(in.nextLine());
		String month = switch (numMonth) {
			case 1 :
				yield "January";
			case 2 :
				yield "February";
			case 3 :
				yield "March";
			case 4 :
				yield "April";
			case 5 :
				yield "May";
			case 6 :
				yield "June";
			case 7 :
				yield "July";
			case 8 :
				yield "August";
			case 9 :
				yield "September";
			case 10 :
				yield "October";
			case 11 :
				yield "November";
			case 12 :
				yield "December";
			default :
				yield "your Mom's";
		};
		
		System.out.println("The name of the month is " + month + ".");
		
	}
}
