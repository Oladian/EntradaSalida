package com.iesvirgendelcarmen.ejercicios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class IOArgs {
	public static void main(String[] args) {
		if (args.length!=2) {
			System.out.println("Argumentos insuficientes");
			return;
		} 
		if(args[0].equals(args[1])) {
			System.out.println("Fichero origen igual que el fichero de destino.");
			return;
		}
		else {
			File inputFile = new File(args[0]);
			File outputFile = new File(args[1]);
			
			if (!inputFile.exists() || inputFile.length()==0) {
				System.out.println("No existe o tiene tamaño 0");
				return;
			} else {
				try (FileInputStream fileInputStream = new FileInputStream(inputFile); 
					FileOutputStream fileOutputStream = new FileOutputStream(outputFile);) {

						int readByte;
						while((readByte=fileInputStream.read())!=-1) {
							fileOutputStream.write((char)readByte);
						} fileOutputStream.flush();
						System.out.println("Fichero "+args[0]+" copiado correctamente."
								+ "en "+args[1]);
						
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					System.out.println("FileNotFoundException ERROR");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					System.out.println("IO ERROR");
				}
			}
		}
	}
}
