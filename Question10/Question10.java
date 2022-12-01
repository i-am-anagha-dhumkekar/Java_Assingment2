package com.faith.app;

import java.util.Scanner;

public class Question10 {
//j. Create a small application that reads a month in number and print it in words.
	public static void main(String[] args)
	{
		try{
			Scanner input=new Scanner(System.in);
			System.out.print("Enter month:");
			int month=input.nextInt();
			String monthName=getMonthName(month);
			System.out.println("Month name is : "+monthName);
		}catch(Exception e)
		{
			System.out.println("Enter input in proper format");
		}
	}
	private static String getMonthName(int month)
	{
		switch (month)
		{
		case 1:
			return "Janavary";
		case 2:
			return "Februvary";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";
		default:
			return "Please enter correct month";
		}
	}
}
