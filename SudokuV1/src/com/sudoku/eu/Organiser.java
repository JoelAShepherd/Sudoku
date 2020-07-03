package com.sudoku.eu;

import java.util.ArrayList;
import java.util.stream.Collectors;
import javax.swing.JFrame;


public class Organiser {
	public static ArrayList<Square> sList;
	private static int rRow;
	public static Organiser o;
	
	
public static void main(String[] args) {
	Organiser o = new Organiser();
}
	
	public Organiser()
	{
		sList = new ArrayList<>();
		createSquares();
		printPuzzle(sList);
	}

	public void createSquares() {
		int square = 0;
		int count = 0;
		for (int r=0; r<9; r++) {
			for (int c=0; c<9; c++) {
				if (r<3 && c<3) {
					square = 0;
				}
				else if (r<3 && c>2 && c<6){
					square = 1;
				}
				else if (r<3 && c>5){
					square = 2;
				}
				else if (r>2 && r<6 && c<3){
					square = 3;
				}
				else if (r>2 && r<6 && c>2 && c<6){
					square = 4;
				}
				else if (r>2 && r<6 && c>5){
					square = 5;
				}
				else if (r>5 && c<3){
					square = 6;
				}
				else if (r>5 && c>2 && c<2){
					square = 7;
				}
				else if (r>5 && c>5){
					square = 8;
				}
				Square s = new Square(r, c, square, count);
				sList.add(count, s);
				count++;
			}
		}
	
	}
	public void printSList() {
		
		int i = 0;
		while (i<(sList.size())) {
			Square b = sList.get(i);
			System.out.println(b.getAll());
			i++;
		}
		
	}
	public static ArrayList<Square> getSList(){
		return sList;
	}
	
	public static void printPuzzle(ArrayList<Square> listToSolve) {
		rRow= 0;
		while (rRow<9) {
			String c = listToSolve.stream()
				.filter(s -> s.getRow()==rRow)
				.map(square -> square.getNumber())
				.map(num -> String.valueOf(num))
				.collect(Collectors.joining("  "));
			System.out.println(c);
			rRow++;
		}
			
		
	}
	
	public void puzzleCheck1() {
		Square zero = sList.get(0);
		zero.setValAndPreset(9);
		Square one = sList.get(1);
		one.setValAndPreset(2);
		Square two = sList.get(2);
		two.setValAndPreset(3);
		Square three = sList.get(3);
		three.setValAndPreset(4);
		Square four = sList.get(4);
		four.setValAndPreset(5);
		Square five = sList.get(5);
		five.setValAndPreset(6);
		Square six = sList.get(6);
		six.setValAndPreset(7);
		Square seven = sList.get(7);
		seven.setValAndPreset(8);
		Square eight = sList.get(8);
		eight.setValAndPreset(9);
		
	}
	public String getSqNum(int index) {
		String n = sList.get(index).getNumAsStr();
		return n;
	}
	
	public static Organiser getOrganiser() {
		return o;
	}
	
	public static boolean isNumeric(String strNum) {
	    if (strNum == null) {
	        return false;
	    }
	    try {
	        double d = Double.parseDouble(strNum);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}
	
	public void clearPresets() {
		for (Square s: sList) {
			s.resetPreset();
		}
	}
	
	
}







