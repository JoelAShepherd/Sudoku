package com.sudoku.eu;

import java.awt.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class SolvingAlg extends Organiser{

	
	
	public SolvingAlg() {
		Organiser o = Organiser.getOrganiser();
	
	}
	
	public static int countEmptyRow (ArrayList<Square> sqList, int row) {
		int val = 0;
		ArrayList<Integer> cRowL = new ArrayList<>();
		sqList.stream().
				filter(s -> s.getRow()==row)
				.map(s -> s.getNumber())
				.filter(s -> s==0)
				.forEach(s -> cRowL.add(s));
		val = cRowL.size();
		return val;
	}
	
	public static int countEmptyCol (ArrayList<Square> sqList, int col) {
		int val = 0;
		ArrayList<Integer> cColL = new ArrayList<>();
		sqList.stream().
				filter(s -> s.getCol()==col)
				.map(s -> s.getNumber())
				.filter(s -> s==0)
				.forEach(s -> cColL.add(s));
		val = cColL.size();
		return val;
	}
	
	public static int countEmptySq (ArrayList<Square> sqList, int sq) {
		int val = 0;
		ArrayList<Integer> cSqL = new ArrayList<>();
		sqList.stream().
				filter(s -> s.getSquare()==sq)
				.map(s -> s.getNumber())
				.filter(s -> s==0)
				.forEach(s -> cSqL.add(s));
		val = cSqL.size();
		return val;
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
		
		//checks for single gaps in rows, cols or Sqs
		boolean changed = true;
		while (changed) {
			changed = false;
			for (int i= 0; i<9; i++) {//rows
				int gaps = 0;
				gaps = countEmptyRow(listToSolve, i);
				if (gaps == 1) {
					int j = i;
					int cellID = 0;
					java.util.List<Integer> sqIDList = listToSolve.stream()
					.filter(s -> s.getRow()==j)
					.filter(s -> s.getNumAsInteger()==0)
					.map(s -> s.getSqID())
					.collect(Collectors.toList());
					cellID = sqIDList.get(0);
					java.util.List<Integer> numList = listToSolve.stream()
							.filter(s -> s.getRow()==j)
							.map(s -> s.getNumber())
							.collect(Collectors.toList());
					for (int k = 1; k<10;) {
						
					}
					
					}
			}
		}
		
		
		int i = 0;
		int t = 0;
		boolean direction = true;
		int highest = 0;
		int hit = 0;
		
		
		while (i<81) { //start of brute force
			boolean runDone = false;
			if (i>= highest) {
				if(i>highest){
					highest = i;
					hit = 0;
				}
				else if(i == highest) {
					hit++;
				}
			
			}
			System.out.println("Highest:  " + highest + "  Hit:  " + hit);
			if (listToSolve.get(i).getPreSet()) {
				System.out.println(i + "  preset = true");
				if (direction) {
					i++;
					
				}
				else if (!direction && i>0) {
					i--;
					
				}
				else {
					i=0;
					direction = true;
					
				}
			}
			else {
				if (!direction) {
					int sq = listToSolve.get(i).getNumber();
					t = sq;
					
				}
				t++;
				
				System.out.println(i + "  " + t + "run");
				while (t<10 && !runDone) {
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
					if (checkSquare(listToSolve, (listToSolve.get(i)), t) == false){
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
					}
					else {
						t++;
					}
				}
				if (t>9) {
					listToSolve.get(i).setVal(0);
					listToSolve.get(i).setTestNum(0);
					System.out.println("Doing reset " + i);
					t = 0;
					direction = false;
					printPuzzle(listToSolve);
					if (i>0) {
						i--;
					}
					else if (i==0) {
						direction =true;
					}
				}
			}
		}
		
		return listToSolve;//end
	
	}
}
	

