package main.java.cajasv2;

public class Cliente {

	private static int idClienteActual=0;
	private int numeroCliente;
	
	public Cliente() {
		this.numeroCliente=idClienteActual++;
	}

	public int getNumeroCliente() {
		return numeroCliente;
	}

	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
	}
	
}
