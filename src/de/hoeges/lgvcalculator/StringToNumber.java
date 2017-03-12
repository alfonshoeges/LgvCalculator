	/**
	 * new progam for stock management
	 * Lagerverwaltung30
	 * LgvCalculator
	 * class StringToNumber
	 * created by Hans-Dieter Hoeges
	 * Eclipse, UTF8
	 * editing 24.03.2013
	 */

package de.hoeges.lgvcalculator;


public class StringToNumber {

	private double nStrDbl = 0;
	private int nStrInt = 0;

	
	public StringToNumber (){
		super();
	}
	
	public double strToDbl (String cStr){

		nStrDbl = Double.valueOf(checkStr(cStr,'d')).doubleValue();
		return nStrDbl;
		
	}
	
	public int strToInt (String cStr){
	
		//nStrInt = Integer.parseInt(checkStr(cStr));
		nStrInt = Integer.valueOf(checkStr(cStr,'i')).intValue();
		return nStrInt;
		
	}
	
	
	private String checkStr(String enterCHK, char c){
		String tempStr = null;
		if (c == 'd') tempStr = enterCHK.replace(',', '.');
		if (c == 'i') tempStr = enterCHK.replace(',', ' ');
		if (c == 'i') tempStr = enterCHK.replace('.', ' ');
		String cStr = "";
		StringBuilder txt = new StringBuilder();
		StringBuilder txt2 = new StringBuilder();
		
		char e = ' ';
		int s = 0;
		int p = 0;
		int k = 0;
		int i = 0;
		
		for ( i=0;i < tempStr.length();++i)
		{
			e = tempStr.charAt(i);
			
			if ((e == '.') & (s == 0)){
				txt.append(tempStr.substring(k, i));
				++s;
				k = i;
			}
			
			if ((e == '.') & (i > k )){
				txt.append(tempStr.substring(k+1, i));
				++s;
				k = i;
			}
		}
		
		txt.append(tempStr.substring(k, i));

		s = 0;
		
		k = 0;
		
		tempStr = txt.toString();

		
		for (i=0;i < tempStr.length();++i)
		{
			e = tempStr.charAt(i);
			switch (e) {
			case '0':
				s = 1;
				p = 1;
				break;
			case '1':
				s = 1;
				p = 1;
				break;
			case '2':
				s = 1;
				p = 1;
				break;
			case '3':
				s = 1;
				p = 1;
				break;
			case '4':
				s = 1;
				p = 1;
				break;
			case '5':
				s = 1;
				p = 1;
				break;
			case '6':
				s = 1;
				p = 1;
				break;
			case '7':
				s = 1;
				p = 1;
				break;
			case '8':
				s = 1;
				p = 1;
				break;
			case '9':
				s = 1;
				p = 1;
				break;
			case '.':
				s = 1;
				p = 1;
				break;
			
					
			}
			if (p==1){
				txt2.append(e);
				//cStr = cStr + e;
			}
			if (p>1){
				txt2.append(e);
				//cStr = cStr + e;
			}
	
			p = 0;
			
		}
		
		cStr = txt2.toString();
		if (s > 0){	
			if ((cStr.length() == 1) & cStr.equals(".")){
				return "0.0";
			}
			else {
				return cStr;
			}
		}
			
		else return "0.0";
	}
	
	
}
