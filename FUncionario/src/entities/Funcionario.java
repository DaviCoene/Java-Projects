package entities;

public class Funcionario {
	private String nome;
	private String sobrenome;
	protected Integer horasTrabalhadas;
	protected double valorPorHora;
	
	public Funcionario(){
		
	}

	public Funcionario(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	public String nomeCompleto() {
		return nome + sobrenome;
	}
	
	public double calcularSalario() {
		return valorPorHora * horasTrabalhadas;
	}
	
	public void incrementarHoras(Integer horas) {
		horasTrabalhadas = horasTrabalhadas + horas; 
	}
}
