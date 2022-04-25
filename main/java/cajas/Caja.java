package main.java.cajas;

public class Caja {

	private int idCaja;
	private boolean cerrado;
	

	public Caja() {
		this.cerrado=true;
	}
	
	public Caja(int id) {
		this.idCaja=id;
	}

	public int isCerrado() {
		return idCaja;
	}
	
	public boolean abrirCaja() {
		if (cerrado) {
			this.cerrado=false;
		}else {
			throw new CajaException("La caja ya estaba abierta");
		}
		return this.cerrado;
	}
	
	public boolean cerrarCaja() {
		if (!this.cerrado) {
			this.cerrado=true;
		}
		return this.cerrado;
	}
	
	public int getIdCaja() {
		return idCaja;
	}

	@Override
	public String toString() {
		return "Caja [idCaja=" + idCaja + ", cerrado=" + cerrado + "]";
	}
	
	
}
