package entities;

public class Retangulo {
	private double lado1;
	private double lado2;
	private double area;
	private double perimetro;
	
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	public Retangulo() {
		
	}

	public Retangulo(double lado1, double lado2) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	public void calcularArea() {
	area = lado1 * lado2;	
	}
	
	public void calcularPerimetro() {
		perimetro = 2*lado1 + 2*lado2;
	}
	
	
	
}
