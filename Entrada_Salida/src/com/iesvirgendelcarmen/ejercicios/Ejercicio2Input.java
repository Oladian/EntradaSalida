package com.iesvirgendelcarmen.ejercicios;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ejercicio2Input {
	public static void main(String[] args) {
		try(DataInputStream input = new DataInputStream(
				new BufferedInputStream(
						new FileInputStream("ficheros\\ejercicios\\ejercicio2.txt")));) {
			
			for (int i = 0; i < 100; i++) {
				System.out.println(input.readFloat());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
