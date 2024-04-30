package entities;

public class Funcionario {
	private String nome;
	private String sobrenome;
	protected Integer horasTrabalhadas;
	protected double valorPorHora;
	
	public Funcionario(){
		
	}

	
	
	public Funcionario(String nome, String sobrenome, Integer horasTrabalhadas, double valorPorHora) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorPorHora = valorPorHora;
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



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getSobrenome() {
		return sobrenome;
	}



	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}



	public Integer getHorasTrabalhadas() {
		return horasTrabalhadas;
	}




	public double getValorPorHora() {
		return valorPorHora;
	}



	
	
}
