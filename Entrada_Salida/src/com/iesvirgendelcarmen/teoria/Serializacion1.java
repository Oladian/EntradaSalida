package com.iesvirgendelcarmen.teoria;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;


public class Serializacion1 {

	public static void main(String[] args) {
		try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(
				new BufferedOutputStream(
						new FileOutputStream("ficheros\\binarios\\object.dat")));){
			// ...
			objectOutputStream.writeInt(12);
			objectOutputStream.writeDouble(2.6);
			objectOutputStream.writeObject("Hola");
			objectOutputStream.writeFloat(33);
			objectOutputStream.writeObject("1");
			objectOutputStream.writeObject(LocalDate.now());
			ValidSerializablePerson p1 = new ValidSerializablePerson("Paco", "Carrillo", 49);
			objectOutputStream.writeObject(p1);
			//objectOutputStream.writeObject(ValidSerializablePerson.numeroPersona);
			System.out.println("Nº de personas: "+ValidSerializablePerson.numeroPersona);
			objectOutputStream.flush();
			System.out.println("Fichero creado en "+"ficheros\\binarios\\object.dat");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	/*	
		Scanner sc = new Scanner(System.in);
		int numeros;
		List<Integer> listaNumeros = new ArrayList<Integer>();
		
		for (int i = 0; i < 5; i++) {
			numeros = sc.nextInt();
			listaNumeros.add(numeros);
		}
		sc.close();
		*/ 
	}
}
