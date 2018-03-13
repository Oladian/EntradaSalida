package com.iesvirgendelcarmen.ejercicios;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejercicio2Output {

	public static void main(String[] args) {
		try (DataOutputStream output = new DataOutputStream(
				new BufferedOutputStream(
						new FileOutputStream("ficheros\\ejercicios\\ejercicio2.txt")));) {
			for (int i = 0; i < 100; i++) {
				output.writeFloat((float)(Math.random()*100));;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
