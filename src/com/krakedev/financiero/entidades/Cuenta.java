package com.krakedev.financiero.entidades;

public class Cuenta {
	
	// Atributos
	private  String id;
	private double saldoActual;
	private String tipo;
	
	//
	private Cliente propietario;
	
	
	
	
	// Constructor
	public Cuenta(String id) {
		this.id = id;
		this.saldoActual = 0;
		this.tipo = "A";
		this.propietario = new Cliente();
	}


	

	// Getters & Setters
	public String getId() {		return id;	}

	public void setId(String id) {		this.id = id;	}


	public double getSaldoActual() {	return saldoActual;	}

	public void setSaldoActual(double saldoActual) {	this.saldoActual = saldoActual;	}


	public String getTipo() {		return tipo;	}

	public void setTipo(String tipo) {	this.tipo = tipo;	}
		
	//
	public Cliente getPropietario() {	return propietario;	}

	public void setPropietario(Cliente propietario) {	this.propietario = propietario;	}
	
	
	
	
	
	// Metodos
	public void imprimir() {
		System.out.println("Id:       		" + id);
		System.out.println("Tipo:     		" + tipo);
		System.out.println("Saldo actual:   " + saldoActual);

		//
		System.out.println("Cedula cliente:     " + propietario.getCedula());
		System.out.println("Nombre cliente:     " + propietario.getNombre());
		System.out.println("Cedula apellido:    " + propietario.getApellido());
	
	}




	
	

}// Clase principal
