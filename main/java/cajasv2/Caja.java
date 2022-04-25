package main.java.cajasv2;

import java.util.ArrayList;
import java.util.List;

public class Caja {

	private int idCaja;
	
	private List<Cliente> clientes;
	
	public Caja(int id) {
		idCaja=id;
		clientes=new ArrayList<Cliente>();
	}

}
