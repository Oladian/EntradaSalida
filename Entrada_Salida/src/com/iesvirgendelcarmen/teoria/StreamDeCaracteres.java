package com.iesvirgendelcarmen.teoria;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StreamDeCaracteres {

	public static void main(String[] args) {
		File inputFile = new File("ficheros\\fichero.txt");
		File outputFile = new File("ficheros\\ficheroOutput.txt");
		
		if (!inputFile.exists() || inputFile.length()==0) {
			System.out.println("No existe o tamaño 0");
			return;
			//System.exit(1);
		} else {		
			System.out.printf("El fichero existe. Tamaño: %d%n%n",inputFile.length());
		}
		
		// definimos el reader
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
				BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFile));){
		/*	int charLeido;
			while((charLeido=(int)bufferedReader.read())!=-1) {
				System.out.println((char)charLeido);
			}
		*/
			// leemos linea a linea
			String linea;
			while ((linea=bufferedReader.readLine())!=null) {
				bufferedWriter.write("Esto es una linea - "+linea);
				bufferedWriter.newLine();
				
			}
			bufferedWriter.flush();
			
		} catch (IOException e1) {
			System.out.println("IO error");
		}
		
	}
}

