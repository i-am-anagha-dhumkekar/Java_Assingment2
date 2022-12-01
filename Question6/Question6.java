package com.faith.app;

import java.util.Scanner;

public class Question6 {
	/*
	 * Create the following output using for loop
..........

.........

........

.......

......

.....

....

...

..

.
	 */
	public static void main(String[] args)
	{
		try{
			Scanner input=new Scanner(System.in);
			System.out.print("Enter number of rows you want in pattern");
			int rows=input.nextInt();
			printPattern(rows);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	//Printing the pattern
	private static void printPattern(int rows)
	{
		for(int i=rows;i>0;i--)
		{
			for(int j=1;j<(i+1);j++)
			{
				System.out.print(".");
			}
			System.out.print("\n");
		}
	}

}
