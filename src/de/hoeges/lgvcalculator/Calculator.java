	/**
	 * new progam for stock management
	 * Lagerverwaltung30
	 * LgvCalculator
	 * class Calculator,  main class
	 * created by Hans-Dieter Hoeges
	 * Eclipse, UTF8
	 * editing 24.03.2013
	 */


package de.hoeges.lgvcalculator;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;


// TODO: Auto-generated Javadoc
/**
 * The Class Calculator.
 *
 * @author Hoeges
 */

@SuppressWarnings("serial")
public class Calculator extends JFrame {

	/** The cal. */
	//frame
	private static Calculator cal;	// new Calculator("Calculator");
	
	/** The bevn. */
	private static ButtonEvents bevn = new ButtonEvents();

	/** The m program. */
	//member
	private static String mProgram;
	
	/** The m exit. */
	private static String mExit;
	
	/** The m languages. */
	private static String mLanguages;
	
	/** The m german. */
	private static String mGerman;
	
	/** The m english. */
	private static String mEnglish;
	
	/** The m french. */
	private static String mFrench;
	
	/** The m finnish. */
	private static String mFinnish;
	
	/** The m danish. */
	private static String mDanish;
	
	/** The m dutch. */
	private static String mDutch;
	
	/** The m croatian. */
	private static String mCroatian;
	
	/** The m spanish. */
	private static String mSpanish;
	
	/** The m italian. */
	private static String mItalian;
	
	/** The m hungarian. */
	private static String mHungarian;
	
	/** The m info. */
	private static String mInfo;
	
	/** The m information. */
	private static String mInformation;
	
	/** The b copy T. */
	private static String bCopyT;
	
	/** The b paste T. */
	private static String bPasteT;
	
	/** The l mem. */
	private static String lMem;
	
	/** The m lingo. */
	private static String[] mLingo = new String[30];
	
	/** The m LG. */
	private static String mLG;
	
	/** The in 1. */
	private static String in1;
	
	/** The in 2. */
	private static String in2;
	
	/** The in 3. */
	private static String in3;
	
	/** The in 4. */
	private static String in4;
	
	/** The in 5. */
	private static String in5;
	
	/** The in 6. */
	private static String in6;
	
	/** The name. */
	private static String fName = "calLG.GID";
	
	/** The err 1. */
	private static String err1;
	
	/** The err 2. */
	private static String err2;
	
/** The km. */
//	computing	
	private static boolean km = false;
	
	/** The inp. */
	private static boolean inp = true;
	
	/** The number 1 set. */
	private static boolean number1_set = false;
	
	/** The number 2 set. */
	private static boolean number2_set = false;
	
	/** The err set. */
	private static boolean err_set = false;
	
	/** The n 3. */
	private static boolean n3 = false;
	
	/** The n M 4. */
	private static double nM1,nM2,nM3,nM4;
	
	/** The op. */
	private static char op;
	
	/** The res. */
	private static double res = 0.0;
	
/** The enter. */
//	components	
	private static JTextField enter;
	
	/** The m. */
	private static JLabel m;
	
	/** The memory. */
	private static JTextField memory;
	
	/** The copy. */
	private static JButton copy;
	
	/** The paste. */
	private static JButton paste;
	
	/** The menu 1. */
	private static JMenu menu1;
	
	/** The item 11. */
	private static JMenuItem item11;
	
	/** The menu 2. */
	private static JMenu menu2;
	
	/** The item 21. */
	private static JMenuItem item21;
	
	/** The item 22. */
	private static JMenuItem item22;	
	
	/** The item 23. */
	private static JMenuItem item23;
	
	/** The item 24. */
	private static JMenuItem item24;
	
	/** The item 25. */
	private static JMenuItem item25;	
	
	/** The item 26. */
	private static JMenuItem item26;	
	
	/** The item 27. */
	private static JMenuItem item27;	
	
	/** The item 28. */
	private static JMenuItem item28;	
	
	/** The item 29. */
	private static JMenuItem item29;	
	
	/** The item 30. */
	private static JMenuItem item30;	

	/** The menu 3. */
	private static JMenu menu3;
	
	/** The item 31. */
	private static JMenuItem item31;
	
	
	/** The os. */
	private static String os;
	
	/** The base dir. */
	private static String baseDir;
	
	/** The base data. */
	private static String baseData;
	
	/** The file sep. */
	private static String fileSep;
	
	
	/** The os base. */
	private String osBase;
	
