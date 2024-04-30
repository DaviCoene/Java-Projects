import java.util.Scanner;

import entities.Funcionario;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome = sc.nextLine();
		String sobrenome = sc.nextLine();
		int horas = sc.nextInt();
		double valor = sc.nextDouble();
		Funcionario colaborador = new Funcionario(nome, sobrenome, horas, valor);
		
		System.out.println(colaborador.nomeCompleto());
		System.out.println(colaborador.calcularSalario());
		
		horas = sc.nextInt();
		
		colaborador.incrementarHoras(horas);
		System.out.println(colaborador.calcularSalario());
		
		sc.close();
		
	}

}
