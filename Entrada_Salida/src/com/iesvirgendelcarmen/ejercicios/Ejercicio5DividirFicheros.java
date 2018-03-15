package com.iesvirgendelcarmen.ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Ejercicio5DividirFicheros {

	public static void main(String[] args) {
		
		
		if(args.length==2) {
			File ficheroEntrada = new File(args[0]);
			int numeroTrozos = Integer.parseInt(args[1]);
			int cuentaLineas = 0;
			int divideFicheros=0;
			String frase = null;
			Scanner nombrarFicheros = new Scanner(System.in);
			
			try(Scanner scFicheroEntrada = new Scanner(ficheroEntrada);
					Scanner scEscribirDatos = new Scanner(ficheroEntrada)) {
				for(int i=0;i<numeroTrozos;i++) {
					System.out.printf("Nombra el fichero %d: ",i);
					File f = new File("ficheros\\ejercicios\\"+nombrarFicheros.next()+".txt");
					PrintWriter print = new PrintWriter(f);
					if(f.exists()) {
						while(scFicheroEntrada.hasNextLine()) {
							cuentaLineas++;
							scFicheroEntrada.nextLine();
						}
						divideFicheros=cuentaLineas/numeroTrozos;
						System.out.println(divideFicheros);
						for (int j = 0; j < divideFicheros; j++) {
							System.out.println(j);
							frase =scEscribirDatos.next();
							//print.print(scEscribirDatos.nextLine());
							System.out.println(frase);
						}
					}	
					print.flush();
				}
				
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} /*catch (NoSuchElementException e1) {
				System.out.println("Terminado");
			}*/

		}	
	}
}
