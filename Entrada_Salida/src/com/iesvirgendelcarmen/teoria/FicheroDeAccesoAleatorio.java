package com.iesvirgendelcarmen.teoria;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FicheroDeAccesoAleatorio {
	public static void main(String[] args) {
		try(RandomAccessFile inout = new RandomAccessFile
				("ficheros\\binarios\\inout.dat", "rw");) {
			
			inout.setLength(0);		//Establece en 0 la longitud del fichero
			inout.seek(0);			//Se posiciona en la posicion 0
			
			for (int i = 0; i < 200; i++) {
				inout.writeDouble(i+1);
			}
			System.out.printf("Tamaño del fichero %d%n",inout.length());
			
			inout.seek(0); //Se posiciona en la posicion 0
			System.out.printf("Valor de posicion %d: %.2f%n",0,inout.readDouble());
			System.out.printf("Posicion del puntero: %d%n",inout.getFilePointer());
			System.out.printf("Siguiente valor de posicion: %.2f%n",inout.readDouble());
			inout.skipBytes(8); //Salta 8 bytes (8 por ser double)
			
			System.out.printf("Siguiente valor de posicion: %.2f%n",inout.readDouble());
			System.out.printf("Posicion del puntero: %d%n",inout.getFilePointer());
			
			// Salto a la ultima posicion
		/*	inout.seek(inout.length());
			inout.writeInt(1000);
			System.out.printf("Nuevo tamaño del fichero %d%n",inout.length());
			// Posicion ultima menos 4 bytes por ser entero
			inout.seek(inout.length()-4); 
			System.out.printf("Siguiente valor del entero: %d%n",inout.readInt());
			//System.out.printf("Posicion del puntero: %d%n",inout.getFilePointer());
		 */
			
			// Lectura con For
			
			for (int i = 0; i < 200; i++) {
				inout.seek(i*8);
				System.out.printf("Posicion en %d es %.2f%n",i,inout.readDouble());
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no existe");
			
		} catch (IOException e1) {
			System.out.println("IO error");
		}
		
		
	}
}
