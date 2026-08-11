package com.krakedev.financiero.servicios;

import com.krakedev.financiero.entidades.Cliente;
import com.krakedev.financiero.entidades.Cuenta;

public class Banco {
	
	// Atributos
	private int ultimoCodigo;

	
	
	
	
	// Constructor
	public Banco() {
		this.ultimoCodigo = 1000;
	}
	
	
	
	
	// Getters & Setters
	public int getUltimoCodigo() {
		return ultimoCodigo;
	}	

	public void setUltimoCodigo(int ultimoCodigo) {
		this.ultimoCodigo = ultimoCodigo;
	}
	
	
	
	
	// Metodos
	public Cuenta  crearCuenta(Cliente cliente) {
		
		String codigoStr = ultimoCodigo + "";
		ultimoCodigo++;
		
		Cuenta cuenta = new Cuenta(codigoStr);
		
		cuenta.setPropietario(cliente);
		
		return cuenta;
		
	}
	
	
	

}//