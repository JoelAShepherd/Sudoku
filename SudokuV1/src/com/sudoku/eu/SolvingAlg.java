package com.sudoku.eu;

import java.util.ArrayList;

public class SolvingAlg extends Organiser{

	
	
	public SolvingAlg() {
		Organiser o = Organiser.getOrganiser();
	
	}
	public static boolean checkRow(ArrayList<Square> checkSqList, Square square, int t) {
		ArrayList<Integer> cRowL = new ArrayList<>();
		checkSqList.stream().
				filter(s -> s.getRow()==square.getRow())
				.map(s -> s.getNumber())
				.forEach(s -> cRowL.add(s));
		boolean ans = cRowL.contains(t);
		return ans;
	}
	public static boolean checkCol(ArrayList<Square> checkSqList, Square square, int t) {
		ArrayList<Integer> cColL = new ArrayList<>();
		checkSqList.stream().
				filter(s -> s.getCol()==square.getCol())
				.map(s -> s.getNumber())
				.forEach(s -> cColL.add(s));
		boolean ans = cColL.contains(t);
		return ans;
	}
	public static boolean checkSquare(ArrayList<Square> checkSqList, Square square, int t) {
		ArrayList<Integer> cSqL = new ArrayList<>();
		checkSqList.stream().
				filter(s -> s.getSquare()==square.getSquare())
				.map(s -> s.getNumber())
				.forEach(s -> cSqL.add(s));
		boolean ans = cSqL.contains(t);
		return ans;
	}
	
	public static boolean checkIfSolved(ArrayList<Square> listToSolve) {
		Integer int0 = 0;
		ArrayList<Integer> cPuz = new ArrayList<>();
		listToSolve.stream()
					.map(s -> s.getNumber())
					.forEach(s -> cPuz.add(s));
		boolean ans = cPuz.contains(int0);
		return !ans;
	}
	
	public static ArrayList<Square> solve(ArrayList<Square> list) {
		ArrayList<Square> listToSolve = new ArrayList<>(list);
		int i = 0;
		int t = 0;
		
		while (i<81) { //start
			boolean runDone = false;
			if (listToSolve.get(i).getPreSet()) {
				i++;
			}
			else {
				int sqNum = listToSolve.get(i).getNumber();
				t = sqNum;
				t++;
				while (t<10 && !runDone) {
					boolean checkA = false;
					boolean checkB = false;
					boolean checkC = false;
					
					if (checkRow(listToSolve, (listToSolve.get(i)), t) == false) {
						System.out.println("checkRow True");
						checkA = true;
					}
					if (checkCol(listToSolve, (listToSolve.get(i)), t) == false) {
						System.out.println("checkCol True");
						checkB = true;
					}
					if (checkSquare(listToSolve, (listToSolve.get(i)), t) == false){
						System.out.println("checkSquare True");
						checkC = true;
					}
					if (checkA && checkB && checkC) {
						listToSolve.get(i).setVal(t);
						i++;
						runDone = true;
					}
					else {
						t++;
					}
				}
				if (t>9) {
					listToSolve.get(i).setVal(0);
					listToSolve.get(i).setTestNum(0);
					int b = 1;
					int checkIndex = i;
					while (listToSolve.get(checkIndex-1).getPreSet()) {
						checkIndex--;
						b++;
					}
					i = i-b;
					
				}
			}
		}
		
		return listToSolve;//end
	
	}
}
	