	/** The progname. */
	//==================================================
	private final String PROGNAME = "Calculator.jar"; 
	//==================================================
	
	
	
//=============================================================	
/**
	 * Instantiates a new calculator.
	 *
	 * @param titel the titel
	 */
	//	Constructor	
	public Calculator(String titel) {
		super(titel);

 
		fileSep = System.getProperty("file.separator");
		os = System.getProperty("os.name");
	    osBase = os.substring(0, 4).toLowerCase();
	    
	    
	    if (osBase.equals("wind")){
	    	baseData = System.getProperty("user.home") + fileSep + "LgvData" + fileSep;
		    
	    	baseDir = System.getProperty("user.dir") + fileSep;
	    }
	    else {
	    	baseData = System.getProperty("user.home") + fileSep + ".LgvData" + fileSep;
		    
		    baseDir = System.getProperty("java.class.path").substring(0, 
		    		System.getProperty("java.class.path").length() - PROGNAME.length());	
	    }
       
	}
		
//==============================================================		
//	GUI
/**
 * Creates the and show calc.
 */
//--------------------------------------------------------------
	private static void createAndShowCalc() {
	        //Create and set up the window.
		
		cal = new Calculator("Calculator");
	    cal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       try {
	            	UIManager.setLookAndFeel(
	            	UIManager.getCrossPlatformLookAndFeelClassName());
	        	} catch (Exception e) { }
	    
	    SwingUtilities.updateComponentTreeUI(cal);
	    cal.setLayout(new FlowLayout());
	   
	    cal.setSize(new Dimension(440,310));
	    cal.setMinimumSize(new Dimension(440,310));
	    cal.setResizable(false);

	    //Fenster mit bestimmter Position und Größe starten
		Dimension dm = Toolkit.getDefaultToolkit().getScreenSize();
		int lcx = dm.width/2 - 250;
		int lcy = dm.height/2 - 185;
		cal.setLocation(lcx, lcy);
		cal.setBackground(new Color(200,200,200));
	    //Frame-Icon setzen

		File file = new File(baseDir + "images" + fileSep + "Calculator.gif");

		if (file.isFile()){
			Image image;
			try {
				image = ImageIO.read(file);
		
				cal.setIconImage(image);
				
			} catch (IOException e1){
				e1.printStackTrace();
			}
		}
		

		
//		=================================================================		    
//		Menüleiste anlegen
//		create and add menu
				    
		JMenuBar menueleiste = new JMenuBar();
		cal.setJMenuBar(menueleiste);
					
		menu1 = new JMenu(mProgram);
		menueleiste.add(menu1);
					
		item11 = new JMenuItem(mExit);
					
					
		menu1.add(item11);
					
		item11.addActionListener(bevn);
		item11.setActionCommand("MEX");
//		...............................................
		
		menu2 = new JMenu(mLanguages);
		menueleiste.add(menu2);
					
		item21 = new JMenuItem(mGerman);
		item22 = new JMenuItem(mEnglish);		
		item23 = new JMenuItem(mFrench);	
		item24 = new JMenuItem(mFinnish);	
		item25 = new JMenuItem(mDanish);	
		item26 = new JMenuItem(mDutch);	
		item27 = new JMenuItem(mCroatian);	
		item28 = new JMenuItem(mSpanish);	
		item29 = new JMenuItem(mItalian);	
		item30 = new JMenuItem(mHungarian);	
					
		menu2.add(item21);
		menu2.add(item22);
		menu2.add(item23);
		menu2.add(item24);
		menu2.add(item25);
		menu2.add(item26);
		menu2.add(item27);
		menu2.add(item28);
		menu2.add(item29);
		menu2.add(item30);
					
					
		item21.addActionListener(bevn);
		item21.setActionCommand("MDE");			
		item22.addActionListener(bevn);
		item22.setActionCommand("MEN");				
		item23.addActionListener(bevn);
		item23.setActionCommand("MFR");	
		item24.addActionListener(bevn);
		item24.setActionCommand("MFI");	
		item25.addActionListener(bevn);
		item25.setActionCommand("MDA");	
		item26.addActionListener(bevn);
		item26.setActionCommand("MNL");	
		item27.addActionListener(bevn);
		item27.setActionCommand("MHR");	
		item28.addActionListener(bevn);
		item28.setActionCommand("MES");		
		item29.addActionListener(bevn);
		item29.setActionCommand("MIT");		
		item30.addActionListener(bevn);
		item30.setActionCommand("MHU");		
		
//		...............................................
					
		menu3 = new JMenu(mInfo);
		menueleiste.add(menu3);
					
		item31 = new JMenuItem(mInformation);
					
					
		menu3.add(item31);
					
					
		item31.addActionListener(bevn);
		item31.setActionCommand("MINFO");				
		
		
//	container		
//-----------------------------------------------------------------		
	    JPanel contentPane = new JPanel();
	    contentPane.setLayout(new BorderLayout());
	    contentPane.setBackground(new Color(200,200,200));
	    contentPane.setSize(400,300);
	    cal.add(contentPane);
	    
	    
	    JPanel northpanel = new JPanel();
	    northpanel.setBackground(new Color(240,240,240));
	    northpanel.setSize(4,3);
	    //northpanel.setMinimumSize(new Dimension(480,250));
	    northpanel.setLocation(10, 10);
	    contentPane.add(northpanel, BorderLayout.NORTH);
		
	    JPanel eastpanel = new JPanel();
	    eastpanel.setBackground(new Color(240,240,240));
	    eastpanel.setSize(4,3);
	    //eastpanel.setMinimumSize(new Dimension(480,250));
	    eastpanel.setLocation(10, 10);
	    contentPane.add(eastpanel, BorderLayout.EAST);
		
	    JPanel southpanel = new JPanel();
	    southpanel.setBackground(new Color(240,240,240));
	    southpanel.setSize(4,3);
	    //southpanel.setMinimumSize(new Dimension(480,250));
	    southpanel.setLocation(10, 10);
	    contentPane.add(southpanel, BorderLayout.SOUTH);
	    
	    JPanel westpanel = new JPanel();
	    westpanel.setBackground(new Color(240,240,240));
	    westpanel.setSize(4,3);
	    //westpanel.setMinimumSize(new Dimension(480,250));
	    westpanel.setLocation(10, 10);
	    contentPane.add(westpanel, BorderLayout.WEST);
	    
	    
	    
	    JPanel mainpanel = new JPanel();
	    mainpanel.setLayout(new GridBagLayout());
	    mainpanel.setBackground(new Color(0,255,255));
	    mainpanel.setSize(490,340);
	    mainpanel.setMinimumSize(new Dimension(490,340));
	    mainpanel.setBorder(new CompoundBorder(
				new SoftBevelBorder(SoftBevelBorder.LOWERED),
				new EmptyBorder(1,5,1,5)));
	    mainpanel.setLocation(10, 10);
	    contentPane.add(mainpanel, BorderLayout.CENTER);
	    
//		...............................................

		GridBagConstraints c = new GridBagConstraints();
		//Insets(int top, int left, int bottom, int right)
		
		Insets i = new Insets(5,15,5,10);
		c.gridx = 0;
		c.gridy = 0;
		c.ipadx = 10;
		c.insets = i;
		c.gridwidth = 1;
		c.anchor = GridBagConstraints.FIRST_LINE_START;
		JPanel display = new JPanel();
		display.setLayout(new BoxLayout(display, BoxLayout.X_AXIS));
		
		//Font(String name, int style, int size)
		//This style can be PLAIN, BOLD, ITALIC, or BOLD+ITALIC.
		display.setFont(new Font(Font.SANS_SERIF,1,9));
		display.setBackground(new Color(0,200,200));
		display.setPreferredSize(new Dimension(515,36));
		display.setBorder(new CompoundBorder(
				new SoftBevelBorder(SoftBevelBorder.LOWERED),
				new EmptyBorder(1,5,1,5)));
		mainpanel.add(display, c);
//		...............................................
	    
		Insets i2 = new Insets(5,10,5,10);
		c.gridx = 0;
		c.gridy = 1;
		c.ipadx = 10;
		c.insets = i2;
		c.gridwidth = 1;
		c.anchor = GridBagConstraints.FIRST_LINE_START;
		JPanel calcPane = new JPanel();
		calcPane.setLayout(new GridBagLayout());
		//Font(String name, int style, int size)
		//This style can be PLAIN, BOLD, ITALIC, or BOLD+ITALIC.
		calcPane.setFont(new Font(Font.SANS_SERIF,1,9));
		calcPane.setBackground(new Color(0,200,200));
		calcPane.setSize(new Dimension(400,160));
		calcPane.setBorder(new CompoundBorder(
				new SoftBevelBorder(SoftBevelBorder.RAISED),
				new EmptyBorder(1,5,1,5)));
		mainpanel.add(calcPane,c);
		
//		...................................................	
		
		Insets i21 = new Insets(5,15,5,10);
		c.gridx = 0;
		c.gridy = 0;
		c.ipadx = 10;
		c.insets = i21;
		c.gridwidth = 1;
		c.anchor = GridBagConstraints.FIRST_LINE_START;
		
		JPanel calc1 = new JPanel();
		calc1.setLayout(new BoxLayout(calc1, BoxLayout.X_AXIS));
		//Font(String name, int style, int size)
		//This style can be PLAIN, BOLD, ITALIC, or BOLD+ITALIC.
		calc1.setFont(new Font(Font.SANS_SERIF,1,9));
		calc1.setBackground(new Color(0,200,200));
		calc1.setSize(new Dimension(300,160));
		calc1.setMinimumSize(new Dimension(300,160));
		calcPane.add(calc1, c);
		calcPane.add(Box.createVerticalStrut(10));

//		...................................................	

		Insets i22 = new Insets(5,15,5,10);
		c.gridx = 0;
		c.gridy = 1;
		c.ipadx = 10;
		c.insets = i22;
		c.gridwidth = 1;
		c.anchor = GridBagConstraints.FIRST_LINE_START;
		JPanel calc2 = new JPanel();
		calc2.setLayout(new BoxLayout(calc2, BoxLayout.X_AXIS));
		//Font(String name, int style, int size)
		//This style can be PLAIN, BOLD, ITALIC, or BOLD+ITALIC.
		calc2.setFont(new Font(Font.SANS_SERIF,1,9));
		calc2.setBackground(new Color(0,200,200));
		calc2.setSize(new Dimension(300,160));
		calc2.setMinimumSize(new Dimension(300,160));
		calcPane.add(calc2,c);
		calcPane.add(Box.createVerticalStrut(10));
				
//		...................................................	
	    
		Insets i23 = new Insets(5,15,5,10);
		c.gridx = 0;
		c.gridy = 2;
		c.ipadx = 10;
		c.insets = i23;
		c.gridwidth = 1;
		c.anchor = GridBagConstraints.FIRST_LINE_START;
		JPanel  calc3 = new JPanel();
		calc3.setLayout(new BoxLayout(calc3, BoxLayout.X_AXIS));
		//Font(String name, int style, int size)
		//This style can be PLAIN, BOLD, ITALIC, or BOLD+ITALIC.
		calc3.setFont(new Font(Font.SANS_SERIF,1,9));
		calc3.setBackground(new Color(0,200,200));
		calc3.setSize(new Dimension(300,160));
		calc3.setMinimumSize(new Dimension(300,160));
		calcPane.add(calc3,c);
		calcPane.add(Box.createVerticalStrut(10));
		
//		...................................................	
	    		
		Insets i24 = new Insets(5,15,5,10);
		c.gridx = 0;
		c.gridy = 3;
		c.ipadx = 10;
		c.insets = i24;
		c.gridwidth = 1;
		c.anchor = GridBagConstraints.FIRST_LINE_START;
		JPanel calc4 = new JPanel();
		calc4.setLayout(new BoxLayout(calc4, BoxLayout.X_AXIS));
		//Font(String name, int style, int size)
		//This style can be PLAIN, BOLD, ITALIC, or BOLD+ITALIC.
		calc4.setFont(new Font(Font.SANS_SERIF,1,9));
		calc4.setBackground(new Color(0,200,200));
		calc4.setSize(new Dimension(300,160));
		calc4.setMinimumSize(new Dimension(300,160));
		calcPane.add(calc4,c);
		calcPane.add(Box.createVerticalStrut(10));
		
//		...................................................	
		
		Insets i3 = new Insets(5,30,5,10);
		c.gridx = 0;
		c.gridy = 13;
		c.ipadx = 10;
		c.insets = i3;
		c.gridwidth = 1;
		c.anchor = GridBagConstraints.FIRST_LINE_START;
		JPanel memPane = new JPanel();
		memPane.setLayout(new BoxLayout(memPane, BoxLayout.X_AXIS));
		//Font(String name, int style, int size)
		//This style can be PLAIN, BOLD, ITALIC, or BOLD+ITALIC.
		memPane.setFont(new Font(Font.SANS_SERIF,1,9));
		memPane.setBackground(new Color(0,128,128));
		memPane.setSize(new Dimension(430,50));
		//memPane.setMinimumSize(new Dimension(350,50));
		memPane.setBorder(new CompoundBorder(
				new SoftBevelBorder(SoftBevelBorder.LOWERED),
				new EmptyBorder(1,5,1,5)));
		mainpanel.add(memPane, c);

		
//======================================================================		
//	components	    
//----------------------------------------------------------------------	    
//		components display

		copy = new JButton(new ImageIcon(baseDir + "images" + fileSep + "COPY.gif"));
		copy.setMaximumSize(new Dimension(30, 25));
		copy.setPreferredSize(new Dimension(30, 25));
		copy.setToolTipText(bCopyT);
		display.add(copy);
		display.add(Box.createHorizontalStrut(5));
		copy.setActionCommand("COPY");
		copy.addActionListener(bevn);
		

		paste = new JButton(new ImageIcon(baseDir + "images" + fileSep + "PASTE.gif"));
		paste.setMaximumSize(new Dimension(30, 25));
		paste.setPreferredSize(new Dimension(30, 25));
		paste.setToolTipText(bPasteT);
		display.add(paste);
		display.add(Box.createHorizontalStrut(5));
		paste.setActionCommand("PASTE");
		paste.addActionListener(bevn);
		
		enter = new JTextField("",25);
		enter.setFont(new Font(Font.SANS_SERIF,1,10));
		enter.setMaximumSize(new Dimension(430, 25));
		enter.setPreferredSize(new Dimension(430, 25));
		enter.setBorder(new SoftBevelBorder(SoftBevelBorder.LOWERED));
		enter.setEditable(false);
		enter.setHorizontalAlignment(JTextField.RIGHT);
		display.add(enter);
		display.add(Box.createHorizontalStrut(5));

		JButton bCE = new JButton("CE");
		bCE.setFont(new Font(Font.SANS_SERIF,1,11));
		bCE.setMaximumSize(new Dimension(58, 25));
		bCE.setPreferredSize(new Dimension(58, 25));
		bCE.setMinimumSize(new Dimension(58, 25));
		display.add(bCE);
		display.add(Box.createHorizontalStrut(5));
		bCE.setActionCommand("CE");
		bCE.addActionListener(bevn);
		
		JButton bC = new JButton("C");
		bC.setFont(new Font(Font.SANS_SERIF,1,11));
		bC.setMaximumSize(new Dimension(58, 25));
		bC.setPreferredSize(new Dimension(58, 25));
		bC.setMinimumSize(new Dimension(58, 25));
		display.add(bC);
		display.add(Box.createHorizontalStrut(5));
		bC.setActionCommand("C");
		bC.addActionListener(bevn);
				
//------------------------------------------------------------		
//		Components calcPane
		JButton button7 = new JButton("7");
		button7.setMaximumSize(new Dimension(42, 30));
		button7.setPreferredSize(new Dimension(42, 30));
		button7.setMinimumSize(new Dimension(48, 30));
		calc1.add(button7);
		calc1.add(Box.createHorizontalStrut(5));
		button7.setActionCommand("7");
		button7.addActionListener(bevn);
		
		JButton button8 = new JButton("8");
		button8.setMaximumSize(new Dimension(42, 30));
		button8.setPreferredSize(new Dimension(42, 30));
		button8.setMinimumSize(new Dimension(42, 30));
		calc1.add(button8);
		calc1.add(Box.createHorizontalStrut(5));
		button8.setActionCommand("8");
		button8.addActionListener(bevn);
		
		JButton button9 = new JButton("9");
		button9.setMaximumSize(new Dimension(42, 30));
		button9.setPreferredSize(new Dimension(42, 30));
		button9.setMinimumSize(new Dimension(42, 30));
		calc1.add(button9);
		calc1.add(Box.createHorizontalStrut(45));
		button9.setActionCommand("9");
		button9.addActionListener(bevn);

		JButton buttonDiv = new JButton("∕");
		buttonDiv.setMaximumSize(new Dimension(58, 30));
		buttonDiv.setPreferredSize(new Dimension(58, 30));
		buttonDiv.setMinimumSize(new Dimension(58, 30));
		calc1.add(buttonDiv);
		calc1.add(Box.createHorizontalStrut(5));
		buttonDiv.setActionCommand("DIV");
		buttonDiv.addActionListener(bevn);

		JButton buttonRez = new JButton("1/X");
		buttonRez.setFont(new Font(Font.SANS_SERIF,1,11));
		buttonRez.setMaximumSize(new Dimension(58, 30));
		buttonRez.setPreferredSize(new Dimension(58, 30));
		buttonRez.setMinimumSize(new Dimension(58, 30));
		calc1.add(buttonRez);
		calc1.add(Box.createHorizontalStrut(5));
		buttonRez.setActionCommand("REZ");
		buttonRez.addActionListener(bevn);

		JButton buttonPz = new JButton("%");
		buttonPz.setFont(new Font(Font.SANS_SERIF,1,16));
		buttonPz.setMaximumSize(new Dimension(58, 30));
		buttonPz.setPreferredSize(new Dimension(58, 30));
		buttonPz.setMinimumSize(new Dimension(58, 30));
		calc1.add(buttonPz);
		calc1.add(Box.createHorizontalStrut(5));
		buttonPz.setActionCommand("PZ");
		buttonPz.addActionListener(bevn);

		JButton buttonSin = new JButton("sin");
		buttonSin.setMaximumSize(new Dimension(58, 30));
		buttonSin.setPreferredSize(new Dimension(58, 30));
		buttonSin.setMinimumSize(new Dimension(58, 30));
		calc1.add(buttonSin);
		calc1.add(Box.createHorizontalStrut(5));
		buttonSin.setActionCommand("SIN");
		buttonSin.addActionListener(bevn);
				
		JButton buttonM = new JButton("M");
		buttonM.setMaximumSize(new Dimension(58, 30));
		buttonM.setPreferredSize(new Dimension(58, 30));
		buttonM.setMinimumSize(new Dimension(58, 30));
		calc1.add(buttonM);
		calc1.add(Box.createHorizontalStrut(5));
		buttonM.setActionCommand("M");
		buttonM.addActionListener(bevn);
		
		
		

//		...................................................		
		
		JButton button4 = new JButton("4");
		button4.setMaximumSize(new Dimension(42, 30));
		button4.setPreferredSize(new Dimension(42, 30));
		button4.setMinimumSize(new Dimension(42, 30));
		calc2.add(button4);
		calc2.add(Box.createHorizontalStrut(5));
		button4.setActionCommand("4");
		button4.addActionListener(bevn);
		
		JButton button5 = new JButton("5");
		button5.setMaximumSize(new Dimension(42, 30));
		button5.setPreferredSize(new Dimension(42, 30));
		button5.setMinimumSize(new Dimension(42, 30));
		calc2.add(button5);
		calc2.add(Box.createHorizontalStrut(5));
		button5.setActionCommand("5");
		button5.addActionListener(bevn);

		JButton button6 = new JButton("6");
		button6.setMaximumSize(new Dimension(42, 30));
		button6.setPreferredSize(new Dimension(42, 30));
		button6.setMinimumSize(new Dimension(42, 30));
		calc2.add(button6);
		calc2.add(Box.createHorizontalStrut(45));
		button6.setActionCommand("6");
		button6.addActionListener(bevn);

		JButton buttonMul = new JButton("x");
		buttonMul.setMaximumSize(new Dimension(58, 30));
		buttonMul.setPreferredSize(new Dimension(58, 30));
		buttonMul.setMinimumSize(new Dimension(58, 30));
		calc2.add(buttonMul);
		calc2.add(Box.createHorizontalStrut(5));
		buttonMul.setActionCommand("MUL");
		buttonMul.addActionListener(bevn);

		JButton buttonExp2 = new JButton("X² ");
		buttonExp2.setMaximumSize(new Dimension(58, 30));
		buttonExp2.setPreferredSize(new Dimension(58, 30));
		buttonExp2.setMinimumSize(new Dimension(58, 30));
		calc2.add(buttonExp2);
		calc2.add(Box.createHorizontalStrut(5));
		buttonExp2.setActionCommand("EXP2");
		buttonExp2.addActionListener(bevn);

		JButton buttonExY = new JButton("X^y");
		buttonExY.setFont(new Font(Font.SANS_SERIF,1,11));
		buttonExY.setMaximumSize(new Dimension(58, 30));
		buttonExY.setPreferredSize(new Dimension(58, 30));
		buttonExY.setMinimumSize(new Dimension(58, 30));
		calc2.add(buttonExY);
		calc2.add(Box.createHorizontalStrut(5));
		buttonExY.setActionCommand("XhY");
		buttonExY.addActionListener(bevn);

		JButton buttonCos = new JButton("cos");
		buttonCos.setFont(new Font(Font.SANS_SERIF,1,11));
		buttonCos.setMaximumSize(new Dimension(58, 30));
		buttonCos.setPreferredSize(new Dimension(58, 30));
		buttonCos.setMinimumSize(new Dimension(58, 30));
		calc2.add(buttonCos);
		calc2.add(Box.createHorizontalStrut(5));
		buttonCos.setActionCommand("COS");
		buttonCos.addActionListener(bevn);
		
		JButton buttonMplus = new JButton("M+");
		buttonMplus.setFont(new Font(Font.SANS_SERIF,1,11));
		buttonMplus.setMaximumSize(new Dimension(58, 30));
		buttonMplus.setPreferredSize(new Dimension(58, 30));
		buttonMplus.setMinimumSize(new Dimension(58, 30));
		calc2.add(buttonMplus);
		calc2.add(Box.createHorizontalStrut(5));
		buttonMplus.setActionCommand("MPLUS");
		buttonMplus.addActionListener(bevn);

		
//		...................................................		
		
		JButton button1 = new JButton("1");
		button1.setMaximumSize(new Dimension(42, 30));
		button1.setPreferredSize(new Dimension(42, 30));
		button1.setMinimumSize(new Dimension(42, 30));
		calc3.add(button1);
		calc3.add(Box.createHorizontalStrut(5));
		button1.setActionCommand("1");
		button1.addActionListener(bevn);
		
		JButton button2 = new JButton("2");
		button2.setMaximumSize(new Dimension(42, 30));
		button2.setPreferredSize(new Dimension(42, 30));
		button2.setMinimumSize(new Dimension(42, 30));
		calc3.add(button2);
		calc3.add(Box.createHorizontalStrut(5));
		button2.setActionCommand("2");
		button2.addActionListener(bevn);
		
		JButton button3 = new JButton("3");
		button3.setMaximumSize(new Dimension(42, 30));
		button3.setPreferredSize(new Dimension(42, 30));
		button3.setMinimumSize(new Dimension(42, 30));
		calc3.add(button3);
		calc3.add(Box.createHorizontalStrut(45));
		button3.setActionCommand("3");
		button3.addActionListener(bevn);

		JButton buttonMin = new JButton("—");
		buttonMin.setFont(new Font(Font.SANS_SERIF,1,14));
		buttonMin.setMaximumSize(new Dimension(58, 30));
		buttonMin.setPreferredSize(new Dimension(58, 30));
		buttonMin.setMinimumSize(new Dimension(58, 30));
		calc3.add(buttonMin);
		calc3.add(Box.createHorizontalStrut(5));
		buttonMin.setActionCommand("MIN");
		buttonMin.addActionListener(bevn);

		JButton buttonSqrt = new JButton("√ ");
		buttonSqrt.setMaximumSize(new Dimension(58, 30));
		buttonSqrt.setPreferredSize(new Dimension(58, 30));
		buttonSqrt.setMinimumSize(new Dimension(58, 30));
		calc3.add(buttonSqrt);
		calc3.add(Box.createHorizontalStrut(5));
		buttonSqrt.setActionCommand("SQRT");
		buttonSqrt.addActionListener(bevn);
		
		JButton buttonSqY = new JButton("y√");
		buttonSqY.setMaximumSize(new Dimension(58, 30));
		buttonSqY.setPreferredSize(new Dimension(58, 30));
		buttonSqY.setMinimumSize(new Dimension(58, 30));
		calc3.add(buttonSqY);
		calc3.add(Box.createHorizontalStrut(5));
		buttonSqY.setActionCommand("SQY");
		buttonSqY.addActionListener(bevn);

		JButton buttonTan = new JButton("tan");
		buttonTan.setFont(new Font(Font.SANS_SERIF,1,11));
		buttonTan.setMaximumSize(new Dimension(58, 30));
		buttonTan.setPreferredSize(new Dimension(58, 30));
		buttonTan.setMinimumSize(new Dimension(58, 30));
		calc3.add(buttonTan);
		calc3.add(Box.createHorizontalStrut(5));
		buttonTan.setActionCommand("TAN");
		buttonTan.addActionListener(bevn);

		JButton buttonMmin = new JButton("M -");
		buttonMmin.setFont(new Font(Font.SANS_SERIF,1,11));
		buttonMmin.setMaximumSize(new Dimension(58, 30));
		buttonMmin.setPreferredSize(new Dimension(58, 30));
		buttonMmin.setMinimumSize(new Dimension(58, 30));
		calc3.add(buttonMmin);
		calc3.add(Box.createHorizontalStrut(5));
		buttonMmin.setActionCommand("MMIN");
		buttonMmin.addActionListener(bevn);

//		...................................................		
		

		JButton button0 = new JButton("0");
		button0.setMaximumSize(new Dimension(42, 30));
		button0.setPreferredSize(new Dimension(42, 30));
		button0.setMinimumSize(new Dimension(42, 30));
		calc4.add(button0);
		calc4.add(Box.createHorizontalStrut(5));
		button0.setActionCommand("0");
		button0.addActionListener(bevn);

		JButton buttonKom = new JButton(",");
		buttonKom.setMaximumSize(new Dimension(42, 30));
		buttonKom.setPreferredSize(new Dimension(42, 30));
		buttonKom.setMinimumSize(new Dimension(42, 30));
		calc4.add(buttonKom);
		calc4.add(Box.createHorizontalStrut(5));
		buttonKom.setActionCommand("KOM");
		buttonKom.addActionListener(bevn);

		JButton buttonGl = new JButton("=");
		buttonGl.setFont(new Font(Font.SANS_SERIF,1,20));
		buttonGl.setMaximumSize(new Dimension(80, 30));
		buttonGl.setPreferredSize(new Dimension(80, 30));
		buttonGl.setMinimumSize(new Dimension(80, 30));
		calc4.add(buttonGl);
		calc4.add(Box.createHorizontalStrut(7));
		buttonGl.setActionCommand("GL");
		buttonGl.addActionListener(bevn);

		JButton buttonPlus = new JButton("+");
		buttonPlus.setFont(new Font(Font.SANS_SERIF,1,16));
		buttonPlus.setMaximumSize(new Dimension(58, 30));
		buttonPlus.setPreferredSize(new Dimension(58, 30));
		buttonPlus.setMinimumSize(new Dimension(58, 30));
		calc4.add(buttonPlus);
		calc4.add(Box.createHorizontalStrut(5));
		buttonPlus.setActionCommand("PLUS");
		buttonPlus.addActionListener(bevn);

		JButton buttonKr = new JButton("+/-");
		buttonKr.setFont(new Font(Font.SANS_SERIF,1,14));
		buttonKr.setMaximumSize(new Dimension(58, 30));
		buttonKr.setPreferredSize(new Dimension(58, 30));
		buttonKr.setMinimumSize(new Dimension(58, 30));
		calc4.add(buttonKr);
		calc4.add(Box.createHorizontalStrut(5));
		buttonKr.setActionCommand("KR");
		buttonKr.addActionListener(bevn);

		JButton buttonPi = new JButton("Pi");
		buttonPi.setMaximumSize(new Dimension(58, 30));
		buttonPi.setPreferredSize(new Dimension(58, 30));
		buttonPi.setMinimumSize(new Dimension(58, 30));
		calc4.add(buttonPi);
		calc4.add(Box.createHorizontalStrut(5));
		buttonPi.setActionCommand("PI");
		buttonPi.addActionListener(bevn);
		
		JButton buttonCot = new JButton("cot");
		buttonCot.setFont(new Font(Font.SANS_SERIF,1,11));
		buttonCot.setMaximumSize(new Dimension(58, 30));
		buttonCot.setPreferredSize(new Dimension(58, 30));
		buttonCot.setMinimumSize(new Dimension(58, 30));
		calc4.add(buttonCot);
		calc4.add(Box.createHorizontalStrut(5));
		buttonCot.setActionCommand("COT");
		buttonCot.addActionListener(bevn);

		JButton buttonMR = new JButton("MR");
		buttonMR.setFont(new Font(Font.SANS_SERIF,1,11));
		buttonMR.setMaximumSize(new Dimension(58, 30));
		buttonMR.setPreferredSize(new Dimension(58, 30));
		buttonMR.setMinimumSize(new Dimension(58, 30));
		calc4.add(buttonMR);
		calc4.add(Box.createHorizontalStrut(5));
		buttonMR.setActionCommand("MR");
		buttonMR.addActionListener(bevn);

		
//		------------------------------------------------------------		
//		components memPane

		m = new JLabel(lMem);
		m.setFont(new Font(Font.SANS_SERIF,1,11));
		memPane.add(m);
		memPane.add(Box.createHorizontalStrut(5));
		
		memory = new JTextField("",20);
		memory.setFont(new Font(Font.SANS_SERIF,1,11));
		memory.setHorizontalAlignment(JTextField.RIGHT);
		memory.setSize(250, 25);
		memory.setBorder(new SoftBevelBorder(SoftBevelBorder.LOWERED));
		memory.setEditable(false);
		memPane.add(Box.createHorizontalGlue());
		memPane.add(memory);
		memPane.add(Box.createHorizontalStrut(5));
		
		JButton buttonMC = new JButton("MC");
		buttonMC.setFont(new Font(Font.SANS_SERIF,1,11));
		buttonMC.setMaximumSize(new Dimension(58, 25));
		buttonMC.setPreferredSize(new Dimension(58, 25));
		buttonMC.setMinimumSize(new Dimension(58, 25));
		memPane.add(buttonMC);
		memPane.add(Box.createHorizontalStrut(10));
		buttonMC.setActionCommand("MC");
		buttonMC.addActionListener(bevn);

		
		
		
		
		
//================================================================
//		frame		
      	cal.pack();
	    cal.setVisible(true);

	    
	}
//	end of createAnShowCalc	

	
	
//	================================================================	
//---------------------------------------------------------------------	
//	methods
	

