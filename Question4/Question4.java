package com.faith.app;

import java.util.Scanner;

public class Question4 {
	/*
	 * d. Rewrite the above program(Question3) using switch-case
	 */
	public static void main(String[] args)
	{
		try{
			Scanner input=new Scanner(System.in);
			System.out.print("Enter the month number: ");
			int month=input.nextInt();
			System.out.println(checkSeason(month));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	private static String checkSeason(int month)
	{
		switch (month)
		{
		case 1:
			return "Winter season";
		case 2:
			return "Winter season";
		case 3:
			return "Spring season";
		case 4:
			return "Spring season";
		case 5:
			return "Spring season";
		case 6:
			return "Summer season";
		case 7:
			return "Summer season";
		case 8:
			return "Summer season";
		case 9:
			return "Autumn season";
		case 10:
			return "Autumn season";
		case 11:
			return "Autumn season";
		case 12:
			return "Winter season";
		default:
			return "Enter correct month";
		}
		
	}

}
