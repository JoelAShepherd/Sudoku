package com.sudoku.eu;


import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.SwingUtilities;


public class GUI {
	private JFrame frame;
	private JTable table;
	
	
public GUI() {
	JFrame frame = new JFrame();
	
	
	String [][] data = {
			{"0", "0", "0", "0", "0", "0", "0", "0", "0"},
			{"0", "0", "0", "0", "0", "0", "0", "0", "0"},
			{"0", "0", "0", "0", "0", "0", "0", "0", "0"},
			{"0", "0", "0", "0", "0", "0", "0", "0", "0"},
			{"0", "0", "0", "0", "0", "0", "0", "0", "0"},
			{"0", "0", "0", "0", "0", "0", "0", "0", "0"},
			{"0", "0", "0", "0", "0", "0", "0", "0", "0"},
			{"0", "0", "0", "0", "0", "0", "0", "0", "0"},
			{"0", "0", "0", "0", "0", "0", "0", "0", "0"}
						
	};
	
	String [] columns = {"", "", "", "", "", "", "", "", ""};
			
	
	JTable table = new JTable(data, columns);
	frame.setTitle("Sudoku Solver");
	frame.setSize(300, 400);
	
	table.setBounds(0, 0, 300, 300);
	
	frame.pack();
	frame.setVisible(true);
	
}
	
	
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override 
			public void run() {
				new GUI();
			}
		});

	}
}