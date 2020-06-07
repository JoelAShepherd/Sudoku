package com.sudoku.eu;


import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;


public class GUI {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField jtf0 = new JTextField(2);
	JTextField jtf1 = new JTextField(2);
	JTextField jtf2 = new JTextField(2);
	JTextField jtf3 = new JTextField(2);
	JTextField jtf4 = new JTextField(2);
	JTextField jtf5 = new JTextField(2);
	JTextField jtf6 = new JTextField(2);
	JTextField jtf7 = new JTextField(2);
	JTextField jtf8 = new JTextField(2);
	
	
	
public GUI() {
	
	panel.setLayout(new GridBagLayout());
	GridBagConstraints gbc = new GridBagConstraints();
	
	gbc.gridwidth = 1;
	gbc.gridheight = 1; 
	gbc.weightx = +1.;
	gbc.ipadx = 1;
	
	
	gbc.gridx = 0;
	gbc.gridy = 0;
	panel.add(jtf0, gbc);
	
	gbc.gridx = 1;
	gbc.gridy = 0;
	panel.add(jtf1, gbc);
	
	gbc.gridx = 2;
	gbc.gridy = 0;
	panel.add(jtf2, gbc);
	
	gbc.gridx = 0;
	gbc.gridy = 1;
	panel.add(jtf8);
	
	
	
	frame.add(panel);
	frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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