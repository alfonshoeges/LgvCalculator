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

// TODO: Auto-generated Javadoc
/**
 * The Class CopyToClipBoard.
 */
public class CopyToClipBoard implements ClipboardOwner{

	  /* (nicht-Javadoc)
  	 * @see java.awt.datatransfer.ClipboardOwner#lostOwnership(java.awt.datatransfer.Clipboard, java.awt.datatransfer.Transferable)
  	 */
  	public void lostOwnership( Clipboard aClipboard, Transferable aContents) {
		     
		   }
	
	  /**
  	 * Instantiates a new copy to clip board.
  	 */
  	public CopyToClipBoard() {
		super();
	  }
	
	  
	  /**
  	 * Sets the copy.
  	 *
  	 * @param enter the new copy
  	 */
  	public void setCopy(String enter){
		
		  CopyToClipBoard copyToClipBoard = new CopyToClipBoard();
		  copyToClipBoard.setClipboardContents(enter);
		
	  }
	
	  /**
  	 * Sets the clipboard contents.
  	 *
  	 * @param aString the new clipboard contents
  	 */
  	//Transfer to Clipboard (copies)
	  public void setClipboardContents( String aString ){
		    StringSelection stringSelection = new StringSelection( aString );
		    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		    clipboard.setContents( stringSelection, this );
	  }
	
	  /**
  	 * Gets the clipboard contents.
  	 *
  	 * @return the clipboard contents
  	 */
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
