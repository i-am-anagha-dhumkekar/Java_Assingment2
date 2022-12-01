package com.faith.app;

import java.util.Scanner;

public class Question3 {
/*
 * c. Write a program that uses an if-else-if ladder to determine which season a particular
Month is in.
Months 1, 2 and 12 are come under winter season.
Months 3, 4 and 5 are come under spring season.
Months 6, 7 and 8 are come under summer season.
Months 9, 10 and 11 are come under autumn season.
Accept a number for month from user and print the result accordingly.
 */
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the month number: ");
		int month=input.nextInt();
		System.out.println(checkSeason(month));
	}
	private static String checkSeason(int month)
	{
		if(month==1 || month==2 || month==12)
		{
			return "Winter season";
		}
		else if(month==3 || month==4 || month==5)
		{
			return "Spring season";
		}
		else if(month==6 || month==7 || month==8)
		{
			return "Summer season";
		}
		else if(month==9 || month==10 || month==11)
		{
			return "Autumn season";
		}
		else
		{
			return "Enter correct month";
		}
	}
}
