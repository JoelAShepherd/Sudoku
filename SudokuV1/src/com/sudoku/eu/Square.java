package com.sudoku.eu;

import java.util.function.Predicate;

/**
 * This class sets up the initial objects needed to run the suduko solver. 
 * @author JShep
 *
 */
public class Square {
private int row;
private int column;
private int square;
private int sqID;
private int number;
private boolean preSet;
private int possibleNum;

/**
 * Creates a new Square object, representing one of the square cells in the sudoku puzzle.
 * @param sRow The row of the square.
 * @param sColumn The column of the square.
 * @param sSquare The 3x3 larger square within which this square cell is situated.
 * @param sSqID An individual ID for this square, also it's index in the sList ArrayList. 
 */

public Square(int sRow, int sColumn, int sSquare, int sSqID)
{
	row = sRow;
	column = sColumn;
	square = sSquare;
	sqID = sSqID;
	number = 0;
	preSet = false;
	possibleNum=0;
	
}

/**
 * Squares start with the value of 0. This method changes the value of a square
 * such that the initial numbers in the puzzle can be entered. 
 * @param val The value that the square has in the puzzle.
 */
public void setValAndPreset(int val) {
	if (val>0 && val<10) {
		number = val;
		preSet = true;
	}
	else {
		System.out.println("Please enter a number between 1 and 9.");
	}
}
public void setVal(int val) {
	if (val>0 && val<10) {
		number = val;
	}
}

/**
 * 
 * @return Row value
 */
public int getRow() {
	return row;
}
/**
 * 
 * @return Column value
 */
public int getCol() {
	return column;
}
/**
 * 
 * @return Square value
 */
public int getSquare() {
	return square;
}

/**
 * 
 * @return Number value
 */
public int getNumber() {
	return number;
}

public Integer getNumAsInteger() {
	Integer integer = number;
	return integer;
	}

/**
 * 
 * @return Square ID
 */
public int getSqID() {
	return sqID;
}
/**
 * 
 * @return All values of the int fields as a String. 
 */
public String getAll() {
	String a = ("SquareID: " + sqID + " - Row: " + row + " - Column: " + column + " - Square: " + square + " - Number: "+ number);
	return (a);
}

public String getNumAsStr() {
	String n = String.valueOf(number);
	return n;
}
}
