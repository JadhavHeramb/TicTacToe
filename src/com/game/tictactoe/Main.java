package com.game.tictactoe;

public class Main {

	public static void main (String [] args)
	{
		
		TicTacToe backboard = new TicTacToe() ; //Object creation for TicTacToe class
		backboard.backboard(); // View of the Backboard for TicTacToe
		backboard.gameOn(); //Logic method called upon backboard 
	}
}

