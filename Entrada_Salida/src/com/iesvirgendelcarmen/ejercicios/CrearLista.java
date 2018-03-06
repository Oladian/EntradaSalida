package com.iesvirgendelcarmen.ejercicios;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.PrinterState;

public class CrearLista {
// crear lista dinamica de floats, un metodo generarFloats() con argumento
// multiplicador y se usa Math.random. Se rellenara con un bucle 50 veces.
// Luego otro metodo imprimirFichero() con la lista como argumento pero
// primero con printf usando 5 columnas (con un espacio de 10 y un salto de
// linea) y 10 filas
	public static List<Float> listaFloats = new ArrayList<Float>();
	
	public static void main(String[] args) {

		generarFloats(1000);
		imprimirFichero(listaFloats);
	}
	
	public static void generarFloats(int numero) {
		for (int i = 0; i < 50; i++) {
			listaFloats.add((float)Math.random()*numero);
		}
	}
	
	public static void imprimirFichero(List<Float> listaFloats) {
		File output = new File("ficheros\\listaFloats.dat");
		File outputPrint = new File("ficheros\\listaFloatsConPrintStream");
		
		try (PrintWriter printWriter = new PrintWriter(output)) {
			for (int i = 0; i < listaFloats.size(); i++) {
				if(i>0 && i%5==0) {
					printWriter.print("");
					System.out.println("");
				}
				printWriter.println(listaFloats.get(i));
				System.out.printf("%15.2f",listaFloats.get(i));
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.printf("%n-----------------------------------"
				+ "-----------------------"
				+ "-------------------------------%n");
		
		// PrintStream permite dar formato a la salida de los datos.
		
		try (PrintStream out = new PrintStream(
				new BufferedOutputStream(
						new FileOutputStream(
								outputPrint)));){
			
			for (int i = 0; i < listaFloats.size(); i++) {
				if(i>0 && i%5==0) {
					out.println();
					System.out.println("");
				}
				out.printf("%15.2f",listaFloats.get(i));
				System.out.printf("%15.2f",listaFloats.get(i));
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
}
