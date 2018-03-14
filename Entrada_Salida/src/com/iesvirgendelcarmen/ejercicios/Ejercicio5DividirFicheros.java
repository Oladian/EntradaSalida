package com.iesvirgendelcarmen.ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio5DividirFicheros {

	public static void main(String[] args) {
		
		
		if(args.length==2) {
			File ficheroEntrada = new File(args[0]);
			int numeroTrozos = Integer.parseInt(args[1]);
			
			Scanner nombrarFicheros = new Scanner(System.in);
			try(Scanner scFicheroEntrada = new Scanner(ficheroEntrada);) {
				
				for(int i=0;i<numeroTrozos;i++) {
					System.out.printf("Nombra el fichero %d: ",i);
					File f = new File("ficheros\\ejercicios\\"+nombrarFicheros.next());
					while(scFicheroEntrada.hasNextLine()) {
						
					}
				}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}	
	}
}