	/**
 * Sets the enter.
 *
 * @param cEnter the new enter
 */
public void setEnter(String cEnter){
		StringToNumber strn = new StringToNumber();
		enter.setText(Double.toString(strn.strToDbl(cEnter)));
	}

	/**
	 * Gets the enter.
	 *
	 * @return the enter
	 */
	public String getEnter(){
		String cEnter = enter.getText();
		return cEnter;
	
	}
	
			/**
			 * Exit program.
			 */
			//Programm beenden , exit program
	public void exitProgram(){
				setVisible(false);
				dispose();
				System.exit(0);
	}

			//Sprachen, languages
			/**
			 * Lang DE.
			 */
			//Deutsch , German
	public void langDE(){
				setLanguages("DE");
				writeLg(fName, "DE");
	}
			
			/**
			 * Lang EN.
			 */
			//Englisch, English
	public void langEN(){
				setLanguages("EN");
				writeLg(fName, "EN");
				
	}			
	
			/**
			 * Lang FR.
			 */
			//Französisch, French
	public void langFR(){			
				setLanguages("FR");
				writeLg(fName, "FR");
				
	}			
	
			/**
			 * Lang FI.
			 */
			//Finnisch, Finnish
	public void langFI(){			
				setLanguages("FI");
				writeLg(fName, "FI");
				
	}			
	
	
			/**
			 * Lang DA.
			 */
			//Dänisch, Danish
	public void langDA(){			
			setLanguages("DA");
			writeLg(fName, "DA");
		
	}			
	
