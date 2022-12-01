package com.faith.app;

import java.util.Scanner;

public class Question1 {
/*
 * a. Consider an electricity billing calculation. There are two types of customers. Domestic and Industry. If it is domestic, the slabs are like this,
The reading in the range,
0-100 then amt=units* Rs.1

100-200amt=units*1.5

200-500amt=units*2

>500amt = units*5

If it is industrial, the amt =units*10.
*/
	public static void main(String[] args)
	{
		try{
			Scanner input=new Scanner(System.in);
			System.out.print("Please tell which type of customer you are if domestic "
					+ "\n then enter d and if industrial then enter i : ");
			char type=input.next().charAt(0);
			System.out.print("Enter the total units consumed : ");
			int units=input.nextInt();
			
			//Print the total bill
			System.out.println("Your total Electricity bill is : "+calculateBill(type,units));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	private static double calculateBill(char type,int units)
	{
		double bill=0;
		if(type=='d')
		{
			if(units>0 && units<100)
			{
				bill=(units*1);
			}
			else if(units>=100 && units<200)
			{
				bill=(units*1.5);
			}
			else if(units>=200 && units<500)
			{
				bill=(units*2);
			}
			else if(units>=500)
			{
				bill=(units*5);
			}
		}
		else if(type=='i')
		{
			bill=(units*10);
		}
		return bill;
	}
	
}
