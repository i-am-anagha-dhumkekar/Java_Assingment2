package com.faith.app;

import java.util.Scanner;

public class Question5 {
/*
 * e. Create a menu driven program using do-while and switch-case which implements a help system for Java’s selection and iteration statements.
 *  You have to display the syntax of selected control statement.
Help on:

1. if

2. switch

3. while

4. do-while

5. for

Choose one:

4

The do-while:

do {

statement;

 } while (condition);


 */
	public static void main(String[] args)
	{
		try{
			Scanner input=new Scanner(System.in);
			System.out.println("Choose one : \n 1.if \n 2. switch \n3. while \n4. do-while"+
			"\n5. for");
			int number=input.nextInt();
			System.out.println(output(number));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	private static String output(int num)
	{
		switch (num)
		{
		case 1:
			return "if(condition) \n {\n}else{\n}";
		case 2:
			return "switch(condition){\n case value:\n //statements \n break;\n"
					+ "case another:\n /t //statements \n break;\n";
		case 3:
			return "while(condition)\n {\n}";
		case 4:
			return "do \n { \n //statement; \n } \n while (condition)";
		case 5:
			return "for(initialization;condition;increment/decrement)\n"
					+ "{\n"
					+ "}";
		default:
			return "None selected";
		}
	}
}
