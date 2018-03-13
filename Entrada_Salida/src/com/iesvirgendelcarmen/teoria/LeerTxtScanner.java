package com.iesvirgendelcarmen.teoria;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerTxtScanner {
	public static void main(String[] args) {
		int cuentaLineas=0;
		int cuentaPalabras=0;
		int cuentaPalabras2=0;
		File f = new File("ficheros\\loremIpsun.txt"); 
		if(f.exists())
			System.out.println("Fichero existe");
		
		try (Scanner sc = new Scanner(f);
				Scanner sc2 = new Scanner(f)){
			
			while(sc.hasNextLine()) {
				
				String[] palabras = sc.nextLine().replaceAll("[,.;]", "\\s").split("\\s+");
				cuentaPalabras2 += palabras.length;
				cuentaLineas++;
			}
			

			while(sc2.hasNext()) {
				cuentaPalabras++;
				sc2.next();
			}

			
			System.out.printf("Lineas: %d%nPalabras: %d%n",cuentaLineas,cuentaPalabras);
			System.out.println("CuentaPalabras 2: "+cuentaPalabras2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	
}