			/**
			 * Lang NL.
			 */
			//Niederländisch, Dutch
	public void langNL(){			
			setLanguages("NL");
			writeLg(fName, "NL");
		
	}			
	
			/**
			 * Lang HR.
			 */
			//Kroatisch, Kroatish
	public void langHR(){			
			setLanguages("HR");
			writeLg(fName, "HR");
		
	}			
			
			/**
			 * Lang ES.
			 */
			//Spanisch, Spanish
	public void langES(){	
				setLanguages("ES");
				writeLg(fName, "ES");
	}			
			
			/**
			 * Lang IT.
			 */
			//Italienisch, Italian
	public void langIT(){	
				setLanguages("IT");
				writeLg(fName, "IT");
	}			
		
	/**
	 * Lang HU.
	 */
	//Italienisch, Italian
	public void langHU(){	
				setLanguages("HU");
				writeLg(fName, "HU");
	}			
		
		
//.........................................................		

			/**
 * Clear enter.
 */
//	 clear enter
	public void clearEnter(){
				enter.setText("");
				km = false;
	}
			

				/**
				 * Clear complete.
				 */
				// clear complete
	public void clearComplete(){
				enter.setForeground(Color.BLACK);
				enter.setText("");
				nM1 = 0;
				nM2 = 0;
				nM3 = 0;
				nM4 = 0;
				km = false;
				inp = true;
				number1_set = false;
				number2_set = false;
				err_set = false;
				n3 = false;
				op = ' ';
				res = 0.0;

	}

