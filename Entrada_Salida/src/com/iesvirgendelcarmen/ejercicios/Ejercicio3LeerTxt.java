package com.iesvirgendelcarmen.ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio3LeerTxt {

	public static void main(String[] args) {
		File f = new File("ficheros\\ejercicios\\fundacionEImperio.txt");
		String[] words = null;
		int lineCounter=0;
		int wordCounter=0;
		try(Scanner sc = new Scanner(f);) {
			
			while(sc.hasNextLine()) {
				words = sc.nextLine().replaceAll("[,.;]", "\\s").split("\\s+|\\n+");
				wordCounter+=words.length;
				lineCounter++;
			}
			
			System.out.printf("Numero de lineas: %d - Numero de palabras: %d",lineCounter,wordCounter);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
		
	}

}
