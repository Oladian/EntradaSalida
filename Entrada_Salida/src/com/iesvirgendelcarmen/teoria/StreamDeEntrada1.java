package com.iesvirgendelcarmen.teoria;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class StreamDeEntrada1 {
	public static void main(String[] args) {
		File inputFile = new File(".\\ficheros\\carpeta\\fichero2.txt");
		
		if (!inputFile.exists() || inputFile.length()==0) {
			System.out.println("No existe o tamaño 0");
			return;
			//System.exit(1);
		} else {		
			System.out.printf("El fichero existe. Tamaño: %d%n%n",inputFile.length());
			try (FileInputStream fileInputStream = new FileInputStream(inputFile)) {
				int byteLeido;
				while ((byteLeido= fileInputStream.read())!=-1) {
					System.out.printf("%c",(char)byteLeido);
					//System.out.printf("%d%n",byteLeido);	
				}
				fileInputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	
	}
}