	/**
	 * Sets the number.
	 *
	 * @param number the new number
	 */
	public void setNumber(String number){
			
				if (!n3) enter.setText("");
				if (inp) {setDisplay(number);
								n3 = true;
								km = false;
				}
				
	}


				// division, reziprog, multiplication
				// potency square, subtraction, sqrt, square-be rooted
				// addition, reziprog, X^y, y sqrt X, cos, sin, 
				/**
				 * Sets the operator.
				 *
				 * @param op the new operator
				 */
				// tan, cot, %
	public void setOperator(char op){
				n3 = false;
				
				setComp(op);
	}
	
				// 	M diplay to memory, M diplay to memory plus
				//	M diplay to memory subtraction
				/**
				 * Sets the mem.
				 *
				 * @param op the new mem
				 */
				//	 MR memory to display, memory clear
	public void setMem(char op){
				computingM(op);
	}


	/**
	 * Sets the kom.
	 */
	public void setKom(){
				if (!n3) enter.setText("");
				if (!km){
				setDisplay(".");
				n3 = true;
				}
				km = true;
	}
			
	/**
	 * Sets the gl.
	 */
	public void setGl(){
			
				// = result
				if (number1_set | number2_set){
					setComp('=');
				}

				
	}
	

/**
 * Sets the languages.
 *
 * @param lingo the new languages
 */
//---------------------------------------------------------------------
	public static void setLanguages(String lingo){
		
		
		CalcLingo clg = new CalcLingo();
		mLingo = clg.getLingo(lingo);
		
		mProgram = mLingo[0];
		menu1.setText(mLingo[0]);
		
		mExit = mLingo[1];
		item11.setText(mLingo[1]);
		
		mLanguages = mLingo[2];
		menu2.setText(mLingo[2]);
		
		mGerman = mLingo[3];
		item21.setText(mLingo[3]);
		
		mEnglish = mLingo[4];
		item22.setText(mLingo[4]);
		
		mFrench = mLingo[5];
		item23.setText(mLingo[5]);
		
		mFinnish = mLingo[21];
		item24.setText(mLingo[21]);
		
		mDanish = mLingo[22];
		item25.setText(mLingo[22]);
		
		mDutch = mLingo[23];
		item26.setText(mLingo[23]);
		
		mCroatian = mLingo[24];
		item27.setText(mLingo[24]);
		
		mSpanish = mLingo[6];
		item28.setText(mLingo[6]);
		
		mItalian = mLingo[7];
		item29.setText(mLingo[7]);
		
		mHungarian = mLingo[25];
		item30.setText(mLingo[25]);
		
		mInfo = mLingo[8];
		menu3.setText(mLingo[8]);
		
		mInformation = mLingo[9];
		item31.setText(mLingo[9]);
		
		bCopyT = mLingo[10];
		copy.setToolTipText(mLingo[10]);
		
		lMem = mLingo[11];
		m.setText(mLingo[11]);
		
		in1 = mLingo[12];
		in2 = mLingo[13];
		in3 = mLingo[14];
		in4 = mLingo[15];
		in5 = mLingo[16];
		in6 = mLingo[17];
		err1 = mLingo[18];
		err2 = mLingo[19];
		
		
		bPasteT = mLingo[20];
		paste.setToolTipText(mLingo[20]);


	}

/**
 * Start languages.
 *
 * @param lingo the lingo
 */
//	---------------------------------------------------------------------
	public static void startLanguages(String lingo){
		
		
		CalcLingo clg = new CalcLingo();
		mLingo = clg.getLingo(lingo);
		
		mProgram = mLingo[0];
		mExit = mLingo[1];
		mLanguages = mLingo[2];
		mGerman = mLingo[3];
		mEnglish = mLingo[4];
		mFrench = mLingo[5];
		mFinnish = mLingo[21];
		mDanish = mLingo[22];
		mDutch = mLingo[23];
		mCroatian = mLingo[24];
		mSpanish = mLingo[6];
		mItalian = mLingo[7];
		mHungarian = mLingo[25];
		mInfo = mLingo[8];
		mInformation = mLingo[9];
		bCopyT = mLingo[10];
		lMem = mLingo[11];
		in1 = mLingo[12];
		in2 = mLingo[13];
		in3 = mLingo[14];
		in4 = mLingo[15];
		in5 = mLingo[16];
		in6 = mLingo[17];
		err1 = mLingo[18];
		err2 = mLingo[19];
		bPasteT = mLingo[20];
		

		
	}

/**
 * Read lg.
 *
 * @param fName the f name
 * @return the string
 */
//	---------------------------------------------------------------------	
	public static String readLg(String fName){
		String gText = "";
		try{
			File datei = new File(baseData + fName);
			
			int gelesen;
			boolean ende = false;
			
			FileReader enterstream = new FileReader(datei);
			
			StringBuilder text = new StringBuilder(10);
			
			while(!ende){
				gelesen = enterstream.read();
				
				if(gelesen == -1)
					ende = true;
				else
					text.append((char)gelesen);
				
			}
			
			gText = text.toString();
			
			enterstream.close();
		}
		catch(Exception e){
			
		}
		return gText;
	
		
	}

/**
 * Write lg.
 *
 * @param fName the f name
 * @param cLg the c lg
 */
//	---------------------------------------------------------------------		
	public void writeLg(String fName, String cLg){
		File datei = new File(baseData + fName);
		try {
			FileWriter enterstream = new FileWriter(datei);
			enterstream.write(cLg);
			enterstream.close();
		}catch(Exception e) {
			
		}
		
	}
	

/**
 * Information.
 */
//	---------------------------------------------------------------------	
	public void information(){
		
		Icon ic = new ImageIcon(baseDir + "images/Calculator.gif");
		JOptionPane.showMessageDialog(new Calculator(""),
				in1+" \n"+
				" \n"+
				in2+" \n"+
				in3+" \n"+
				in4+" \n"+
				"\n"+
				in5+"  \nFreeware.",
				in6,JOptionPane.INFORMATION_MESSAGE,
				ic);
	
		
	}	
	
//=================================================================
//		Calculate
/**
 * Sets the display.
 *
 * @param bt the new display
 */
//	-----------------------------------------------------------------
	public void setDisplay(String bt){
		if (!err_set){
			String tempStr;
			tempStr = enter.getText();
			enter.setText(tempStr+bt);
		}	
	}

/**
 * Sets the comp.
 *
 * @param opr the new comp
 */
//	-----------------------------------------------------------------	
	public void setComp(char opr){
		if (!enter.getText().equals("")) {
			if (!number1_set){
				try {
					nM1 = Double.valueOf( enter.getText()).doubleValue();
					
				}
				catch(Exception e)
				{	
					setErr(2);
					err_set = true;}
			}
			
			if (number1_set) number2_set = true;
			if (!number2_set) number1_set = true;
			
			
		}
		if (!number2_set & number1_set) op = opr ;
		
		if (number1_set & !number2_set & ((opr == 'z') // reziprog
										| (opr == 'w') // +/-
										| (opr == 'x') // Exp2
										| (opr == 'q') // sqrt
										| (opr == 'C') // cos
										| (opr == 'I') // sin
										| (opr == 'T') // tan
										| (opr == 'o') )) // cot
			{
			if (!err_set){
				computing();
				number1_set = false;
				number2_set = false;
			}
		}
		

						
		if (number2_set & number1_set){
			if (!err_set){
				computing();
				op = opr ;
			
				if (opr == '=') {	// = result
					if (!err_set) enter.setText(Double.toString(res));
					nM1 = 0;
					nM2 = 0;
					number1_set = false;
					number2_set = false;
					n3 = false;
					
				}
			}
		}
		
	}

/**
 * Computing.
 */
//----------------------------------------------------------------------	
	public void computing(){
		
		
		if (number2_set) 
			
			try {
				nM2 = Double.valueOf( enter.getText()).doubleValue();
			}
			catch (Exception e){
				
				setErr(2);
				err_set = true;}
			
		switch(op){
		
			case ('/') : 	// division
				
				if (nM2 == 0){
					
					setErr(1);
					err_set = true;
					
					break;
				}
				if (nM2 != 0){
					
					res = nM1 / nM2;
					enter.setText(Double.toString(res));
					number2_set = true;
				}
				break;
			
			case ('z') :	// reziprog
				try {
						if (!enter.getText().equals("")){
							nM1 = Double.valueOf( enter.getText()).doubleValue();
							res = 1 / nM1;
							enter.setText(Double.toString(res));
							number2_set = true;
						}
				}
				catch (Exception e){
					setErr(2);
					err_set = true;
				}
				break;
				
			case ('*') :	// multiplication
				
				try {
					res = nM1 * nM2;
					enter.setText(Double.toString(res));
					number2_set = true;
					nM1 = res;
				}
				catch (Exception e){
					setErr(2);
					err_set = true;}
				break;
				
			case ('x') :	// x^2
				
				try {
					if (!enter.getText().equals("")){
						nM1 = Double.valueOf( enter.getText()).doubleValue();
					try {
						res = Math.pow(nM1, 2);
						enter.setText(Double.toString(res));
						number2_set = true;
					}
					catch (Exception e) { 
						setErr(2);
						err_set = true;}
					
					}
				}
				catch (Exception e) {
					setErr(2);
					err_set = true;
				}
				break;
				
			case ('-') :	// minus
				try {
					res = nM1 - nM2;
					enter.setText(Double.toString(res));
					number2_set = true;
				}
				catch (Exception e){
					setErr(2);
					err_set = true;
				}
				break;
				
			case ('q') :	// sqrt, square-be rooted
				try {
					if (!enter.getText().equals("")){
						nM1 = Double.valueOf( enter.getText()).doubleValue();
						res = Math.sqrt(nM1);
						enter.setText(Double.toString(res));
						number2_set = true;
					}
				}
				catch (Exception e){
					setErr(2);
					err_set = true;
				}
				break;
				
			case ('+') :	// plus addition
				try {
					res = nM1 + nM2;
					enter.setText(Double.toString(res));
					number2_set = true;
					nM1 = res;
				}
				catch (Exception e){
					setErr(2);
					err_set = true;
				}
					break;
				
			case ('w') :	// +/-  
				try {
					if (!enter.getText().equals("")){
						nM1 = Double.valueOf( enter.getText()).doubleValue();
						res = nM1 -(nM1 * 2);
						enter.setText(Double.toString(res));
						number2_set = true;
					}
				}
				catch (Exception e){
					setErr(2);
					err_set = true;
				}
				break;
				
				case ('H') :	// X^y  
					try {
						if (!enter.getText().equals("")){
							nM2 = Double.valueOf( enter.getText()).doubleValue();
							res = Math.pow(nM1, nM2);
							enter.setText(Double.toString(res));
							number2_set = true;
						}
					}
					catch (Exception e){
						setErr(2);
						err_set = true;
					}
					break;			
					
				case ('Q') :	// y sqrt X  
					try {
						if (!enter.getText().equals("")){
							nM2 = Double.valueOf( enter.getText()).doubleValue();
							res = Math.pow(nM1, 1/nM2);
							enter.setText(Double.toString(res));
							number2_set = true;
						}
					}
					catch (Exception e){
						setErr(2);
						err_set = true;
					}
					break;		
					
				case ('Z') :	// % 
					try {
						if (!enter.getText().equals("")){
							nM2 = Double.valueOf( enter.getText()).doubleValue();
							res = nM1*nM2/100;
							enter.setText(Double.toString(res));
							number2_set = true;
						}
					}
					catch (Exception e){
						setErr(2);
						err_set = true;
					}
					break;		
					
				case ('I') :	// sin 
					try {
						if (!enter.getText().equals("")){
							nM2 = Double.valueOf( enter.getText()).doubleValue();
							double n1 = 0;

							if (nM2 <= 90) n1 = nM2; // 0 ... 90°
							if (nM2 <=180 & nM2 > 90) n1 = 180 - nM2; //> 90° ... 180°
							if (nM2 > 180 & nM2 <=270)n1 = -(nM2 - 180); // > 180° ... 270°
							if (nM2 > 270 & nM2 <= 360) n1 = -(360 - nM2); // 270° ... 360°

							res = Math.sin(Math.toRadians(n1));
							enter.setText(Double.toString(res));
							number2_set = true;
						}
					}
					catch (Exception e){
						setErr(2);
						err_set = true;
					}
					break;
					
				case ('C') :	// cos
					try {
						if (!enter.getText().equals("")){
							nM2 = Double.valueOf( enter.getText()).doubleValue();
							nM2 = nM2 + 90;
							if (nM2 > 360) nM2 = nM2 - 360;
							double n1 = 0;
							if (nM2 <= 90) n1 = nM2; // 0 ... 90°
							if (nM2 <=180 & nM2 > 90) n1 = 180 - nM2; //> 90° ... 180°
							if (nM2 > 180 & nM2 <=270)n1 = -(nM2 - 180); // > 180° ... 270°
							if (nM2 > 270 & nM2 <= 360) n1 = -(360 - nM2); // 270° ... 360°
							
							res = Math.sin(Math.toRadians(n1));
							enter.setText(Double.toString(res));
							number2_set = true;
						}
					}
					catch (Exception e){
						setErr(2);
						err_set = true;
					}
					break;
					
				case ('T') :	// tan
					try {
						if (!enter.getText().equals("")){
							nM2 = Double.valueOf( enter.getText()).doubleValue();
							
							double n1 = 0;
							double resSin = 0;
							double resCos = 0;
							//------- sin
							if (nM2 <= 90) n1 = nM2; // 0 ... 90°
							if (nM2 <=180 & nM2 > 90) n1 = 180 - nM2; //> 90° ... 180°
							if (nM2 > 180 & nM2 <=270)n1 = -(nM2 - 180); // > 180° ... 270°
							if (nM2 > 270 & nM2 <= 360) n1 = -(360 - nM2); // 270° ... 360°

							resSin = Math.sin(Math.toRadians(n1));
							
							//------- cos
							nM2 = nM2 + 90;
							if (nM2 > 360) nM2 = nM2 - 360;
							n1 = 0;
							if (nM2 <= 90) n1 = nM2; // 0 ... 90°
							if (nM2 <=180 & nM2 > 90) n1 = 180 - nM2; //> 90° ... 180°
							if (nM2 > 180 & nM2 <=270)n1 = -(nM2 - 180); // > 180° ... 270°
							if (nM2 > 270 & nM2 <= 360) n1 = -(360 - nM2); // 270° ... 360°
							
							resCos = Math.sin(Math.toRadians(n1));
							
							//--------- tan
							
							res = resSin / resCos;
							//res = Math.tan(Math.toRadians(n1));
							enter.setText(Double.toString(res));
							number2_set = true;
						}
					}
					catch (Exception e){
						setErr(2);
						err_set = true;
					}
					break;
					
				case ('o') :	// cotan
					try {
						if (!enter.getText().equals("")){
							nM2 = Double.valueOf( enter.getText()).doubleValue();
							
							double n1 = 0;
							double resSin = 0;
							double resCos = 0;
							//------- sin
							if (nM2 <= 90) n1 = nM2; // 0 ... 90°
							if (nM2 <=180 & nM2 > 90) n1 = 180 - nM2; //> 90° ... 180°
							if (nM2 > 180 & nM2 <=270)n1 = -(nM2 - 180); // > 180° ... 270°
							if (nM2 > 270 & nM2 <= 360) n1 = -(360 - nM2); // 270° ... 360°

							resSin = Math.sin(Math.toRadians(n1));
							
							//------- cos
							nM2 = nM2 + 90;
							if (nM2 > 360) nM2 = nM2 - 360;
							n1 = 0;
							if (nM2 <= 90) n1 = nM2; // 0 ... 90°
							if (nM2 <=180 & nM2 > 90) n1 = 180 - nM2; //> 90° ... 180°
							if (nM2 > 180 & nM2 <=270)n1 = -(nM2 - 180); // > 180° ... 270°
							if (nM2 > 270 & nM2 <= 360) n1 = -(360 - nM2); // 270° ... 360°
							
							resCos = Math.sin(Math.toRadians(n1));
							
							//--------- tan
							
							res = resCos / resSin;
							//res = Math.tan(Math.toRadians(n1));
							enter.setText(Double.toString(res));
							number2_set = true;
						}
					}
					catch (Exception e){
						setErr(2);
						err_set = true;
					}
					break;
					
					
					
		}
		
			if (enter.getText().equals("Infinity")){
				setErr(2);
			}

	}
	
/**
 * Sets the pi.
 */
//	----------------------------------------------------------------------	
	public void setPi(){
		if (!err_set){
			enter.setText(Double.toString(Math.PI));
		}		
	}

/**
 * Computing M.
 *
 * @param opr the opr
 */
//	----------------------------------------------------------------------	
	public void computingM(char opr){
		if (!err_set){
		
		switch(opr){
		
		case ('m') : 	// M , display to memory
			try {
				if (!enter.getText().equals("")){
					nM3 = Double.valueOf( enter.getText()).doubleValue();
					nM4 = nM3;
					memory.setText(Double.toString(nM3));
					n3 = false;
				}
			}
			catch (Exception e){
				setErr(2);
				err_set = true;
			}
			break;
			
		case ('n') :	// M- , memory subtraction
			try {
				if (!enter.getText().equals("")){
					nM3 = Double.valueOf( enter.getText()).doubleValue();
					nM4 = nM4 - nM3;
					memory.setText(Double.toString(nM4));
					n3 = false;
				}
			}
			catch (Exception e){
				setErr(2);
				err_set = true;
			}
			break;
			
		case ('p') :	// M+ memory addition
			try {
				if (!enter.getText().equals("")){
					nM3 = Double.valueOf( enter.getText()).doubleValue();
					nM4 = nM4 + nM3;
					memory.setText(Double.toString(nM4));
					n3 = false;
				}
			}
			catch (Exception e){
				setErr(2);
				err_set = true;
			}
			break;
			
		case ('r') :	// MR	memory to display
			try {
				if (!memory.getText().equals("")){
					nM3 = Double.valueOf( memory.getText()).doubleValue();
					nM4 = nM3;
					enter.setText(Double.toString(nM3));
					n3 = false;
				}
			}
			catch (Exception e){
				setErr(2);
				err_set = true;
			}
				break;
			
		
			
		case ('d') :	// MC  	memory clear
			
			memory.setText("");
			nM3 = 0;
			nM4 = 0;
			break;
									
		}
		}
	}

/**
 * Sets the err.
 *
 * @param nErr the new err
 */
//	-----------------------------------------------------------------	
	public void setErr(int nErr){
		
		switch(nErr) {
		
			case(1) :
				
				enter.setForeground(Color.RED);
				enter.setText(err1);
				nM1 = 0;
				nM2 = 0;
				number1_set = false;
				number2_set = false;
				n3 = false;
				err_set = true;
				break;
				
			case(2) :
				
				enter.setForeground(Color.RED);
				enter.setText(err2);
				nM1 = 0;
				nM2 = 0;
				number1_set = false;
				number2_set = false;
				n3 = false;
				err_set = true;
				break;
		
		
		
		}
	}
	
//=================================================================
//		main	
/**
 * The main method.
 *
 * @param args the arguments
 */
//-----------------------------------------------------------------	
	public static void main(String[] args) {
	    //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
 
        		mLG = readLg(fName);
        		startLanguages(mLG);  
            	createAndShowCalc();
 

             }
        });
 
	}
//------------------------------------------------------------------
//	end of class	
}
