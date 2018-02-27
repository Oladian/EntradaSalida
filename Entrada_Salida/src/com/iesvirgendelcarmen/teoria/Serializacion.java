package com.iesvirgendelcarmen.teoria;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamConstants;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Serializacion {

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
		
		try(ObjectInputStream objectInputStream = new ObjectInputStream(
				new BufferedInputStream(
						new FileInputStream("ficheros\\binarios\\object.dat")));) {
			
			System.out.println(objectInputStream.readInt());
			System.out.println(objectInputStream.readDouble());
			System.out.println(objectInputStream.readObject());
			System.out.println(objectInputStream.readFloat());
			String numeroEnObjeto = (String) objectInputStream.readObject();
			LocalDate ld = (LocalDate) objectInputStream.readObject();
			ValidSerializablePerson p1 = (ValidSerializablePerson) objectInputStream.readObject();
			//System.out.println("Nº de personas "+objectInputStream.readObject());
			System.out.println("Esto es un String: "+numeroEnObjeto);
			System.out.println("N personas "+ValidSerializablePerson.numeroPersona);
			System.out.println(ld);
			System.out.println(p1);
		//	System.out.println("Nº de personas: "+p1.numeroPersona);
			//System.out.println(objectInputStream.readObject());
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		catch (IOException e) {
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
