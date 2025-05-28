package ar.edu.unlp.oo1.ejercicio1.app;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import javax.swing.SwingUtilities;
import ar.edu.unlp.oo1.ejercicio1.ui.WallPostUI;
import logging.extensions.JSONFormater;
import logging.extensions.UpperCaseFormater;



public class Ejercicio1Application {
	
	public static void main(String[] args) throws SecurityException, IOException {
		//Parte A
		Logger logger = Logger.getLogger("app.main");
		FileHandler fh = new FileHandler("log.txt");
		
		//Parte B UpperCase
		//fh.setFormatter(new UpperCaseFormater());
		
		//Parte B JSON
		//fh.setFormatter(new JSONFormater());
		logger.addHandler(fh);

		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Logger.getLogger("app.main").log(Level.INFO, "Aplicacion Iniciada");
				new WallPostUI();
			}
		});
	}

}
