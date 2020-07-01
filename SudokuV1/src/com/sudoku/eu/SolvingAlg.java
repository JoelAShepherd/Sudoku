package com.sudoku.eu;

import java.util.ArrayList;

public class SolvingAlg extends Organiser{

	
	
	public SolvingAlg() {
		
	
	}
	public static boolean checkRow(Square square, int t) {
		ArrayList<Integer> cRowL = new ArrayList<>();
		sList.stream().
				filter(s -> s.getRow()==square.getRow())
				.map(s -> s.getNumber())
				.forEach(s -> cRowL.add(s));
		boolean ans = cRowL.contains(t);
		return ans;
	}
	public static boolean checkCol(Square square, int t) {
		ArrayList<Integer> cColL = new ArrayList<>();
		sList.stream().
				filter(s -> s.getCol()==square.getCol())
				.map(s -> s.getNumber())
				.forEach(s -> cColL.add(s));
		boolean ans = cColL.contains(t);
		return ans;
	}
	public static boolean checkSquare(Square square, int t) {
		ArrayList<Integer> cSqL = new ArrayList<>();
		sList.stream().
				filter(s -> s.getSquare()==square.getSquare())
				.map(s -> s.getNumber())
				.forEach(s -> cSqL.add(s));
		boolean ans = cSqL.contains(t);
		return ans;
	}
	
	public static boolean checkIfSolved() {
		Integer int0 = 0;
		ArrayList<Integer> cPuz = new ArrayList<>();
		sList.stream()
					.map(s -> s.getNumber())
					.forEach(s -> cPuz.add(s));
		boolean ans = cPuz.contains(int0);
		return !ans;
	}
	
	public static void solve() {
		int i = 0;
		if (i<sList.size()) {
			if (sList.get(i).getPreSet() == true) {
				i++;
			}
			else{
				int t = (sList.get(i).getTestNum()) + 1;
				if (t<10) {
					if (checkRow((sList.get(i)), t) == false &&
					checkCol((sList.get(i)), t) == false &&
					checkSquare((sList.get(i)), t) == false){
					sList.get(i).setVal(t);
					i++;
					}
				}
				else {
					sList.get(i).setTestNum(0);
					int b = 1;
					int checkIndex = i;
					while (sList.get(checkIndex-1).getPreSet() == true) {
						checkIndex--;
						b++;
						}
					i = i-b;
				}
			}
		}
		else if (i == sList.size()) {
			if(checkIfSolved() == true) {
				printPuzzle();
			}
			else {
				System.out.println("An error has occured.");
			}
		}
	}
}
	

