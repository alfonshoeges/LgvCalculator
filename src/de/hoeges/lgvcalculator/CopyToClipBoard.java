	/**
	 * new progam for stock management
	 * Lagerverwaltung30
	 * LgvCalculator
	 * class CopyToClipBoard
	 * created by Hans-Dieter Hoeges
	 * Eclipse, UTF8
	 * editing 24.03.2013
	 */


package de.hoeges.lgvcalculator;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class CopyToClipBoard implements ClipboardOwner{

	  public void lostOwnership( Clipboard aClipboard, Transferable aContents) {
		     
		   }
	
	  public CopyToClipBoard() {
		super();
	  }
	
	  
	  public void setCopy(String enter){
		
		  CopyToClipBoard copyToClipBoard = new CopyToClipBoard();
		  copyToClipBoard.setClipboardContents(enter);
		
	  }
	
	  //Transfer to Clipboard (copies)
	  public void setClipboardContents( String aString ){
		    StringSelection stringSelection = new StringSelection( aString );
		    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		    clipboard.setContents( stringSelection, this );
	  }
	
	  //Transfer from Clipboard (paste)
	  public String getClipboardContents() {
		    String result = "";
		    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		    
		    Transferable contents = clipboard.getContents(null);
		    boolean hasTransferableText =
		      (contents != null) &&
		      contents.isDataFlavorSupported(DataFlavor.stringFlavor)
		    ;
		    if ( hasTransferableText ) {
		      try {
		        result = (String)contents.getTransferData(DataFlavor.stringFlavor);
		      }
		      catch (UnsupportedFlavorException ex){
		        
		      }
		      catch (IOException ex) {
		      
		      }
		    }
		    return result;
		}
	
}
