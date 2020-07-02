package com.sudoku.eu;

import java.util.ArrayList;

public class Scrap {



	


public static void codePrinter() {
	for (int i=0; i<81; i++) {
		String s = "cellx.setName(\"x\");";
		String num = Integer.toString(i);
		s.replace("x", num);
		System.out.println("cell" + i + ".setName(\"" + i + "\");");
		
	}
}

public static void main (String[] args) {
	codePrinter();
}
	
}

//Scrap:

public static ArrayList<Square> solve(ArrayList<Square> listToSolve) {
	int i = 0;
	int t = 0;
	
	while (i<81) {
	if (i<81) { //check 1
		boolean runDone = false;
		
		if (listToSolve.get(i).getPreSet()) { //check 2
			System.out.println("True");
			i++;
			runDone = true; //out 1
		}
		else{ // not preset
			t = (listToSolve.get(i).getTestNum());
			if (t == 0) {
				t++;
				listToSolve.get(i).setTestNum(t);
			}
		
			System.out.println("Preset is False" + "  " + i + " " + t);
			while (t<10 && !runDone) { //check 3
				System.out.println("T<10   " + t);
				//if (checkRow(listToSolve, (listToSolve.get(i)), t) == false &&
				//checkCol(listToSolve, (listToSolve.get(i)), t) == false &&
				//checkSquare(listToSolve, (listToSolve.get(i)), t) == false){
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
				System.out.println("All three checks complete");
				if (checkA && checkB && checkC) { //check 4
					listToSolve.get(i).setVal(t);
					i++;
					runDone = true; //out 3
				}
				else if (!runDone){
					t++; //out 4
					
				}
				
				
			
			}
				
			
			
			
			if (!runDone){ // out 2!
				System.out.println("got here2");
				listToSolve.get(i).setTestNum(0);
				int b = 1;
				int checkIndex = i;
				while (listToSolve.get(checkIndex-1).getPreSet() == true) {
					checkIndex--;
					b++;
					}
				i = i-b;
				runDone = true;
			}
		
		
	
		}
	}
	
	
		
	}
	
if (i == listToSolve.size()) {
	if(checkIfSolved(listToSolve)) {
		printPuzzle(listToSolve);
		System.out.println("got here3");
	}
	}
else {
	System.out.println("An error has occured.");
}
	return listToSolve;

}








