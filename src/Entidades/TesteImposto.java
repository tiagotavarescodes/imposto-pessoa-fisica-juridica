package Entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteImposto {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		List<Pessoa> list = new ArrayList<Pessoa>();

		System.out.print("Insira o número de pessoas: ");
		int n = teclado.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Dados da pessoa # " + i);
			System.out.print("Física ou Jurídica(f/j)?");
			char type = teclado.next().charAt(0);
			System.out.print("Nome: ");
			String nome = teclado.next();
			System.out.print("Renda anual: ");
			double rendaAnual = teclado.nextDouble();

			if (type == 'f') {
				System.out.print("Gastos com saúde: ");
				double GastoComSaude = teclado.nextDouble();
				Fisica x = new Fisica(nome, rendaAnual, GastoComSaude);

				list.add(x);
			} else {
				System.out.print("Número de funcionários: ");
				int numeroDeFuncionarios = teclado.nextInt();
				Juridica y = new Juridica(nome, rendaAnual, numeroDeFuncionarios);

				list.add(y);

			}
			
			System.out.println("Impostos pagos: ");
			for (Pessoa p : list) {
				System.out.println(p.getNome() + ": " + p.imposto() );
			}

		}
		teclado.close();

	}
}
