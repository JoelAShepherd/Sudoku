package com.sudoku.eu;

import java.awt.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class SolvingAlg extends Organiser {

	public SolvingAlg() {
		Organiser o = Organiser.getOrganiser();

	}

	public static int countEmptyRow(ArrayList<Square> sqList, int row) { // counts number of empty squares in row,
																			// returns number
		int val = 0;
		ArrayList<Integer> cRowL = new ArrayList<>();
		sqList.stream().filter(s -> s.getRow() == row).map(s -> s.getNumber()).filter(s -> s == 0)
				.forEach(s -> cRowL.add(s));
		val = cRowL.size();
		return val;
	}

	public static int countEmptyCol(ArrayList<Square> sqList, int col) { // counts number of empty squares in col,
																			// returns number
		int val = 0;
		ArrayList<Integer> cColL = new ArrayList<>();
		sqList.stream().filter(s -> s.getCol() == col).map(s -> s.getNumber()).filter(s -> s == 0)
				.forEach(s -> cColL.add(s));
		val = cColL.size();
		return val;
	}

	public static int countEmptySq(ArrayList<Square> sqList, int sq) { // counts number of empty squares in Square,
																		// returns number
		int val = 0;
		ArrayList<Integer> cSqL = new ArrayList<>();
		sqList.stream().filter(s -> s.getSquare() == sq).map(s -> s.getNumber()).filter(s -> s == 0)
				.forEach(s -> cSqL.add(s));
		val = cSqL.size();
		return val;
	}

	public static int missingVal(ArrayList<Integer> valList) { // finds and returns missing 1-9 val from list.
		int ans = 0;
		System.out.println("valList  " + valList);
		for (int i = 1; i < 10; i++) {
			int j = i;
			if (valList.contains(j)) {
				System.out.println("ij  " +j);
			} 
			else {
				ans = j;
			}
		}
		System.out.println("ans  " + ans);
		return ans;
	}

	public static boolean checkRow(ArrayList<Square> checkSqList, Square square, int t) { // checks if a row contains a
																							// value
		ArrayList<Integer> cRowL = new ArrayList<>();
		checkSqList.stream().filter(s -> s.getRow() == square.getRow()).map(s -> s.getNumber())
				.forEach(s -> cRowL.add(s));
		boolean ans = cRowL.contains(t);
		return ans;
	}

	public static boolean checkCol(ArrayList<Square> checkSqList, Square square, int t) { // checks if a col contains a
																							// value
		ArrayList<Integer> cColL = new ArrayList<>();
		checkSqList.stream().filter(s -> s.getCol() == square.getCol()).map(s -> s.getNumber())
				.forEach(s -> cColL.add(s));
		boolean ans = cColL.contains(t);
		return ans;
	}

	public static boolean checkSquare(ArrayList<Square> checkSqList, Square square, int t) { //// checks if a Square
																								//// contains a value
		ArrayList<Integer> cSqL = new ArrayList<>();
		checkSqList.stream().filter(s -> s.getSquare() == square.getSquare()).map(s -> s.getNumber())
				.forEach(s -> cSqL.add(s));
		boolean ans = cSqL.contains(t);
		return ans;
	}

	public static boolean checkIfSolved(ArrayList<Square> listToSolve) {
		Integer int0 = 0;
		ArrayList<Integer> cPuz = new ArrayList<>();
		listToSolve.stream().map(s -> s.getNumber()).forEach(s -> cPuz.add(s));
		boolean ans = cPuz.contains(int0);
		return !ans;
	}

	public static ArrayList<Square> solve(ArrayList<Square> list) {
		ArrayList<Square> listToSolve = new ArrayList<>(list);

		// checks for single gaps in rows, cols or Sqs
		boolean rowChanged = true;
		boolean colChanged = true;
		boolean sqChanged = true;

		while (rowChanged || colChanged || sqChanged) {
			rowChanged = true;
			colChanged = true;
			sqChanged = true;
			
			while (rowChanged) {
				rowChanged = false;
				for (int i = 0; i < 9; i++) {
					System.out.println("rowcheck" + i);
					int gaps = 0;
					gaps = countEmptyRow(listToSolve, i);
					if (gaps == 1) {
						System.out.println("one gap" + i);
						int j = i;
						int cellID = 0;
						java.util.List<Integer> sqIDList = listToSolve.stream().filter(s -> s.getRow() == j)
								.filter(s -> s.getNumAsInteger() == 0).map(s -> s.getSqID())
								.collect(Collectors.toList());
						System.out.println("sqIDList  " + sqIDList);
						cellID = sqIDList.get(0);// cellID is the ID of blank cell
						System.out.println(cellID);
						java.util.List<Integer> numList = listToSolve.stream().filter(s -> s.getRow() == j)
								.map(s -> s.getNumber()).collect(Collectors.toList()); // puts all the values from the
																						// row
																						// in a list for checking
						System.out.println("numList  " + numList);
						int missingNum = missingVal((ArrayList<Integer>) numList);
						System.out.println("missingNum  " + missingNum);
						listToSolve.get(cellID).setValAndPreset(missingNum);
						rowChanged = true;
						System.out.println("end rc" + i);
					}
				}
			}
			
			while (colChanged) {
				colChanged = false;
				for (int i = 0; i < 9; i++) {
					System.out.println("colcheck" + i);
					int gaps = 0;
					gaps = countEmptyCol(listToSolve, i);
					if (gaps == 1) {
						int j = i;
						int cellID = 0;
						java.util.List<Integer> sqIDList = listToSolve.stream().filter(s -> s.getCol() == j)
								.filter(s -> s.getNumAsInteger() == 0).map(s -> s.getSqID())
								.collect(Collectors.toList());
						cellID = sqIDList.get(0); // cellID is the ID of blank cell
						java.util.List<Integer> numList = listToSolve.stream().filter(s -> s.getCol() == j)
								.map(s -> s.getNumber()).collect(Collectors.toList()); // puts all the values from the
																						// col
																						// in a list for checking
						int missingNum = missingVal((ArrayList<Integer>) numList);
						listToSolve.get(cellID).setValAndPreset(missingNum);
						colChanged = true;
					
				}
			}
			
			while (sqChanged) {
				sqChanged = false;
				for (int i = 0; i < 9; i++) {
					System.out.println("sqcheck" + i);
					int gaps = 0;
					gaps = countEmptySq(listToSolve, i);
					if (gaps == 1) {
						int j = i;
						int cellID = 0;
						java.util.List<Integer> sqIDList = listToSolve.stream().filter(s -> s.getSquare() == j)
								.filter(s -> s.getNumAsInteger() == 0).map(s -> s.getSqID())
								.collect(Collectors.toList());
						cellID = sqIDList.get(0); // cellID is the ID of blank cell
						java.util.List<Integer> numList = listToSolve.stream().filter(s -> s.getSquare() == j)
								.map(s -> s.getNumber()).collect(Collectors.toList()); // puts all the values from the
																						// Square
																						// in a list for checking
						int missingNum = missingVal((ArrayList<Integer>) numList);
						listToSolve.get(cellID).setValAndPreset(missingNum);
						sqChanged = true;
					}
				}
			}
		}

		int i = 0;
		int t = 0;
		boolean direction = true;
		int highest = 0;
		int hit = 0;

		while (i < 81) { // start of brute force
			boolean runDone = false;
			if (i >= highest) {
				if (i > highest) {
					highest = i;
					hit = 0;
				} else if (i == highest) {
					hit++;
				}

			}
			System.out.println("Highest:  " + highest + "  Hit:  " + hit);
			if (listToSolve.get(i).getPreSet()) {
				System.out.println(i + "  preset = true");
				if (direction) {
					i++;

				} else if (!direction && i > 0) {
					i--;

				} else {
					i = 0;
					direction = true;

				}
			} else {
				if (!direction) {
					int sq = listToSolve.get(i).getNumber();
					t = sq;

				}
				t++;

				System.out.println(i + "  " + t + "run");
				while (t < 10 && !runDone) {
					boolean checkA = false;
					boolean checkB = false;
					boolean checkC = false;

					if (checkRow(listToSolve, (listToSolve.get(i)), t) == false) {
						System.out.println("checkRow True  " + t);
						checkA = true;
					}
					if (checkCol(listToSolve, (listToSolve.get(i)), t) == false) {
						System.out.println("checkCol True  " + t);
						checkB = true;
					}
					if (checkSquare(listToSolve, (listToSolve.get(i)), t) == false) {
						System.out.println("checkSquare True  " + t);
						checkC = true;
					}
					if (checkA && checkB && checkC) {
						listToSolve.get(i).setVal(t);
						System.out.println(i + "  run done at " + t);
						i++;
						t = 0;
						runDone = true;
						direction = true;
					} else {
						t++;
					}
				}
				if (t > 9) {
					listToSolve.get(i).setVal(0);
					listToSolve.get(i).setTestNum(0);
					System.out.println("Doing reset " + i);
					t = 0;
					direction = false;
					printPuzzle(listToSolve);
					if (i > 0) {
						i--;
					} else if (i == 0) {
						direction = true;
					}
				}
			}
		}

		return listToSolve;// end

	}
}
}
