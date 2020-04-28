package br.ucsal;

import java.util.Scanner;

public class Laboratório20 {

	/* PROBLEMA: formular um problema qualquer que ainda não tenha sido apresentado em nenhum dos laboratórios disponibilizados
	 *  no Grupo 2 (não pode repetir o problema) e que seja solucionado utilizando obrigatoriamente as estruturas switch / case 
	 *  e if / (else if ) / else (não pode utilizar nenhuma outra estrutura).
	 *  
Apresente o problema em comentário de múltiplas linhas e a respectiva solução na classe Java correspondente. */

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);

		System.out.println("Informe dois (02) valores inteiros qualquer: ");
		int valor1 = ent.nextInt(); int valor2 = ent.nextInt();

		int resultado = valor1 + valor2, chave = 0;

		if (resultado % 2 != 0) {
			System.out.println(resultado + " O resultado dessa soma é um número ímpar.");
			chave = 1;
		}else if (resultado % 2 == 0) {
			System.out.println(resultado + " O resultado dessa soma é um número par.");
			chave = 2;

		}else {
			System.out.println("Digite apenas números inteiros.");
		}

		switch (chave) {
		case 1:
			if(resultado % 3 == 0 ) {
				System.out.println("Este número é divisível por 3.");
			}else {
				System.out.println("Este número NÃO é divisível por 3.");
			}

			break;
		case 2:
			if(resultado % 5 == 0 ) {
				System.out.println("Este número é divisível por 5.");
			}else {
				System.out.println("Este número NÃO é divisível por 5.");
			}

			break;

		}


		ent.close();
	}
}

