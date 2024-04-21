import java.util.Scanner;

import entities.Contador;

public class Program {

	public static void main(String[] args) {
		char decisao, tipo;
		int quantidade;
		Contador contador1 = new Contador();
		
		while (true) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Você quer alterar a quantidade eventos(e) ou itens(i)? ");
			
			tipo = sc.next().charAt(0);
			
			if (tipo == 'e'){
				System.out.print("Você quer incrementar(i), zerar(z) , ou retornar o valor do contador?(c): ");
				decisao = sc.next().charAt(0);
				if (decisao == 'i'){
					System.out.print("Qual o valor para incrementar?: ");
					quantidade = sc.nextInt();
					for (int i = 0; i < quantidade; i++) {
						contador1.IncrementarEventos();
					}
				}
				if (decisao == 'z'){
					contador1.zerarE();
					System.out.println("Contador zerado com sucesso!");
				}
				if (decisao == 'c'){
					System.out.print("O valor é: ");
					System.out.println(contador1.getValorE());
				}
			}
			
			if (tipo == 'i'){
				System.out.print("Você quer incrementar(i), zerar(z) , ou retornar o valor do contador?(c): ");
				decisao = sc.next().charAt(0);
				if (decisao == 'i'){
					System.out.print("Qual o valor para incrementar?: ");
					quantidade = sc.nextInt();
					for (int i = 0; i < quantidade; i++) {
						contador1.IncrementarItens();
					}
				}
				if (decisao == 'z'){
					contador1.zerarI();
					System.out.println("Contador zerado com sucesso!");
				}
				if (decisao == 'c'){
					System.out.print("O valor é: ");
					System.out.println(contador1.getValorI());
				}
				
			}
			
			
			
		}
		
	}

}
