package preCourseQuestions;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		System.out.println("----------------------");
		System.out.println("Testing Positive or Negative Number: 7");
		System.out.println(checkNumberSign(7));
		
		System.out.println("----------------------");
		System.out.println("Testing Even or Odd Number: 242");
		System.out.println(checkOddOrEven(242));
		
		System.out.println("----------------------");
		System.out.println("Testing Letter Grade: 76");
		System.out.println(generateLetterGrade(76));
		
		System.out.println("----------------------");
		System.out.println("Testing Week Day: 5");
		System.out.println(weekdayGenerator(5));
	
		
	}
	
	public static String checkNumberSign(int number)
	{
		if (number < 0)
		{
			return "Negative";
		} else {
			return "Positive";
		}
	}
	
	public static String checkOddOrEven(int number)
	{
		if (number % 2 == 0)
		{
			return "Even";
		} else {
			return "Odd";
		}
	}
	
	public static char generateLetterGrade(int grade)
	{
		if (grade < 0 || grade > 100) 
		{
			throw new IllegalArgumentException("Grade must be a double between 0 and 100");
		}
		
		if (grade > 89) return 'A';
		if (grade > 79) return 'B';
		if (grade > 71) return 'C';
		if (grade > 63) return 'D';
		
		return 'F';
	}
	
	public static String weekdayGenerator(int num)
	{	
		if (num < 1 || num > 7) 
		{
			throw new IllegalArgumentException("Input must be between 1 and 7");
		}

		final String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednsday", "Thursday", "Friday", "Saturday"};
		return weekdays[num - 1];
	}

}
