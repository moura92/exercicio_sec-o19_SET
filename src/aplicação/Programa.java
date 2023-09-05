package aplicação;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entidades.Codigo;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Set<Codigo> codigo = new HashSet<>();

		System.out.print("Quantos alunos para o curso A? ");
		int cursoa = sc.nextInt();
		for (int i = 0; i < cursoa; i++) {
			int codigoa = sc.nextInt();
			codigo.add(new Codigo(codigoa));
		}

		System.out.print("Quantos alunos para o curso B? ");
		int cursob = sc.nextInt();
		for (int j = 0; j < cursob; j++) {
			int codigob = sc.nextInt();
			codigo.add(new Codigo(codigob));
		}

		System.out.print("Quantos alunos para o curso B? ");
		int cursoc = sc.nextInt();
		for (int k = 0; k < cursoc; k++) {
			int codigoc = sc.nextInt();
			codigo.add(new Codigo(codigoc));
		}

		System.out.println("Total de Estudantes: " + codigo.size());
		sc.close();
	}

}
