package com.sudoku.eu;

import java.util.ArrayList;
import java.util.stream.Collectors;
import javax.swing.JFrame;


public class Organiser extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected static ArrayList<Square> sList;
	private int rRow;
	
	
public static void main(String[] args) {
	Organiser o = new Organiser();
		
}
	
	public Organiser()
	{
		sList = new ArrayList<>();
		createSquares();
		puzzleCheck1();
		printPuzzle();
	}

	public void createSquares() {
		int square = 0;
		int count = 0;
		for (int r=1; r<10; r++) {
			for (int c=1; c<10; c++) {
				if (r<4 && c<4) {
					square = 1;
				}
				else if (r<4 && c>3 && c<7){
					square = 2;
				}
				else if (r<4 && c>6){
					square = 3;
				}
				else if (r>3 && r<7 && c<4){
					square = 4;
				}
				else if (r>3 && r<7 && c>3 && c<7){
					square = 5;
				}
				else if (r>3 && r<7 && c>6){
					square = 6;
				}
				else if (r>6 && c<4){
					square = 7;
				}
				else if (r>6 && c>3 && c<7){
					square = 8;
				}
				else if (r>6 && c>6){
					square = 9;
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
	public ArrayList<Square> getSList(){
		return sList;
	}
	
	public void printPuzzle() {
		rRow = 1;
		while (rRow<10) {
			String c = sList.stream()
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
	
	public Organiser getOrganiser() {
		return this;
	}
}







