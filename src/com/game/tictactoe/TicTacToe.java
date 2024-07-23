package com.game.tictactoe;

import java.util.Scanner;

public class TicTacToe {

	Scanner sc = new Scanner(System.in); // Creation of Object to get userInput on BackBoard

	// Below characters are acting as placeholder. Later to replace with 'X' or 'O'
	// as per the gameOn() logic
	char num1 = '1';
	char num2 = '2';
	char num3 = '3';
	char num4 = '4';
	char num5 = '5';
	char num6 = '6';
	char num7 = '7';
	char num8 = '8';
	char num9 = '9';

	public void backboard() // View of the Backboard

	{

		System.out.print(" ");
		System.out.print(num1);
		System.out.print("|");
		System.out.print(num2);
		System.out.print("|");
		System.out.print(num3);
		System.out.println("");

		System.out.print(" ");
		System.out.print(num4);
		System.out.print("|");
		System.out.print(num5);
		System.out.print("|");
		System.out.print(num6);
		System.out.println("");

		System.out.print(" ");
		System.out.print(num7);
		System.out.print("|");
		System.out.print(num8);
		System.out.print("|");
		System.out.print(num9);
		System.out.println("");

	}

	public boolean checkWinner()

	{
		return

		(((num1 == 'X') && (num2 == 'X') && (num3 == 'X')) || ((num1 == 'O') && (num2 == 'O') && (num3 == 'O'))
				|| ((num4 == 'X') && (num5 == 'X') && (num6 == 'X'))
				|| ((num4 == 'O') && (num5 == 'O') && (num6 == 'O'))
				|| ((num7 == 'X') && (num8 == 'X') && (num9 == 'X'))
				|| ((num7 == 'O') && (num8 == 'O') && (num9 == 'O'))
				|| ((num1 == 'X') && (num4 == 'X') && (num7 == 'X'))
				|| ((num1 == 'O') && (num4 == 'O') && (num7 == 'O'))
				|| ((num2 == 'X') && (num5 == 'X') && (num8 == 'X'))
				|| ((num2 == 'O') && (num5 == 'O') && (num8 == 'O'))
				|| ((num3 == 'X') && (num6 == 'X') && (num9 == 'X'))
				|| ((num3 == 'O') && (num6 == 'O') && (num9 == 'O'))
				|| ((num1 == 'X') && (num5 == 'X') && (num9 == 'X'))
				|| ((num1 == 'O') && (num5 == 'O') && (num9 == 'O'))
				|| ((num3 == 'X') && (num5 == 'X') && (num7 == 'X'))
				|| ((num3 == 'O') && (num5 == 'O') && (num7 == 'O')));

	}

	public void gameOn() // Logic to keep looping until someone Wins
	{

		while (!checkWinner()) {
			
			xEntry();
			if (checkWinner()) {
				System.out.println("Player X won the game");
				break;
			}
			
			{
				if (ifDraw())
				{
					System.out.println("Game Over.");
					System.exit(0);
				}
			}

			{
				oEntry();
				if (checkWinner()) {
					System.out.println("Player O won the game");
					break;
				}
			}
			
			{
				if (ifDraw())
				{
					System.out.println("Game Over.");
					System.exit(0);
				}
			}
			
			
		}
		
	}

	public boolean ifDraw()
	{
		return 
				(num1 != '1') && (num2 != '2') && (num3 != '3') && (num4 != '4') &&
			    (num5 != '5') && (num6 != '6') && (num7 != '7') && (num8 != '8') && (num9 != '9') ;
	}
	
	public void xEntry() // Logic for Player X to add entry on Backboard

