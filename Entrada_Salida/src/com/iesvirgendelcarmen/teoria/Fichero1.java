package com.iesvirgendelcarmen.teoria;

import java.io.File;
import java.sql.Date;
import java.util.Arrays;

public class Fichero1 {

	public static void main(String[] args) {
	
		File file = new File(".\\ficheros\\fichero.txt");
		if(!file.exists()) {
			System.out.println("No existe");
			System.exit(1);
		} else System.out.println("Existe");
	
		System.out.println("Tamaño del fichero: "+file.length()+" bytes");
		System.out.println("Última modificación: "+new Date(file.lastModified()));
		
		File directorio = new File(".\\ficheros");
		if (!directorio.isDirectory()) {
			System.out.println("No es directorio");
		} else System.out.println("Es directorio");
		
		File[] listaFicheros = directorio.listFiles();
		System.out.println(Arrays.toString(listaFicheros));
	}
}
