package com.iesvirgendelcarmen.teoria;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.time.LocalDate;

public class Serializacion2 {
	public static void main(String[] args) {
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
	}
}
