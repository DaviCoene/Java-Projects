package entities;

public class Aluno {
	private int matricula;
	private String nome;
	private float nota1;
	private float nota2;
	private int faltas;
	
	public Aluno() {
		
	}

	public Aluno(String nome, float nota1, float nota2, int faltas) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.faltas = faltas;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getNota1() {
		return nota1;
	}

	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}

	public float getNota2() {
		return nota2;
	}

	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}

	public int getFaltas() {
		return faltas;
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}
	
	public float calcularMedia() {
		float media = (nota1 +nota2) / 2;
		return media;
	}
	
	public float calcularFrequencia(int numAulas) {
		float frequencia = faltas / numAulas;
		return frequencia;
	}
	
	public String verificarSitua��o(int numAulas) {
		float a = calcularMedia();
		float f = calcularFrequencia(numAulas);
		String e = "APROVADO";
		String g = "RECUPERA��O";
		String x = "REPROVADO";
		if (a >= 7 && f >= 75){
			return e;
		}
		if ((a < 7 && a > 7) && f >= 75){
			return g;
		}
		else
			return x;
		
		
	}
	
	
}
