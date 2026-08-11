package com.krakedev.financiero.test;

import com.krakedev.financiero.entidades.Cliente;
import com.krakedev.financiero.entidades.Cuenta;
import com.krakedev.financiero.servicios.Banco;

public class TestCuenta {

	public static void main(String[] args) {
		
		Cuenta cuenta = new Cuenta("100");
		
		cuenta.imprimir();	
		
		
		Banco banco = new Banco();
		Cliente cliente1 = new Cliente("0102030405", "Ana", "Pérez");
		Cuenta cuenta1 = banco.crearCuenta(cliente1);
		cuenta1.imprimir();

		Cliente cliente2 = new Cliente("0605040302", "Luis", "Gómez");
		Cuenta cuenta2 = banco.crearCuenta(cliente2);
		cuenta2.imprimir();
		
		
	}

}
