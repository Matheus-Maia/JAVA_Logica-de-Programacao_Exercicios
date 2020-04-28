package br.ucsal;

import java.util.Scanner;

public class Laboratório03 {

	/* Problema: elabore uma solução para criar uma calculadora que execute as quatro operações básicas 
	 * (somar, subtrair, dividir e multiplicar) a partir de dois valores inteiros, positivos informados
	 *  pelo usuário.*/

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);

		System.out.println("Digite dois (02) números inteiros e positivos: ");
		double valor1 = ent.nextDouble();
		double valor2 = ent.nextDouble();

		if (valor1 < 0 || valor2 < 0) {
			System.out.println("ERRO! Informe apenas números inteiros ou positivos. ");

		}else {
			System.out.println("Qual operação voce deseja realizar? Digite (1) para somar; (2) para subtrair; (3) para dividir e (4) para multiplicar. ");
			int operacao = ent.nextInt();

			switch (operacao) {
			case 1:
				double resultado = valor1 + valor2;
				System.out.println("O resultado dessa operacao é: " + resultado);

				break;

			case 2:
				resultado = valor1 - valor2;
				System.out.println("O resultado dessa operacao é: " + resultado);

				break;

			case 3:
				resultado = valor1 / valor2;
				System.out.println("O resultado dessa operacao é: " + resultado);

				break;

			case 4:
				resultado = valor1 * valor2;
				System.out.println("O resultado dessa operacao é: " + resultado);

				break;

			default:
				System.out.println("ERRO! Informe qual operação deseja realizar sendo (1) para somar; (2) para subtrair; (3) para dividir e (4) para multiplicar.");
				break;
			}
		}


		ent.close();
	}

}
