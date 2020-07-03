package com.sudoku.eu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class S2 extends Organiser {

	private static JPanel contentPane;
	private static JTextField cell0, cell1, cell2, cell3, cell4, cell5, cell6, cell7, cell8,
	cell9, cell10, cell11, cell12, cell13, cell14, cell15, cell16, cell17, cell18,
	cell19, cell20, cell21, cell22, cell23, cell24, cell25, cell26, cell27, cell28,
	cell29, cell30, cell31, cell32, cell33, cell34, cell35, cell36, cell37, cell38, 
	cell39, cell40, cell41, cell42, cell43, cell44, cell45, cell46, cell47, cell48,
	cell49, cell50, cell51, cell52, cell53, cell54, cell55, cell56, cell57, cell58,
	cell59, cell60, cell61, cell62, cell63, cell64, cell65, cell66, cell67, cell68,
	cell69, cell70, cell71, cell72, cell73, cell74, cell75, cell76, cell77, cell78,
	cell79, cell80;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				createGUI();
			}});
	}

	/**
	 * Create the frame.
	 */
	public static void createGUI() {
		
		JFrame jf = new JFrame();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(100, 100, 600, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 3));
		jf.setContentPane(contentPane);
				
		contentPane.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
			
		
		cell0 = new JTextField();
		cell1 = new JTextField();
		cell2 = new JTextField();
		cell3 = new JTextField();
		cell4 = new JTextField();
		cell5 = new JTextField();
		cell6 = new JTextField();
		cell7 = new JTextField();
		cell8 = new JTextField();
		cell9 = new JTextField();
		cell10 = new JTextField();
		cell11 = new JTextField();
		cell12 = new JTextField();
		cell13 = new JTextField();
		cell14 = new JTextField();
		cell15 = new JTextField();
		cell16 = new JTextField();
		cell17 = new JTextField();
		cell18 = new JTextField();
		cell19 = new JTextField();
		cell20 = new JTextField();
		cell21 = new JTextField();
		cell22 = new JTextField();
		cell23 = new JTextField();
		cell24 = new JTextField();
		cell25 = new JTextField();
		cell26 = new JTextField();
		cell27 = new JTextField();
		cell28 = new JTextField();
		cell29 = new JTextField();
		cell30 = new JTextField();
		cell31 = new JTextField();
		cell32 = new JTextField();
		cell33 = new JTextField();
		cell34 = new JTextField();
		cell35 = new JTextField();
		cell36 = new JTextField();
		cell37 = new JTextField();
		cell38 = new JTextField();
		cell39 = new JTextField();
		cell40 = new JTextField();
		cell41 = new JTextField();
		cell42 = new JTextField();
		cell43 = new JTextField();
		cell44 = new JTextField();
		cell45 = new JTextField();
		cell46 = new JTextField();
		cell47 = new JTextField();
		cell48 = new JTextField();
		cell49 = new JTextField();
		cell50 = new JTextField();
		cell51 = new JTextField();
		cell52 = new JTextField();
		cell53 = new JTextField();
		cell54 = new JTextField();
		cell55 = new JTextField();
		cell56 = new JTextField();
		cell57 = new JTextField();
		cell58 = new JTextField();
		cell59 = new JTextField();
		cell60 = new JTextField();
		cell61 = new JTextField();
		cell62 = new JTextField();
		cell63 = new JTextField();
		cell64 = new JTextField();
		cell65 = new JTextField();
		cell66 = new JTextField();
		cell67 = new JTextField();
		cell68 = new JTextField();
		cell69 = new JTextField();
		cell70 = new JTextField();
		cell71 = new JTextField();
		cell72 = new JTextField();
		cell73 = new JTextField();
		cell74 = new JTextField();
		cell75 = new JTextField();
		cell76 = new JTextField();
		cell77 = new JTextField();
		cell78 = new JTextField();
		cell79 = new JTextField();
		cell80 = new JTextField();
		
		cell0.setName("0");
		cell1.setName("1");
		cell2.setName("2");
		cell3.setName("3");
		cell4.setName("4");
		cell5.setName("5");
		cell6.setName("6");
		cell7.setName("7");
		cell8.setName("8");
		cell9.setName("9");
		cell10.setName("10");
		cell11.setName("11");
		cell12.setName("12");
		cell13.setName("13");
		cell14.setName("14");
		cell15.setName("15");
		cell16.setName("16");
		cell17.setName("17");
		cell18.setName("18");
		cell19.setName("19");
		cell20.setName("20");
		cell21.setName("21");
		cell22.setName("22");
		cell23.setName("23");
		cell24.setName("24");
		cell25.setName("25");
		cell26.setName("26");
		cell27.setName("27");
		cell28.setName("28");
		cell29.setName("29");
		cell30.setName("30");
		cell31.setName("31");
		cell32.setName("32");
		cell33.setName("33");
		cell34.setName("34");
		cell35.setName("35");
		cell36.setName("36");
		cell37.setName("37");
		cell38.setName("38");
		cell39.setName("39");
		cell40.setName("40");
		cell41.setName("41");
		cell42.setName("42");
		cell43.setName("43");
		cell44.setName("44");
		cell45.setName("45");
		cell46.setName("46");
		cell47.setName("47");
		cell48.setName("48");
		cell49.setName("49");
		cell50.setName("50");
		cell51.setName("51");
		cell52.setName("52");
		cell53.setName("53");
		cell54.setName("54");
		cell55.setName("55");
		cell56.setName("56");
		cell57.setName("57");
		cell58.setName("58");
		cell59.setName("59");
		cell60.setName("60");
		cell61.setName("61");
		cell62.setName("62");
		cell63.setName("63");
		cell64.setName("64");
		cell65.setName("65");
		cell66.setName("66");
		cell67.setName("67");
		cell68.setName("68");
		cell69.setName("69");
		cell70.setName("70");
		cell71.setName("71");
		cell72.setName("72");
		cell73.setName("73");
		cell74.setName("74");
		cell75.setName("75");
		cell76.setName("76");
		cell77.setName("77");
		cell78.setName("78");
		cell79.setName("79");
		cell80.setName("80");
		
		ArrayList<JTextField> fieldArray = new ArrayList<>();
		fieldArray.add(cell0);
		fieldArray.add(cell1);
		fieldArray.add(cell2);
		fieldArray.add(cell3);
		fieldArray.add(cell4);
		fieldArray.add(cell5);
		fieldArray.add(cell6);
		fieldArray.add(cell7);
		fieldArray.add(cell8);
		fieldArray.add(cell9);
		fieldArray.add(cell10);
		fieldArray.add(cell11);
		fieldArray.add(cell12);
		fieldArray.add(cell13);
		fieldArray.add(cell14);
		fieldArray.add(cell15);
		fieldArray.add(cell16);
		fieldArray.add(cell17);
		fieldArray.add(cell18);
		fieldArray.add(cell19);
		fieldArray.add(cell20);
		fieldArray.add(cell21);
		fieldArray.add(cell22);
		fieldArray.add(cell23);
		fieldArray.add(cell24);
		fieldArray.add(cell25);
		fieldArray.add(cell26);
		fieldArray.add(cell27);
		fieldArray.add(cell28);
		fieldArray.add(cell29);
		fieldArray.add(cell30);
		fieldArray.add(cell31);
		fieldArray.add(cell32);
		fieldArray.add(cell33);
		fieldArray.add(cell34);
		fieldArray.add(cell35);
		fieldArray.add(cell36);
		fieldArray.add(cell37);
		fieldArray.add(cell38);
		fieldArray.add(cell39);
		fieldArray.add(cell40);
		fieldArray.add(cell41);
		fieldArray.add(cell42);
		fieldArray.add(cell43);
		fieldArray.add(cell44);
		fieldArray.add(cell45);
		fieldArray.add(cell46);
		fieldArray.add(cell47);
		fieldArray.add(cell48);
		fieldArray.add(cell49);
		fieldArray.add(cell50);
		fieldArray.add(cell51);
		fieldArray.add(cell52);
		fieldArray.add(cell53);
		fieldArray.add(cell54);
		fieldArray.add(cell55);
		fieldArray.add(cell56);
		fieldArray.add(cell57);
		fieldArray.add(cell58);
		fieldArray.add(cell59);
		fieldArray.add(cell60);
		fieldArray.add(cell61);
		fieldArray.add(cell62);
		fieldArray.add(cell63);
		fieldArray.add(cell64);
		fieldArray.add(cell65);
		fieldArray.add(cell66);
		fieldArray.add(cell67);
		fieldArray.add(cell68);
		fieldArray.add(cell69);
		fieldArray.add(cell70);
		fieldArray.add(cell71);
		fieldArray.add(cell72);
		fieldArray.add(cell73);
		fieldArray.add(cell74);
		fieldArray.add(cell75);
		fieldArray.add(cell76);
		fieldArray.add(cell77);
		fieldArray.add(cell78);
		fieldArray.add(cell79);
		fieldArray.add(cell80);
		
		
		JLabel label = new JLabel("Enter the numbers to solve the puzzle!");
		JButton button = new JButton("Solve");
		
		for (JTextField j: fieldArray) {
		String jName = j.getName();
		int jNum = Integer.parseInt(jName);
		
			if() {
			
		}
		}
		
		int t = 2;
		int l = 2;
		int b = 2;
		int r = 10;
		int hDiv = 18;
		int vDiv = 18;
		
		c.ipadx = 15;
		c.insets = new Insets(t, l, b, r);
		c.gridx = 0;
		c.gridy = 0;
		contentPane.add(cell0, c);
		c.gridx = 1;
		contentPane.add(cell1, c);
		c.gridx = 2;
		c.insets = new Insets(t, l, b, hDiv);
		contentPane.add(cell2, c);
		c.gridx = 3;
		c.insets= new Insets(t, l, b, r);
		contentPane.add(cell3, c);
		c.gridx = 4;
		contentPane.add(cell4, c);
		c.insets = new Insets(t, l, b, hDiv);
		c.gridx = 5;
		contentPane.add(cell5,c);
		c.insets= new Insets(t, l, b, r);
		c.gridx = 6;
		contentPane.add(cell6, c);
		c.gridx = 7;
		contentPane.add(cell7, c);
		c.gridx = 8;
		contentPane.add(cell8, c);
		c.gridy = 1;	//new row
		c.gridx = 0;
		contentPane.add(cell9, c);
		c.gridx = 1;
		contentPane.add(cell10, c);
		c.gridx = 2;
		c.insets = new Insets(t, l, b, hDiv);
		contentPane.add(cell11, c);
		c.gridx = 3;
		c.insets= new Insets(t, l, b, r);
		contentPane.add(cell12, c);
		c.gridx = 4;
		contentPane.add(cell13, c);
		c.insets = new Insets(t, l, b, hDiv);
		c.gridx = 5;
		contentPane.add(cell14,c);
		c.insets= new Insets(t, l, b, r);
		c.gridx = 6;
		contentPane.add(cell15, c);
		c.gridx = 7;
		contentPane.add(cell16, c);
		c.gridx = 8;
		contentPane.add(cell17, c);
		c.gridy = 2; 	//new row
		c.gridx = 0;
		c.insets = new Insets(t, l, vDiv, r);
		contentPane.add(cell18, c);
		c.gridx = 1;
		contentPane.add(cell19, c);
		c.gridx = 2;
		c.insets = new Insets(t, l, vDiv, hDiv);
		contentPane.add(cell20, c);
		c.gridx = 3;
		c.insets= new Insets(t, l, vDiv, r);
		contentPane.add(cell21, c);
		c.gridx = 4;
		contentPane.add(cell22, c);
		c.insets = new Insets(t, l, vDiv, hDiv);
		c.gridx = 5;
		contentPane.add(cell23,c);
		c.insets= new Insets(t, l, vDiv, r);
		c.gridx = 6;
		contentPane.add(cell24, c);
		c.gridx = 7;
		contentPane.add(cell25, c);
		c.gridx = 8;
		contentPane.add(cell26, c);
		c.gridx = 0;	//new row
		c.gridy = 3; 
		c.insets = new Insets(t, l, b, r);
		contentPane.add(cell27, c);
		c.gridx = 1;
		contentPane.add(cell28, c);
		c.gridx = 2;
		c.insets = new Insets(t, l, b, hDiv);
		contentPane.add(cell29, c);
		c.gridx = 3;
		c.insets= new Insets(t, l, b, r);
		contentPane.add(cell30, c);
		c.gridx = 4;
		contentPane.add(cell31, c);
		c.insets = new Insets(t, l, b, hDiv);
		c.gridx = 5;
		contentPane.add(cell32,c);
		c.insets= new Insets(t, l, b, r);
		c.gridx = 6;
		contentPane.add(cell33, c);
		c.gridx = 7;
		contentPane.add(cell34, c);
		c.gridx = 8;
		contentPane.add(cell35, c);
		c.gridy = 4; 	//new row
		c.gridx = 0;
		c.insets = new Insets(t, l, b, r);
		contentPane.add(cell36, c);
		c.gridx = 1;
		contentPane.add(cell37, c);
		c.gridx = 2;
		c.insets = new Insets(t, l, b, hDiv);
		contentPane.add(cell38, c);
		c.gridx = 3;
		c.insets= new Insets(t, l, b, r);
		contentPane.add(cell39, c);
		c.gridx = 4;
		contentPane.add(cell40, c);
		c.insets = new Insets(t, l, b, hDiv);
		c.gridx = 5;
		contentPane.add(cell41,c);
		c.insets= new Insets(t, l, b, r);
		c.gridx = 6;
		contentPane.add(cell42, c);
		c.gridx = 7;
		contentPane.add(cell43, c);
		c.gridx = 8;
		contentPane.add(cell44, c);
		c.gridy = 5; 	//new row
		c.gridx = 0;
		c.insets = new Insets(t, l, vDiv, r);
		contentPane.add(cell45, c);
		c.gridx = 1;
		contentPane.add(cell46, c);
		c.gridx = 2;
		c.insets = new Insets(t, l, vDiv, hDiv);
		contentPane.add(cell47, c);
		c.gridx = 3;
		c.insets= new Insets(t, l, vDiv, r);
		contentPane.add(cell48, c);
		c.gridx = 4;
		contentPane.add(cell49, c);
		c.insets = new Insets(t, l, vDiv, hDiv);
		c.gridx = 5;
		contentPane.add(cell50,c);
		c.insets= new Insets(t, l, vDiv, r);
		c.gridx = 6;
		contentPane.add(cell51, c);
		c.gridx = 7;
		contentPane.add(cell52, c);
		c.gridx = 8;
		contentPane.add(cell53, c);
		c.gridy = 6; 	//new row
		c.gridx = 0;
		c.insets = new Insets(t, l, b, r);
		contentPane.add(cell54, c);
		c.gridx = 1;
		contentPane.add(cell55, c);
		c.gridx = 2;
		c.insets = new Insets(t, l, b, hDiv);
		contentPane.add(cell56, c);
		c.gridx = 3;
		c.insets= new Insets(t, l, b, r);
		contentPane.add(cell57, c);
		c.gridx = 4;
		contentPane.add(cell58, c);
		c.insets = new Insets(t, l, b, hDiv);
		c.gridx = 5;
		contentPane.add(cell59,c);
		c.insets= new Insets(t, l, b, r);
		c.gridx = 6;
		contentPane.add(cell60, c);
		c.gridx = 7;
		contentPane.add(cell61, c);
		c.gridx = 8;
		contentPane.add(cell62, c);
		c.gridy = 7; 	//new row
		c.gridx = 0;
		c.insets = new Insets(t, l, b, r);
		contentPane.add(cell63, c);
		c.gridx = 1;
		contentPane.add(cell64, c);
		c.gridx = 2;
		c.insets = new Insets(t, l, b, hDiv);
		contentPane.add(cell65, c);
		c.gridx = 3;
		c.insets= new Insets(t, l, b, r);
		contentPane.add(cell66, c);
		c.gridx = 4;
		contentPane.add(cell67, c);
		c.insets = new Insets(t, l, b, hDiv);
		c.gridx = 5;
		contentPane.add(cell68,c);
		c.insets= new Insets(t, l, b, r);
		c.gridx = 6;
		contentPane.add(cell69, c);
		c.gridx = 7;
		contentPane.add(cell70, c);
		c.gridx = 8;
		contentPane.add(cell71, c);
		c.gridy = 8; 	//new row
		c.gridx = 0;
		c.insets = new Insets(t, l, b, r);
		contentPane.add(cell72, c);
		c.gridx = 1;
		contentPane.add(cell73, c);
		c.gridx = 2;
		c.insets = new Insets(t, l, b, hDiv);
		contentPane.add(cell74, c);
		c.gridx = 3;
		c.insets= new Insets(t, l, b, r);
		contentPane.add(cell75, c);
		c.gridx = 4;
		contentPane.add(cell76, c);
		c.insets = new Insets(t, l, b, hDiv);
		c.gridx = 5;
		contentPane.add(cell77,c);
		c.insets= new Insets(t, l, b, r);
		c.gridx = 6;
		contentPane.add(cell78, c);
		c.gridx = 7;
		contentPane.add(cell79, c);
		c.gridx = 8;
		contentPane.add(cell80, c);
		
		c.gridx = 0;
		c.gridy = 9;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridwidth = 9;
		contentPane.add(button, c);
		c.gridy = 10;
		contentPane.add(label, c);
		
		jf.pack();
		jf.setVisible(true);
		
		
		
		
		button.addActionListener(new ActionListener() {
				
			@Override
			public void actionPerformed(ActionEvent arg0) {
				boolean numCheck = true;
				Organiser.main(null);
				ArrayList<Square> newSList = getSList();
				
				//Checks the content of the cells. If values are valid, sets the values in the 
				//cells to the number value in the equivalent square object.
				for (JTextField j: fieldArray) {
					j.setBackground(Color.WHITE);
					
					if (numCheck) {
						String valAsStr = j.getText();
						if (valAsStr.contentEquals("")) {
							valAsStr = "0";
						}
						if (isNumeric(valAsStr)==false) {
							j.setText("");
							j.setBackground(Color.RED);
							label.setText("Enter a number 1-9");
							numCheck = false;
						}
						int value = 0;
						try {
							value = Integer.parseInt(valAsStr);
						} catch (NumberFormatException nfe) {
							
						}
						if (value > 9) {
									j.setText("");
									j.setBackground(Color.RED);
									label.setText("Enter a number 1-9");
									numCheck = false;
								}
						String cellName = j.getName();
						int cellNum = Integer.parseInt(cellName);
						Square sq = newSList.get(cellNum);
						sq.setValAndPreset(value);
						}
				
				}
				
				if (numCheck) {
					ArrayList<Square> solvedList = new ArrayList<>(SolvingAlg.solve(newSList));
					Organiser.printPuzzle(solvedList);
				}
				
				}
				
				
			
		});
	}

}
