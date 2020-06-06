package com.sudoku.eu;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;


public class GUI {
	public static void main(String args[]) {
		JPanel panel = new JPanel(new SpringLayout());

		int rows = 9;
		int cols = 9;
		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				int anInt = (int) Math.pow(r, c);
				JTextField textField = new JTextField(Integer.toString(anInt));
				panel.add(textField);
			}
			
		}
	}
}