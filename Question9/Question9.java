package com.faith.app;

import java.util.Scanner;

public class Question9 {
//i. Accept a real constant value from user and typecast this value into integer and print the result.
	public static void main(String[] args)
	{
		try{
			Scanner input=new Scanner(System.in);
			System.out.print("Enter a real constant value: ");
			final float constant=input.nextFloat();
			int typecastedValue = (int)constant;
			System.out.println("Type casted to int value is : "+typecastedValue);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
