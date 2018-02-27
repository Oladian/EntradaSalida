package com.iesvirgendelcarmen.teoria;

import java.io.Serializable;

@SuppressWarnings("serial")

// SE DEBE IMPORTAR java.io.Serializable para poderlo recoger con ObjectInputStream
public class ValidSerializablePerson implements Serializable {
	
	private String name;
	private String apellidos;
	private transient int edad; // transient hace que se envíe el valor por defecto
	public static int numeroPersona=0;
	
	
	public ValidSerializablePerson(String name, String apellidos, int edad) {
		this.name = name;
		this.apellidos = apellidos;
		this.edad = edad;
		numeroPersona++;
	}

	public String getName() {
		return name;
	}

	public String getApellidos() {
		return apellidos;
	}

	public int getEdad() {
		return edad;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", apellidos=" + apellidos + ", edad=" + edad + "]";
	}
}
