package com.iesvirgendelcarmen.ejercicios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio5Bytes {

	public static void main(String[] args) {
		File fichero = new File(args[0]);
		
		
		if(args.length==2 && fichero.exists()) {
			
			int numeroTrozos = Integer.parseInt(args[1]);
			int cuentaLineas = 0;
			int divideFicheros=0;
			Scanner nombrarFicheros = new Scanner(System.in);
			System.out.println();
			
			
			try(FileInputStream ficheroEntrada = new FileInputStream(fichero);
					Scanner scFicheroEntrada = new Scanner(ficheroEntrada);) {
				int byteRead;
				 while ((byteRead = ficheroEntrada.read()) != -1) {
					 	System.out.print((char)byteRead);
			         }
				
				System.out.println(ficheroEntrada.toString().getBytes());
				
				for(int i=0;i<numeroTrozos;i++) {
					System.out.printf("Nombra el fichero %d: ",i);
					File f = new File("ficheros\\ejercicios\\"+nombrarFicheros.next()+".txt");
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} /*catch (NoSuchElementException e1) {
				System.out.println("Terminado");
			}*/ catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}	
		
	}

}
