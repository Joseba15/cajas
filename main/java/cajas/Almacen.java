package main.java.cajas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Almacen {

	public static final int NUMERO_CAJAS=20;
	private Map<Caja,List<Cliente>>distribucionCajas;
	
	public Almacen () {
		distribucionCajas=new HashMap<>();
			for (int i = 1; i < NUMERO_CAJAS; i++) {
				Caja caja =new Caja(i);
				distribucionCajas.put(caja, new ArrayList<>());
		}
	}
	
	public void abrirCaja(int id) {
		for (Caja c : distribucionCajas.keySet()) {
			if (c.getIdCaja()==id) {
				c.abrirCaja();
			}
		}
	}
	
	public void cerrarCaja(int id) {
		for (Caja c : distribucionCajas.keySet()) {
			if (c.getIdCaja()==id) {
				if (distribucionCajas.get(c).isEmpty()) {
					c.cerrarCaja();
				}
			}
		}
	}
	
	public Caja obtenerCajaPrioritaria() {
		
		List<Caja> cajas =new ArrayList<>(distribucionCajas.keySet());
		cajas.sort(new ComparatorCajaId());
		Caja cajaPrioritaria = cajas.get(0);
		
		for (int i = 0; i < cajas.size(); i++) {
			if (distribucionCajas.get(cajaPrioritaria).size()
					>distribucionCajas.get(cajas.get(i)).size()) {
				cajaPrioritaria=cajas.get(i);
			}
		}
		
		return cajaPrioritaria;
	}
	
	public String asignarCliente(Cliente cl) {
		Caja caja=obtenerCajaPrioritaria();
		distribucionCajas.get(caja).add(cl);
		return "Usted es el cliente "+cl.getNumeroCliente()+" y debe de ir a la caja "+caja.getIdCaja();
	}
	
	public String atenderCaja(int idCaja) {
		String mensaje="";
		
		for (Caja c : distribucionCajas.keySet()) {
			if (c.getIdCaja()==idCaja && !distribucionCajas.get(c).isEmpty()) {
				Cliente cliente = distribucionCajas.get(c).get(0);
				mensaje+="Se ha atendido al cliente con numero "+cliente.getNumeroCliente();
				distribucionCajas.get(c).remove(0);
			}
		}
		return mensaje;
	}
	
}
