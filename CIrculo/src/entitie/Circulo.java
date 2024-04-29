package entitie;

public class Circulo {
	private double raio;
	private double area;
	private double perimetro;
	
	public Circulo(){
		
	}

	public Circulo(double raio) {
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getArea() {
		return area;
	}


	public double getPerimetro() {
		return perimetro;
	}

	public void calcularArea() {
		area = raio * raio * 3.14;
	}
	
	public void calcularPerimetro() {
		perimetro = 2 * 3*14 * raio;
	}
	
}
