package com.iesvirgendelcarmen.ejercicios;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ejercicio4LeerSerializacion {
	public static void main(String[] args) {
		File f = new File("ficheros\\ejercicios\\ejercicio4.dat");
		try(ObjectInputStream input = new ObjectInputStream(new BufferedInputStream(new FileInputStream(f)));) {
			
			for(int i=0;i<5;i++)
				System.out.println(input.readObject());
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
