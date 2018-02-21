package com.iesvirgendelcarmen.teoria;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

public class StreamDeSalida1 {

	public static void main(String[] args) {
		// nombre del fichero de salida
		String nameFile = "ficheros\\fichero1.txt";
		
		// creamos el flujo (steram) de salida
		try (FileOutputStream outputStream = new FileOutputStream(nameFile);) {
			
			String nombre = "Francisco Javier está en cazando ñus";
			String nombre2 = "Pepito Pérez";
			byte[] bytesDeNombre2 = nombre2.getBytes();
			//escribimos hola: 104 111 108 97
			outputStream.write(104);
			outputStream.write(111);
			outputStream.write(108);
			outputStream.write(97);
			outputStream.write(10);
			outputStream.write(nombre.getBytes(Charset.forName("UTF-8")));
			outputStream.write(10);
			outputStream.write(bytesDeNombre2);
			outputStream.flush();
			outputStream.close();
		} catch (FileNotFoundException e) {
			System.out.println("Problemas en el fichero "+nameFile);
		} catch (IOException e1) {			
			System.out.println("ERROR I/O");
		}
	}
}
