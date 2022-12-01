package com.faith.app;

import java.util.Scanner;

public class Question2 {
/*
 * b. You are a Software developer in XYZ Company and you are asked to create a program to verify a user’s PIN code when a user visits an ATM. 
 * To implement this concept, you must use decisional statements to make appropriate decisions when a use’s PIN code matches with the pin code assigned to that user.
 *  For that, you have created a class named Verify, in which a user has to enter some numeric value as the PIN code during runtime. Apart from that,
 *   you have initialized a variable y with some numeric value and compare the value stored in the variable y with the value accepted from a user.
 * */
	public static void main(String[] args)
	{
		int actualPin=1999;
		try{
			Scanner input=new Scanner(System.in);
			System.out.print("Please enter your ATM pin here : ");
			int enteredPin=input.nextInt();
			input.close();	
			System.out.println(verify(enteredPin,actualPin));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
			
	}
	private static String verify(int atmPin,int y)
	{
		if(atmPin==y)
		{
			return "You are authorize to withdraw money";
		}
		else
		{
			return "Incorrect Pin";
		}
	}
}
