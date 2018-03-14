package com.iesvirgendelcarmen.ejercicios;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ejercicio4Serializacion {

	public static void main(String[] args) {
		File f = new File("ficheros\\ejercicios\\ejercicio4.dat");
		Persona p1 = new Persona("Paco", "Perez", 23, "C/ 1");
		Persona p2 = new Persona("Pepe", "Pereza", 25, "C/ 2");
		Persona p3 = new Persona("Pope", "Perezoso", 26, "C/ 3");
		Persona p4 = new Persona("Papa", "Perezante", 27, "C/ 4");
		Persona p5 = new Persona("Pupo", "Perezador", 28, "C/ 5");
		try (ObjectOutputStream output = new ObjectOutputStream(
				new BufferedOutputStream(
						new FileOutputStream(f)));){
			
			output.writeObject(p1);
			output.writeObject(p2);
			output.writeObject(p3);
			output.writeObject(p4);
			output.writeObject(p5);
			
			System.out.println("fichero creado");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
}
