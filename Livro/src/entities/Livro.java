package entities;

public class Livro {
	private String livro;
	private Integer qtdPaginas;
	private Integer paginasLidas;
	
	public Livro() {
		
	}

	public Livro(String livro, Integer qtdPaginas) {
		this.livro = livro;
		this.qtdPaginas = qtdPaginas;
	}
	
	public double verificarProgresso() {
		 double porcentagem = paginasLidas * 100 / qtdPaginas;
		 return porcentagem;
	}

	public String getLivro() {
		return livro;
	}

	public void setLivro(String livro) {
		this.livro = livro;
	}

	public Integer getQtdPaginas() {
		return qtdPaginas;
	}

	public void setQtdPaginas(Integer qtdPaginas) {
		this.qtdPaginas = qtdPaginas;
	}

	public Integer getPaginasLidas() {
		return paginasLidas;
	}

	public void setPaginasLidas(Integer paginasLidas) {
		this.paginasLidas = paginasLidas;
	}
	
	
	
}
