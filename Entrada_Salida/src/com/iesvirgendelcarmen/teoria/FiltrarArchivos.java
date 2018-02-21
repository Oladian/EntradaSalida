package com.iesvirgendelcarmen.teoria;

import java.io.File;
import java.io.FilenameFilter;


public class FiltrarArchivos {
	public static void main(String[] args) {
		File directorioRaiz = new File("ficheros\\carpeta\\carpeta2");
		System.out.println("¿Existe directorio? "+directorioRaiz.exists());
		if(directorioRaiz.exists()) {
			
			System.out.println(directorioRaiz.getAbsolutePath());
			String[] nombreFicherosTxt = directorioRaiz.list(new FilenameFilter() {
				
				@Override
				public boolean accept(File dir, String name) {
					// TODO Auto-generated method stub
					return name.endsWith(".txt");
				}
			});
			
			for (String ficherotxt : nombreFicherosTxt) {
				System.out.println(ficherotxt + " " + ficherotxt.length());
			}
		}
	}
}
