package com.iesvirgendelcarmen.teoria;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PruebaStreamConBuffer {

	public static void main(String[] args) {
		try (FileInputStream inFileInputStream = new FileInputStream("ficheros\\numeros.txt");){
			long starTime = System.nanoTime();
			int byteLeido;
			while((byteLeido=inFileInputStream.read())!=-1) {
				
			}
			long stopTime = System.nanoTime();
			System.out.println("Tiempo de lectura "+(stopTime-starTime/1_000_000.0)+" ms");
		} catch (FileNotFoundException e) {
			System.out.println("No fichero");
		}
		catch (IOException e) {
			System.out.println("IO EXCEPTION");
		}
		
		System.out.println("PONEMOS BUFFER");
		
		try (BufferedInputStream bufferedInputStream = new BufferedInputStream
				(new FileInputStream("ficheros\\numeros.txt"));){
				
			long starTime = System.nanoTime();
			int byteLeido;
			while((byteLeido=bufferedInputStream.read())!=-1) {
				
			}
			long stopTime = System.nanoTime();
			System.out.println("Tiempo de lectura con buffered"
					+ " "+(stopTime-starTime/1_000_000.0)+" ms");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
