/**
 * CalcApp.java -- Main application class for a simple text editor
 * with new, open, save, word count, font, and size options.
 * 
 * Possible future editions will include margin changes, print
 * functionality, and anything else I can come up with.
 * 
 * by Ben Decato
 * University of New Hampshire CS Student
 */

package calchelper.gui;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;

public class CalcApp extends JFrame
{
	private static final long serialVersionUID = 1L;
	// ---------------------- instance variables ----------------------
	private CalcGUI _calcGUI;
	public String _fileName = "";
	public static CalcApp theApp;
	
	//-----------------------version stuff ---------------------------
   public final static String VERSION = "1.0rc1";
   public final static String APP_NAME = "CalcHelper";
	
	// --------------------------- constructor -----------------------
	public CalcApp( String title, String[] args )
	{
		super( title );
		JFrame.setDefaultLookAndFeelDecorated( true );
		this.setBackground( Color.WHITE );
		this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		_calcGUI = new CalcGUI( this );
		this.add( _calcGUI );
		this.setSize( new Dimension( 300, 170 ) );
		this.setVisible( true );
	}
	
	// ------------------ main ------------------------------------------
	public static void main( String[] args )
	{
		theApp = new CalcApp( APP_NAME + " " + VERSION, args );
	}
}
