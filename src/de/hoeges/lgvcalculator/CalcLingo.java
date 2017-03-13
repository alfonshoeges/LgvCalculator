	/**
	 * new progam for stock management
	 * Lagerverwaltung30
	 * LgvCalculator
	 * class CalcLingo
	 * created by Hans-Dieter Hoeges
	 * Eclipse, UTF8
	 * editing 24.03.2013
	 */

package de.hoeges.lgvcalculator;

public class CalcLingo {
	String[] lingo = new String[30];
	
	public CalcLingo() {
		for (int i=0;i < lingo.length;++i){
			lingo[i] = null;
		}
		
	}

	public String[] getLingo(String cLingo){
		
		if (cLingo.equals("DE")) { 
			//mProgram,mExit,mLanguages,mGerman,
			//mEnglish,mFrench,mSpanish,mInfo,mInformation;
			//bCopyT;
			//lMem;
			lingo[0] = "Programm";
			lingo[1] = "beenden";
			lingo[2] = "Sprachen";
			lingo[3] = "Deutsch";
			lingo[4] = "Englisch";
			lingo[5] = "Französisch";
			lingo[6] = "Spanisch";
			lingo[7] = "Italienisch";
			lingo[8] = "Info";
			lingo[9] = "Information";
			lingo[10] = "kopieren";
			lingo[11] = "Speicher";
			lingo[12] = "Titel: Calculator";
			lingo[13] = "Autor: Hans-Dieter Hoeges";
			lingo[14] = "Version: 1.0, Revision 0";
			lingo[15] = "Ein einfacher Rechner";
			lingo[16] = "Dieses Programm ist";
			lingo[17] = "Information";
			lingo[18] = "Fehler: Division durch 0";
			lingo[19] = "Fehler: Bereichsüberschreitung";
			lingo[20] = "einfügen";
			lingo[21] = "Finnisch";
			lingo[22] = "Dänisch";
			lingo[23] = "Niederländisch";
			lingo[24] = "Kroatisch";
			lingo[25] = "Ungarisch";
		}
		else if (cLingo.equals("EN")){
			lingo[0] = "Program";								//"Programm";
			lingo[1] = "Exit";									//"beenden";
			lingo[2] = "Languages";								//"Sprachen";
			lingo[3] = "German";								//"Deutsch";
			lingo[4] = "English";								//"Englisch";
			lingo[5] = "French";								//"Französisch";
			lingo[6] = "Spanish";								//"Spanisch";
			lingo[7] = "Italian";								//"Italienisch";
			lingo[8] = "Info";									//"Info";
			lingo[9] = "Information";							//"Information";
			lingo[10] = "Copies";								//"kopieren";
			lingo[11] = "Memory";								//"Speicher";
			lingo[12] = "Title: Calculator";					//"Titel: Calculator";
			lingo[13] = "Author: Hans-Dieter Hoeges";			//"Autor: Hans-Dieter Hoeges";
			lingo[14] = "Version: 1.0, revision 0";				//"Version: 1.0, Revision 0";
			lingo[15] = "A simple calculator";					//"Ein einfacher Rechner";
			lingo[16] = "This program is";						//"Dieses Programm ist";
			lingo[17] = "Information";							//"Information";
			lingo[18] = "Error: Division by 0";					//"Fehler: Division durch 0";
			lingo[19] = "Error: Value-infringement";			//"Fehler: Bereichsüberschreitung";
			lingo[20] = "Paste";								//"einfügen";
			lingo[21] = "Finnish";								//"Finnisch";
			lingo[22] = "Danish";								//"Dänisch";
			lingo[23] = "Dutch";								//"Niederländisch";
			lingo[24] = "Croatian";								//"Kroatisch";
			lingo[25] = "Hungarian";							//"Ungarisch";
			
		}
		else if (cLingo.equals("FR")){
			lingo[0] = "Programme";								//"Programm";
			lingo[1] = "sortez";								//"beenden";
			lingo[2] = "Langages";								//"Sprachen";
			lingo[3] = "Allemand";								//"Deutsch";
			lingo[4] = "Anglais";								//"Englisch";
			lingo[5] = "Français";								//"Französisch";
			lingo[6] = "Espagnol";								//"Spanisch";
			lingo[7] = "Italien";								//"Italienisch";
			lingo[8] = "Info";									//"Info";
			lingo[9] = "Information";							//"Information";
			lingo[10] = "Copie";								//"kopieren";
			lingo[11] = "Sauvegarder";							//"Speicher";
			lingo[12] = "Titre: Calculator";					//"Titel: Calculator";
			lingo[13] = "Auteur: Hans-Dieter Hoeges";			//"Autor: Hans-Dieter Hoeges";
			lingo[14] = "Version: 1.0, révision 0";				//"Version: 1.0, Revision 0";
			lingo[15] = "Un ordinateur simple";					//"Ein einfacher Rechner";
			lingo[16] = "Ce programme est";						//"Dieses Programm ist";
			lingo[17] = "Information";							//"Information";
			lingo[18] = "Erreur: Division par 0";				//"Fehler: Division durch 0";
			lingo[19] = "Erreur : dépassement du secteur";		//"Fehler: Bereichsüberschreitung";
			lingo[20] = "Insérez";								//"einfügen";
			lingo[21] = "Finlandais";							//"Finnisch";
			lingo[22] = "Danois";								//"Dänisch";
			lingo[23] = "Néerlandais";							//"Niederländisch";
			lingo[24] = "Croate";								//"Kroatisch";
			lingo[25] = "Hongrois";								//"Ungarisch";
			
			
		}
		else if (cLingo.equals("FI")){
			lingo[0] = "Ohjelman";								//"Programm";
			lingo[1] = "lopeta";								//"beenden";
			lingo[2] = "Kielet";								//"Sprachen";
			lingo[3] = "Saksa";									//"Deutsch";
			lingo[4] = "Englanti";								//"Englisch";
			lingo[5] = "Ranska";								//"Französisch";
			lingo[6] = "Espanja";								//"Spanisch";
			lingo[7] = "Italia";								//"Italienisch";
			lingo[8] = "Tietoja";								//"Info";
			lingo[9] = "Tietoja";								//"Information";
			lingo[10] = "kopioi";								//"kopieren";
			lingo[11] = "Tallennus";							//"Speicher";
			lingo[12] = "Nimi: Calculator";						//"Titel: Calculator";
			lingo[13] = "Kirjoittaja: Hans-Dieter Hoeges";		//"Autor: Hans-Dieter Hoeges";
			lingo[14] = "Versio: 1.0, revisio 0";				//"Version: 1.0, Revision 0";
			lingo[15] = "Yksinkertainen laskinr";				//"Ein einfacher Rechner";
			lingo[16] = "Tämä ohjelma on";						//"Dieses Programm ist";
			lingo[17] = "Tietoja";								//"Information";
			lingo[18] = "Virhe: Jaettu nollalla";				//"Fehler: Division durch 0";
			lingo[19] = "Virhe: alueen ylittäminen";			//"Fehler: Bereichsüberschreitung";
			lingo[20] = "liitä";								//"einfügen";
			lingo[21] = "Suomi";								//"Finnisch";
			lingo[22] = "Tanska";								//"Dänisch";
			lingo[23] = "Hollanti";								//"Niederländisch";
			lingo[24] = "Kroatia";								//"Kroatisch";
			lingo[25] = "Unkari";								//"Ungarisch";
			
			
			
		}
		else if (cLingo.equals("DA")){
			lingo[0] = "Program";								//"Programm";
			lingo[1] = "Afslutte";								//"beenden";
			lingo[2] = "Sprog";									//"Sprachen";
			lingo[3] = "Tysk";									//"Deutsch";
			lingo[4] = "Engelsk";								//"Englisch";
			lingo[5] = "Fransk";								//"Französisch";
			lingo[6] = "Spansk";								//"Spanisch";
			lingo[7] = "Italiensk";								//"Italienisch";
			lingo[8] = "Information";							//"Info";
			lingo[9] = "Information";							//"Information";
			lingo[10] = "Kopier";								//"kopieren";
			lingo[11] = "gem";									//"Speicher";
			lingo[12] = "Title: Calculator";					//"Titel: Calculator";
			lingo[13] = "Forfatter: Hans-Dieter Hoeges";		//"Autor: Hans-Dieter Hoeges";
			lingo[14] = "Version: 1.0, revision 0";				//"Version: 1.0, Revision 0";
			lingo[15] = "En simpel lommeregner";				//"Ein einfacher Rechner";
			lingo[16] = "dette program er";						//"Dieses Programm ist";
			lingo[17] = "Information";							//"Information";
			lingo[18] = "fejl: Deling gennem 0";				//"Fehler: Division durch 0";
			lingo[19] = "fejl: Overskridelse af område";		//"Fehler: Bereichsüberschreitung";
			lingo[20] = "sæt ind";								//"einfügen";
			lingo[21] = "Finsk";								//"Finnisch";
			lingo[22] = "Dansk";								//"Dänisch";
			lingo[23] = "Hollandsk";							//"Niederländisch";
			lingo[24] = "Kroatisk";								//"Kroatisch";
			lingo[25] = "Ungarsk";								//"Ungarisch";
			
			
		}
		else if (cLingo.equals("NL")){
			lingo[0] = "Programma";								//"Programm";
			lingo[1] = "beëindigen";							//"beenden";
			lingo[2] = "Talen";									//"Sprachen";
			lingo[3] = "Duits";									//"Deutsch";
			lingo[4] = "Engels";								//"Englisch";
			lingo[5] = "Frans";									//"Französisch";
			lingo[6] = "Spaans";								//"Spanisch";
			lingo[7] = "Italiaans";								//"Italienisch";
			lingo[8] = "Informatie";							//"Info";
			lingo[9] = "Informatie";							//"Information";
			lingo[10] = "Kopiëren";								//"kopieren";
			lingo[11] = "geheugen";								//"Speicher";
			lingo[12] = "Title: Calculator";					//"Titel: Calculator";
			lingo[13] = "Auteur: Hans-Dieter Hoeges";			//"Autor: Hans-Dieter Hoeges";
			lingo[14] = "Versie: 1.0, revisie 0";				//"Version: 1.0, Revision 0";
			lingo[15] = "Een eenvoudige rekenmachine";			//"Ein einfacher Rechner";
			lingo[16] = "Dit programma is";						//"Dieses Programm ist";
			lingo[17] = "Informatie";							//"Information";
			lingo[18] = "Fout: deling door 0";					//"Fehler: Division durch 0";
			lingo[19] = "Fout: overschrijding van het bereik";	//"Fehler: Bereichsüberschreitung";
			lingo[20] = "Invoegen";								//"einfügen";
			lingo[21] = "Fins";									//"Finnisch";
			lingo[22] = "Deens";								//"Dänisch";
			lingo[23] = "Nederlands";							//"Niederländisch";
			lingo[24] = "Kroatisch";							//"Kroatisch";
			lingo[25] = "Hongaars";								//"Ungarisch";
			
			
		}
		else if (cLingo.equals("HR")){
			lingo[0] = "Program";								//"Programm";
			lingo[1] = "završiti";								//"beenden";
			lingo[2] = "Jezici";								//"Sprachen";
			lingo[3] = "Njemački";								//"Deutsch";
			lingo[4] = "Engleski";								//"Englisch";
			lingo[5] = "Francuski";								//"Französisch";
			lingo[6] = "Španjolski";							//"Spanisch";
			lingo[7] = "Talijanski";							//"Italienisch";
			lingo[8] = "Informacije";							//"Info";
			lingo[9] = "Informacije";							//"Information";
			lingo[10] = "Kopirati";								//"kopieren";
			lingo[11] = "Memorija";								//"Speicher";
			lingo[12] = "Naslov: Calculator";					//"Titel: Calculator";
			lingo[13] = "Autor: Hans-Dieter Hoeges";			//"Autor: Hans-Dieter Hoeges";
			lingo[14] = "Verzija: 1.0, Revizija 0";				//"Version: 1.0, Revision 0";
			lingo[15] = "Jednostavno računalo";					//"Ein einfacher Rechner";
			lingo[16] = "Ovaj je program";						//"Dieses Programm ist";
			lingo[17] = "Informacije";							//"Information";
			lingo[18] = "Pogreška: dijeljenje s ništicom";		//"Fehler: Division durch 0";
			lingo[19] = "Pogreška: prekoračenje područja";		//"Fehler: Bereichsüberschreitung";
			lingo[20] = "Ubaciti-kopirati";						//"einfügen";
			lingo[21] = "Finski";								//"Finnisch";
			lingo[22] = "Danski";								//"Dänisch";
			lingo[23] = "Nizozemski";							//"Niederländisch";
			lingo[24] = "Hrvatski";								//"Kroatisch";
			lingo[25] = "Mađarski";								//"Ungarisch";
			
			
		}
		else if (cLingo.equals("ES")){
			lingo[0] = "Programa";								//"Programm";
			lingo[1] = "salida";								//"beenden";
			lingo[2] = "Lenguajes";								//"Sprachen";
			lingo[3] = "Alemán";								//"Deutsch";
			lingo[4] = "Inglés";								//"Englisch";
			lingo[5] = "Francés";								//"Französisch";
			lingo[6] = "Español";								//"Spanisch";
			lingo[7] = "Italiano";								//"Italienisch";
			lingo[8] = "Información";							//"Info";
			lingo[9] = "Información";							//"Information";
			lingo[10] = "Copia";								//"kopieren";
			lingo[11] = "Memoria";								//"Speicher";
			lingo[12] = "Título: Calculator";					//"Titel: Calculator";
			lingo[13] = "Autor: Hans-Dieter Hoeges";			//"Autor: Hans-Dieter Hoeges";
			lingo[14] = "Versión: 1.0, revisión 0";				//"Version: 1.0, Revision 0";
			lingo[15] = "Una calculadora simple";				//"Ein einfacher Rechner";
			lingo[16] = "Este programa es";						//"Dieses Programm ist";
			lingo[17] = "Información";							//"Information";
			lingo[18] = "Error: La división por 0";				//"Fehler: Division durch 0";
			lingo[19] = "Error: La valor-infracción";			//"Fehler: Bereichsüberschreitung";
			lingo[20] = "Pegue";								//"einfügen";
			lingo[21] = "Finlandés";							//"Finnisch";
			lingo[22] = "Dinamarqués";							//"Dänisch";
			lingo[23] = "Holandés";								//"Niederländisch";
			lingo[24] = "Croata";								//"Kroatisch";
			lingo[25] = "Húngaro";								//"Ungarisch";
			
			
		}
		else if (cLingo.equals("IT")) { 
			
			lingo[0] = "Programma";								//"Programm";
			lingo[1] = "uscita";								//"beenden";
			lingo[2] = "Lingue";								//"Sprachen";
			lingo[3] = "Il tedesco";							//"Deutsch";
			lingo[4] = "L'inglese";								//"Englisch";
			lingo[5] = "Il francese";							//"Französisch";
			lingo[6] = "Lo spagnolo";							//"Spanisch";
			lingo[7] = "L'italiano";							//"Italienisch";
			lingo[8] = "Info";									//"Info";
			lingo[9] = "Informazione";							//"Information";
			lingo[10] = "Se copiano";							//"kopieren";
			lingo[11] = "Memoria";								//"Speicher";
			lingo[12] = "Titolo: Calculator";					//"Titel: Calculator";
			lingo[13] = "Autore: Hans-Dieter Hoeges";			//"Autor: Hans-Dieter Hoeges";
			lingo[14] = "Versione: 1.0, Revision 0";			//"Version: 1.0, Revision 0";
			lingo[15] = "Un calcolatore semplice";				//"Ein einfacher Rechner";
			lingo[16] = "Questo programma è";					//"Dieses Programm ist";
			lingo[17] = "Informazione";							//"Information";
			lingo[18] = "Errore: Divisione per 0";				//"Fehler: Division durch 0";
			lingo[19] = "Errore: Superamento di valore";		//"Fehler: Bereichsüberschreitung";
			lingo[20] = "Incolli";								//"einfügen";
			lingo[21] = "Finlandese";							//"Finnisch";
			lingo[22] = "Danese";								//"Dänisch";
			lingo[23] = "Olandese";								//"Niederländisch";
			lingo[24] = "Croato";								//"Kroatisch";
			lingo[25] = "L'ungherese";							//"Ungarisch";
			
			
		}
		else if (cLingo.equals("HU")) { 
			
			lingo[0] = "Program";								//"Programm";
			lingo[1] = "befejezni";								//"beenden";
			lingo[2] = "Nyelvek";								//"Sprachen";
			lingo[3] = "Német";									//"Deutsch";
			lingo[4] = "Angol";									//"Englisch";
			lingo[5] = "Francia";								//"Französisch";
			lingo[6] = "Spanyol";								//"Spanisch";
			lingo[7] = "Olasz";									//"Italienisch";
			lingo[8] = "Információ";							//"Info";
			lingo[9] = "Információ";							//"Information";
			lingo[10] = "másolni";								//"kopieren";
			lingo[11] = "Memória";								//"Speicher";
			lingo[12] = "Cim: számológép";						//"Titel: Calculator";
			lingo[13] = "Szerző: Hans-Dieter Hoeges";			//"Autor: Hans-Dieter Hoeges";
			lingo[14] = "Verzió 1.0, változat 0";				//"Version: 1.0, Revision 0";
			lingo[15] = "Egy egyszerü számológép";				//"Ein einfacher Rechner";
			lingo[16] = "Ez a program";							//"Dieses Programm ist";
			lingo[17] = "Információ";							//"Information";
			lingo[18] = "Hiba: nullával való osztás";			//"Fehler: Division durch 0";
			lingo[19] = "Hiba: határ túllépése";				//"Fehler: Bereichsüberschreitung";
			lingo[20] = "beilleszteni";							//"einfügen";
			lingo[21] = "Finn";									//"Finnisch";
			lingo[22] = "Dán";									//"Dänisch";
			lingo[23] = "Holland";								//"Niederländisch";
			lingo[24] = "Horvát";								//"Kroatisch";
			lingo[25] = "Magyar";								//"Ungarisch";
			
		}
		
		return lingo;
		
	}
	
	
}
