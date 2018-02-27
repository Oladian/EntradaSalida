package com.iesvirgendelcarmen.teoria;

public class InvalidSerializablePerson {
	private String name;
	private String apellidos;
	private int edad;
	
	public InvalidSerializablePerson(String name, String apellidos, int edad) {
		this.name = name;
		this.apellidos = apellidos;
		this.edad = edad;
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
