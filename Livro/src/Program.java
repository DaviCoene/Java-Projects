import java.util.Scanner;

import entities.Livro;

public class Program {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
		String titulo = sc.nextLine();
		int qtdPaginas = sc.nextInt();
		Livro livro = new Livro(titulo, qtdPaginas);
		
		System.out.printf("o livro %s possu� %d p�ginas \n",livro.getLivro(), livro.getQtdPaginas());
		livro.setPaginasLidas(20);
		
		System.out.print("Voc� leu "+livro.verificarProgresso()+"% do livro");
		
livro.setPaginasLidas(50);
		
		System.out.print("Voc� leu "+livro.verificarProgresso()+"% do livro");
		
	
		
		
		sc.close();
		
	}

}
