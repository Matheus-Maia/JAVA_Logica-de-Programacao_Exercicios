package br.ucsal;

import java.util.Scanner;

public class Laborat�rio14 {

	/* PROBLEMA: Uma empresa concede empr�stimo at� o limite de 30% do sal�rio base (incluindo as taxas). 
	 * A partir dessa informa��o, construa uma solu��o que obtenha o valor do sal�rio base do cliente, 
	 * identifique o valor m�ximo que pode ser tomado como empr�stimo, calcule a taxa cobrada sobre o 
	 * valor solicitado (conforme tabela abaixo), obtenha o valor do empr�stimo solicitado pelo cliente 
	 * e informe o valor recebido pelo cliente ou a nega��o do empr�stimo conforme regra definida.
	 * 
	 * Calculo da Taxa de administra��o:
	 * at� 1.000,00 ........................................  2,5%
	 * acima de 1.000,00 at� 2.000,00 ......................  3,4%
	 * acima de 2.000,00 ...................................  4,2%
	 * 
	 * Observe o exemplo abaixo a sa�da apresentada no eclipse:
	 * 
	 * Digite seu sal�rio base: R$ 5000
	 * Considerando o sal�rio informado a taxa cobrada ser� de : 0.034
	 * portanto, o valor m�ximo para empr�stimo ser� R$ 1449.0
	 * Digite quanto deseja obter de empr�stimo: 1200
	 * Valor a ser creditado do empr�stimo: 1159.2 
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
		System.out.println("Valor a ser recebido como empr�stimo: " + (baseEmprestimo-valorDesconto));
		System.out.println("==========================\n");

		System.out.print("Deseja pegar o total do empr�stimo? (valor cheio)");
		boolean resp = sc.nextBoolean();
		System.out.println("Resposta do usu�rio: " + (resp == true ? "SIM" : "N�O"));

		double valorSolicitado;
		if(resp == true) {
			System.out.println("\n==========================");
			System.out.println("Valor emprestado: R$ " + (baseEmprestimo-valorDesconto));
			System.out.println("==========================\n");
		} else {

			System.out.print("\nent�o, quanto deseja obter de empr�stimo? ");
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
				System.out.println("Valor recebido como empr�stimo: " + (valorSolicitado-valorDesconto));
				System.out.println("==========================\n");

			} else {
				System.out.println("\nliberado " + (baseEmprestimo-valorDesconto));
			}
		}



		sc.close();	
	}

}