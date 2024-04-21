package entities;

public class Contador {
	private int valorE;
	private int valorI;
	
	public Contador(){
		
	}

	public Contador(int valorE, int valorI) {
		this.valorE = valorE;
		this.valorI = valorI;
	}

	public int getValorE() {
		return valorE;
	}
	public void zerarE() {
		this .valorE = 0;
	}

	public void IncrementarEventos() {
		this.valorE++;
	}

	public int getValorI() {
		return valorI;
	}

	public void zerarI() {
		this .valorI = 0;
	}
	public void IncrementarItens() {
		this.valorI++;
	}
	
	
	
	
}
