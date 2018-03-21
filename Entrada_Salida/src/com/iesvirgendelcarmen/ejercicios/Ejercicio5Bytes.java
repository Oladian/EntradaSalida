package com.iesvirgendelcarmen.ejercicios;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio5Bytes {

	public static void main(String[] args) {
		File fichero = new File(args[0]);
		
		
		if(args.length==2 && fichero.exists()) {
			
			int numeroTrozos = Integer.parseInt(args[1]);
			int cuentaBytes = 0;
			int divideFicheros=0;
			
			Scanner nombrarFicheros = new Scanner(System.in);
			System.out.println();
			
			
			try(FileInputStream ficheroEntrada = new FileInputStream(fichero);
				FileInputStream entradaStream = new FileInputStream(fichero);	
				Scanner scFicheroEntrada = new Scanner(ficheroEntrada);
				Scanner sc = new Scanner(ficheroEntrada)) {
				
				int byteRead;
				
				while ((byteRead = ficheroEntrada.read()) != -1) {
					cuentaBytes++;
			    }
				
				divideFicheros=cuentaBytes/numeroTrozos;
				int diferencia = cuentaBytes-(divideFicheros*numeroTrozos);
				System.out.println(cuentaBytes);
				
				for(int i=0;i<numeroTrozos;i++) {
					System.out.printf("Nombra el fichero %d: ",i);
					File f = new File("ficheros\\ejercicios\\"+nombrarFicheros.next()+".dat");
					DataOutputStream out = new DataOutputStream(new FileOutputStream(f));
					
					for (int j = 0; j < divideFicheros; j++) {
						byteRead = entradaStream.read(); 	
						out.write((char)byteRead);
						
						if(cuentaBytes%numeroTrozos==0 && j!=numeroTrozos-1) {
							out.write((char)byteRead);
							break;
						}
					}
				
					
					/*
					out.write((char)byteRead);
					byteRead = entradaStream.read();
					*/
					out.flush();
					out.close();
				}
				
				
				
			} catch (FileNotFoundException e) {
				System.out.println("Fichero no existe");
			} catch (IOException e1) {
				System.out.println("Excepcion IO");
			}
			nombrarFicheros.close();
		}	
		
	}

}
