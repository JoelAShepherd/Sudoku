package com.sudoku.eu;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class S2 extends Organiser {

	private JPanel contentPane;
	private JTextField cell0, cell1, cell2, cell3, cell4, cell5;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					S2 frame = new S2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public S2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		Dimension d = new Dimension(1, 1);
		
		
		cell0 = new JTextField(sList.get(0).getNumAsStr());
		
		cell0.setColumns(1);
		cell1 = new JTextField("1");
		
		cell2 = new JTextField("2");
		cell3 = new JTextField("3");
		cell4 = new JTextField("4");
		cell5 = new JTextField("5");
		
		contentPane.add(cell0);
		contentPane.add(cell1);
		contentPane.add(cell2);
		contentPane.add(cell3);
		contentPane.add(cell4);
		contentPane.add(cell5);
		
		contentPane.setLayout(new GridLayout(5, 5));
		pack();
		setVisible(true);
	}

}
