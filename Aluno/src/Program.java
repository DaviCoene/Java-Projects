import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entitites.Aluno;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Aluno> list = new ArrayList<>();
		
		for(int i= 0 ; i < 2; i++) {
			System.out.println(" MATRICULA ");
			int matricula = sc.nextInt();
			
			System.out.println(" NOME ");
			String nome = sc.nextLine();
			sc.next();
			System.out.println(" NOTA1 ");
			float nota1 = sc.nextFloat();
			System.out.println(" NOTA2 ");
			float nota2 = sc.nextFloat();
			System.out.println(" FALTAS ");
			int faltas = sc.nextInt();
			
			Aluno aluno = new Aluno(matricula, nome, nota1, nota2,faltas);
			list.add(aluno);
		}
		float sum = 0;
		int Apr = 0;
		int Rep = 0;
		int Rec = 0;
		float maior = 0;
		for(Aluno a : list) {
			sum = sum + a.calcularMedia();
			if (maior < a.calcularMedia()) {
				maior = a.calcularMedia();
			}
			String alunin = a.verificarSituação(50);
			if (alunin == "APROVADO"){
					Apr++;
			}
			else if (alunin == "REPROVADO"){
				Rep++;
			}
			else {
				Rec++;
			}
			
		}
		float avg = sum / 2;
		
		
		System.out.println("Mèdia" + avg);
		System.out.println("Reprovados " + Rep);
		System.out.println("Aprovados " + Apr);
		System.out.println("Recuperados " + Rec);
		System.out.println("maior média " + maior);
		
		sc.close();
		
	}

}
