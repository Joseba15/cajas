package main.java.cajas.mainapp;

import java.util.Iterator;

import main.java.cajas.Almacen;
import main.java.cajas.CajaException;
import main.java.cajas.Cliente;

public class MainApp {

	public static void main(String[] args) {
		Almacen a1= new Almacen();
		
		try {
			//a1.abrirCaja(2);
			//a1.abrirCaja(3);
			//a1.cerrarCaja(2);
			//a1.abrirCaja(20);
			
			for (int i = 0; i <80; i++) {
				System.out.println(a1.atenderCaja(4));
				System.out.println(a1.atenderCaja(2));
				System.out.println(a1.atenderCaja(18));
			}
			
			System.out.println(a1.asignarCliente(new Cliente()));
			System.out.println(a1.asignarCliente(new Cliente()));			
			System.out.println(a1.asignarCliente(new Cliente()));
			
		}catch (CajaException ce) {
			
			System.out.println(ce.getLocalizedMessage());
		}
		System.out.println(a1);
	}

}
