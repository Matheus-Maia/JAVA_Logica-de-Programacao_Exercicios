package br.ucsal;

import java.util.Scanner;

public class Laboratório14 {

	/* PROBLEMA: Uma empresa concede empréstimo até o limite de 30% do salário base (incluindo as taxas). 
	 * A partir dessa informação, construa uma solução que obtenha o valor do salário base do cliente, 
	 * identifique o valor máximo que pode ser tomado como empréstimo, calcule a taxa cobrada sobre o 
	 * valor solicitado (conforme tabela abaixo), obtenha o valor do empréstimo solicitado pelo cliente 
	 * e informe o valor recebido pelo cliente ou a negação do empréstimo conforme regra definida.
	 * 
	 * Calculo da Taxa de administração:
	 * até 1.000,00 ........................................  2,5%
	 * acima de 1.000,00 até 2.000,00 ......................  3,4%
	 * acima de 2.000,00 ...................................  4,2%
	 * 
	 * Observe o exemplo abaixo a saída apresentada no eclipse:
	 * 
	 * Digite seu salário base: R$ 5000
	 * Considerando o salário informado a taxa cobrada será de : 0.034
	 * portanto, o valor máximo para empréstimo será R$ 1449.0
	 * Digite quanto deseja obter de empréstimo: 1200
	 * Valor a ser creditado do empréstimo: 1159.2 
	 * */	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Qual o salario Base? "); 
		double salarioBase = sc.nextDouble();

		System.out.println("\n==========================");
		double baseEmprestimo = salarioBase * 0.30;
		System.out.println("Valor Base Emprestimo: " + baseEmprestimo);

		// Aplicando desconto ( identificando a TAXA)
		double valorDesconto;
		if(baseEmprestimo <= 1000) {
			valorDesconto = baseEmprestimo * 0.025;
		} else if (baseEmprestimo <= 2000) {
			valorDesconto = baseEmprestimo * 0.034;
		} else {
			valorDesconto = baseEmprestimo * 0.042;
		}

		System.out.println("Valor do desconto: " + valorDesconto);
		System.out.println("Valor a ser recebido como empréstimo: " + (baseEmprestimo-valorDesconto));
		System.out.println("==========================\n");

		System.out.print("Deseja pegar o total do empréstimo? (valor cheio)");
		boolean resp = sc.nextBoolean();
		System.out.println("Resposta do usuário: " + (resp == true ? "SIM" : "NÃO"));

		double valorSolicitado;
		if(resp == true) {
			System.out.println("\n==========================");
			System.out.println("Valor emprestado: R$ " + (baseEmprestimo-valorDesconto));
			System.out.println("==========================\n");
		} else {

			System.out.print("\nentão, quanto deseja obter de empréstimo? ");
			valorSolicitado = sc.nextDouble();
			if(valorSolicitado < baseEmprestimo) {

				if(valorSolicitado <= 1000) {
					valorDesconto = valorSolicitado * 0.025;
				} else if (valorSolicitado <= 2000) {
					valorDesconto = valorSolicitado * 0.034;
				} else {
					valorDesconto = valorSolicitado * 0.042;
				}

				System.out.println("\n==========================");
				System.out.println("Valor do desconto: " + valorDesconto);
				System.out.println("Valor recebido como empréstimo: " + (valorSolicitado-valorDesconto));
				System.out.println("==========================\n");

			} else {
				System.out.println("\nliberado " + (baseEmprestimo-valorDesconto));
			}
		}



		sc.close();	
	}

}