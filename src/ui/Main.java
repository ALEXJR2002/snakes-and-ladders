/**
 * 
 */
package ui;

import java.io.IOException;

/**
 * @author ALEX JR
 * @author Santiago Arevalo
 */
public class Main {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Menu menu = new Menu ();
		try {
			menu.startProgram();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
