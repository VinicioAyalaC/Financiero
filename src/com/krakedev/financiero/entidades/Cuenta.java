package com.krakedev.financiero.entidades;

public class Cuenta {
	
	// Atributos
	private  String id;
	private double saldoActual;
	private String tipo;
	
	
	
	
	// Constructor
	public Cuenta(String id) {
		this.id = id;
		this.saldoActual = 0;
		this.tipo = "A";
	}


	

	// Getters & Setters
	public String getId() {		return id;	}

	public void setId(String id) {		this.id = id;	}


	public double getSaldoActual() {	return saldoActual;	}

	public void setSaldoActual(double saldoActual) {	this.saldoActual = saldoActual;	}


	public String getTipo() {		return tipo;	}

	public void setTipo(String tipo) {	this.tipo = tipo;	}
	
	
	
	// Metodos
	public void imprimir() {
		System.out.println("Id:       		" + this.id);
		System.out.println("Tipo:     		" + this.tipo);
		System.out.println("Saldo actual:   " + this.saldoActual);
	}
	
	

}// Clase principal
