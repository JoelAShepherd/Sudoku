package com.sudoku.eu;

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