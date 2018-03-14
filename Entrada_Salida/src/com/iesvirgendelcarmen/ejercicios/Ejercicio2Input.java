package com.iesvirgendelcarmen.ejercicios;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ejercicio2Input {
	public static void main(String[] args) {
		float sumaFloats = 0;
		try(DataInputStream input = new DataInputStream(
				new BufferedInputStream(
						new FileInputStream("ficheros\\ejercicios\\ejercicio2.dat")));) {
			
			for (int i = 0; i < 100; i++) {
				float num = input.readFloat();
				sumaFloats+=num;
				System.out.println(num);
			}
			System.out.printf("La suma de todos los floats: %.2f",sumaFloats);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
