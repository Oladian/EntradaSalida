package com.iesvirgendelcarmen.ejercicios;

import java.io.Serializable;

public class Persona implements Serializable {
	private String nombre;
	private String apellidos;
	private int edad;
	private String direccion;
	private int cuentaPersonas=0;
	
	public int getCuentaPersonas() {
		return cuentaPersonas;
	}

	public void setCuentaPersonas(int cuentaPersonas) {
		this.cuentaPersonas = cuentaPersonas;
	}

	public Persona(String nombre, String apellidos, int edad, String direccion) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.direccion = direccion;
		cuentaPersonas++;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", direccion=" + direccion
				+ "]";
	}
}
