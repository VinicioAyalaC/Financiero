package pruebasUnitarias.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.krakedev.financiero.entidades.Cliente;
import com.krakedev.financiero.entidades.Cuenta;
import com.krakedev.financiero.servicios.Banco;

class BancoTest {

    @Test
    void crearCuenta_generaCodigosConsecutivos() {
        Banco banco = new Banco();
        Cliente cliente1 = new Cliente("0102030405", "Ana", "Pérez");
        Cliente cliente2 = new Cliente("0605040302", "Luis", "Gómez");

        Cuenta cuenta1 = banco.crearCuenta(cliente1);
        Cuenta cuenta2 = banco.crearCuenta(cliente2);

        assertEquals("1000", cuenta1.getId());
        assertEquals("1001", cuenta2.getId());
    }

    @Test
    void crearCuenta_asignaTipoAhorrosPorDefecto() {
        Banco banco = new Banco();
        Cliente cliente = new Cliente("0102030405", "Ana", "Pérez");

        Cuenta cuenta = banco.crearCuenta(cliente);

        assertEquals("A", cuenta.getTipo());
    }

    @Test
    void crearCuenta_inicializaSaldoEnCero() {
        Banco banco = new Banco();
        Cliente cliente = new Cliente("0102030405", "Ana", "Pérez");

        Cuenta cuenta = banco.crearCuenta(cliente);

        assertEquals(0, cuenta.getSaldoActual());
    }

    @Test
    void crearCuenta_asignaElClienteCorrecto() {
        Banco banco = new Banco();
        Cliente cliente = new Cliente("0102030405", "Ana", "Pérez");

        Cuenta cuenta = banco.crearCuenta(cliente);

        assertEquals(cliente, cuenta.getPropietario());
        assertEquals("0102030405", cuenta.getPropietario().getCedula());
    }
    
    
    @Test
    void depositar_saldo() {
        Banco banco = new Banco();
        Cliente cliente = new Cliente("0102030405", "Ana", "Pérez");
        Cuenta cuenta = banco.crearCuenta(cliente);

        boolean resultado = banco.depositar(100.0, cuenta);

        assertTrue(resultado);
        assertEquals(100.0, cuenta.getSaldoActual());
    }
    
    
    @Test
    void retirar_saldo() {
        Banco banco = new Banco();
        Cliente cliente = new Cliente("0102030405", "Ana", "Pérez");
        Cuenta cuenta = banco.crearCuenta(cliente);
        banco.depositar(200.0, cuenta);

        boolean resultado = banco.retirar(50.0, cuenta);

        assertTrue(resultado);
        assertEquals(150.0, cuenta.getSaldoActual());
    }
    
    
    
}//