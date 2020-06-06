package com.sudoku.eu;

import java.util.ArrayList;

public class SolvingAlg extends S2{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SolvingAlg() {
		
	
	}
	public boolean checkRow(Square square) {
		ArrayList<Integer> cRowL = new ArrayList<>();
		sList.stream().
				filter(s -> s.getRow()==square.getRow())
				.map(s -> s.getNumber())
				.forEach(s -> cRowL.add(s));
		boolean ans = cRowL.contains(square.getNumAsInteger());
		return ans;
	}
	public boolean checkCol(Square square) {
		ArrayList<Integer> cColL = new ArrayList<>();
		sList.stream().
				filter(s -> s.getCol()==square.getCol())
				.map(s -> s.getNumber())
				.forEach(s -> cColL.add(s));
		boolean ans = cColL.contains(square.getNumAsInteger());
		return ans;
	}
	public boolean checkSquare(Square square) {
		ArrayList<Integer> cSqL = new ArrayList<>();
		sList.stream().
				filter(s -> s.getSquare()==square.getSquare())
				.map(s -> s.getNumber())
				.forEach(s -> cSqL.add(s));
		boolean ans = cSqL.contains(square.getNumAsInteger());
		return ans;
	}
	
	public boolean checkIfSolved() {
		Integer int0 = 0;
		ArrayList<Integer> cPuz = new ArrayList<>();
		sList.stream()
					.map(s -> s.getNumber())
					.forEach(s -> cPuz.add(s));
		boolean ans = cPuz.contains(int0);
		return ans;
	}
	
	
}
