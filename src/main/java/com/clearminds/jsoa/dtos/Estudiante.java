package com.clearminds.jsoa.dtos;

public class Estudiante {
	private String nombre,apellido;
	
	public Estudiante(String nombre, String apellido, int id) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
	}
	private int id;
	public Estudiante(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}
	@Override
	public String toString() {
		return "DATOS DEL ESTUDIANTE: \n" + 
				"ID: " + this.id +
				"NOMBRE: " + this.nombre + 
				"APELLIDO: " + this.apellido;
	}
	
	
	
}
