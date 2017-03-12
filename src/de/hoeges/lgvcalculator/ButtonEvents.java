	/**
	 * new progam for stock management
	 * Lagerverwaltung30
	 * LgvCalculator
	 * class ButtonEvents
	 * created by Hans-Dieter Hoeges
	 * Eclipse, UTF8
	 * editing 24.03.2013
	 */


package de.hoeges.lgvcalculator;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JMenuItem;


public class ButtonEvents implements ActionListener{
	
	

	private static Calculator cal = new Calculator("Calculator");
	private static CopyToClipBoard copyToClipBoard;
	
	

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JMenuItem){
			
			
			//Programm beenden , exit program
			if (e.getActionCommand().equals("MEX")){
				cal.exitProgram();
			}
			//Information
			if (e.getActionCommand().equals("MINFO")){
				cal.information();
			}			
			//Sprachen, languages
			//Deutsch , German
			
			if (e.getActionCommand().equals("MDE")){
				cal.langDE();
			}			
			
			//Englisch, English
			if (e.getActionCommand().equals("MEN")){
				cal.langEN();
			}			
			
			//Französisch, French
			if (e.getActionCommand().equals("MFR")){
				cal.langFR();
			}			
			
			//Finnisch, Finnish
			if (e.getActionCommand().equals("MFI")){
				cal.langFI();
			}			
			
			//Dänisch, Danish
			if (e.getActionCommand().equals("MDA")){
				cal.langDA();
			}			
			
			//Niederländisch, Dutch
			if (e.getActionCommand().equals("MNL")){
				cal.langNL();
			}			
			
			//Kroatisch, Kroatish
			if (e.getActionCommand().equals("MHR")){
				cal.langHR();
			}			
			
			
			//Spanisch, Spanish
			if (e.getActionCommand().equals("MES")){
				cal.langES();
			}			
			
			//Italienisch, Italian
			if (e.getActionCommand().equals("MIT")){
				cal.langIT();
			}			
			
			//Ungarisch, Hungarian
			if (e.getActionCommand().equals("MHU")){
				cal.langHU();
			}			
		}
		
//.........................................................		
		if (e.getSource() instanceof JButton){
			
			if (e.getActionCommand().equals("COPY")){
				copyToClipBoard = new CopyToClipBoard();
				copyToClipBoard.setCopy(cal.getEnter());
			}
			
			if (e.getActionCommand().equals("PASTE")){
				copyToClipBoard = new CopyToClipBoard();
				cal.setEnter(copyToClipBoard.getClipboardContents());
				
			}
				// clear enter
			if (e.getActionCommand().equals("CE")){
				cal.clearEnter();
			}
			
				// clear complete
			if (e.getActionCommand().equals("C")){
				cal.clearComplete();
			}

			//----------------------------------------
			if (e.getActionCommand().equals("7")){
				cal.setNumber("7");
			}
			
			if (e.getActionCommand().equals("8")){
				cal.setNumber("8");
			}
			
			if (e.getActionCommand().equals("9")){
				cal.setNumber("9");
			}
			
			if (e.getActionCommand().equals("DIV")){
				// division
				cal.setOperator('/');
			}
			
			if (e.getActionCommand().equals("REZ")){
				// reziprog
				cal.setOperator('z');
			}
			
			if (e.getActionCommand().equals("PZ")){
				// %
				cal.setOperator('Z');
			}
			
			if (e.getActionCommand().equals("SIN")){
				// sin
				cal.setOperator('I');
			}
			
			if (e.getActionCommand().equals("M")){
				// M diplay to memory
				cal.setMem('m');
			}
			
			if (e.getActionCommand().equals("4")){
				cal.setNumber("4");
			}
			
			if (e.getActionCommand().equals("5")){
				cal.setNumber("5");
			}
			
			if (e.getActionCommand().equals("6")){
				cal.setNumber("6");
			}
			
			if (e.getActionCommand().equals("MUL")){
				// multiplication
				cal.setOperator('*');
			}
			
			if (e.getActionCommand().equals("EXP2")){
				// potency square
				cal.setOperator('x');
			}
			
			if (e.getActionCommand().equals("XhY")){
				// X^y
				cal.setOperator('H');
			}
			
			if (e.getActionCommand().equals("COS")){
				// cos
				cal.setOperator('C');
			}
						
			if (e.getActionCommand().equals("MPLUS")){
				// M diplay to memory plus
				cal.setMem('p');
			}
			
			if (e.getActionCommand().equals("1")){
				cal.setNumber("1");
			}
			
			if (e.getActionCommand().equals("2")){
				cal.setNumber("2");
			}
			
			if (e.getActionCommand().equals("3")){
				cal.setNumber("3");
			}
			
			if (e.getActionCommand().equals("MIN")){
				// subtraction
				cal.setOperator('-');
			}
			
			if (e.getActionCommand().equals("SQRT")){
				// sqrt, square-be rooted
				cal.setOperator('q');
			}
			
			if (e.getActionCommand().equals("SQY")){
				// y sqrt X
				cal.setOperator('Q');
			}
			
			if (e.getActionCommand().equals("TAN")){
				// tan
				cal.setOperator('T');
			}
					
			if (e.getActionCommand().equals("MMIN")){
				// M diplay to memory subtraction
				cal.setMem('n');
			}
			
			if (e.getActionCommand().equals("0")){
				cal.setNumber("0");
			}
			
			if (e.getActionCommand().equals("KOM")){
				cal.setKom();
			}
			
			if (e.getActionCommand().equals("GL")){
				// = result
					cal.setGl();
			}
			
			if (e.getActionCommand().equals("PLUS")){
				// addition
				cal.setOperator('+');
			}
			
			if (e.getActionCommand().equals("KR")){
				//	reziprog
				cal.setOperator('w');
			}
			
			if (e.getActionCommand().equals("PI")){
				// Pi
				cal.setPi();
			}
			
			if (e.getActionCommand().equals("COT")){
				// cot
				cal.setOperator('o');
			}
						
			if (e.getActionCommand().equals("MR")){
				// MR memory to display
				cal.setMem('r');
			}
			
			if (e.getActionCommand().equals("MC")){
				// memory clear
				cal.setMem('d');
			}

		}
	}

}