	{
		System.out.println("Select a number from 1 to 9 to add X");

		char xentry = sc.nextLine().charAt(0);

		switch (xentry) {
		case '1':

			if ((num1 == 'X') || (num1 == 'O')) {
				System.out.println("You cannot interchange the previous play. Please select a valid number");
				xEntry();
			} else {
				num1 = 'X';
				backboard();
			}
			break;
		case '2':
			if ((num2 == 'X') || (num2 == 'O')) {
				System.out.println("You cannot interchange the previous play. Please select a valid number");
				xEntry();
			} else {
				num2 = 'X';
				backboard();
			}
			break;
		case '3':
			if ((num3 == 'X') || (num3 == 'O')) {
				System.out.println("You cannot interchange the previous play. Please select a valid number");
				xEntry();
			} else {
				num3 = 'X';
				backboard();
			}
			break;
		case '4':
			if ((num4 == 'X') || (num4 == 'O')) {
				System.out.println("You cannot interchange the previous play. Please select a valid number");
				xEntry();
			} else {
				num4 = 'X';
				backboard();
			}
			break;
		case '5':
			if ((num5 == 'X') || (num5 == 'O')) {
				System.out.println("You cannot interchange the previous play. Please select a valid number");
				xEntry();
			} else {
				num5 = 'X';
				backboard();
			}
			break;
		case '6':
			if ((num6 == 'X') || (num6 == 'O')) {
				System.out.println("You cannot interchange the previous play. Please select a valid number");
				xEntry();
			} else {
				num6 = 'X';
				backboard();
			}
			break;
		case '7':
			if ((num7 == 'X') || (num7 == 'O')) {
				System.out.println("You cannot interchange the previous play. Please select a valid number");
				xEntry();
			} else {
				num7 = 'X';
				backboard();
			}
			break;
		case '8':
			if ((num8 == 'X') || (num8 == 'O')) {
				System.out.println("You cannot interchange the previous play. Please select a valid number");
				xEntry();
			} else {
				num8 = 'X';
				backboard();
			}
			break;
		case '9':
			if ((num9 == 'X') || (num9 == 'O')) {
				System.out.println("You cannot interchange the previous play. Please select a valid number");
				xEntry();
			} else {
				num9 = 'X';
				backboard();
			}
			break;
		default:
			break;
		}
	}

	public void oEntry() // Logic for Player O to add entry on Backboard

	{

		System.out.println("Select a number from 1 to 9 to add O");
		char oentry = sc.nextLine().charAt(0);

		switch (oentry) {
		case '1':
			if ((num1 == 'X') || (num1 == 'O')) {
				System.out.println("You cannot interchange the previous play. Please select a valid number");
				oEntry();

			} else {
				num1 = 'O';
				backboard();
			}
			break;
		case '2':
			if ((num2 == 'X') || (num2 == 'O')) {
				System.out.println("You cannot interchange the previous play. Please select a valid number");
				oEntry();
			} else {
				num2 = 'O';
				backboard();
			}
			break;
		case '3':
			if ((num3 == 'X') || (num3 == 'O')) {
				System.out.println("You cannot interchange the previous play. Please select a valid number");
				oEntry();
			} else {
				num3 = 'O';
				backboard();
			}
			break;
		case '4':
			if ((num4 == 'X') || (num4 == 'O')) {
				System.out.println("You cannot interchange the previous play. Please select a valid number");
				oEntry();
			} else {
				num4 = 'O';
				backboard();
			}
			break;
		case '5':
			if ((num5 == 'X') || (num5 == 'O')) {
				System.out.println("You cannot interchange the previous play. Please select a valid number");
				oEntry();
			} else {
				num5 = 'O';
				backboard();
			}
			break;
		case '6':
			if ((num6 == 'X') || (num6 == 'O')) {
				System.out.println("You cannot interchange the previous play. Please select a valid number");
				oEntry();
			} else {
				num6 = 'O';
				backboard();
			}
			break;
		case '7':
			if ((num7 == 'X') || (num7 == 'O')) {
				System.out.println("You cannot interchange the previous play. Please select a valid number");
				oEntry();
			} else {
				num7 = 'O';
				backboard();
			}
			break;
		case '8':
			if ((num8 == 'X') || (num8 == 'O')) {
				System.out.println("You cannot interchange the previous play. Please select a valid number");
				oEntry();
			} else {
				num8 = 'O';
				backboard();
			}
			break;
		case '9':
			if ((num9 == 'X') || (num9 == 'O')) {
				System.out.println("You cannot interchange the previous play. Please select a valid number");
				oEntry();
			} else {
				num9 = 'O';
				backboard();
			}
			break;
		default:
			break;
		}
	}
}
