package br.ucsal;

import java.util.Scanner;

/* PROBLEMA: a partir de no nome completo qualquer, atribuído a uma variável com tipo String, construa os
 *  métodos específicos para solucionar cada questão abaixo:
 *  
a) Nome do Método: obterDados. Contém a variável nome com o nome completo qualquer
b) Nome do Método: imprimir. Recebe a String no parâmetro e imprime
c) Nome do Método: sobrenomeNome. Recebe o nome e executa o método de impressão com o sobrenome, uma vírgula e o resto do nome
d) Nome do Método: primeirasLetras. Recebe o nome e executa o método de impressão com as primeiras letras de cada nome
e) Nome do Método: arrumaTexto. Recebe o nome e executa o método de impressão com as primeiras letras de cada
 nome em letras maiúsculas e as demais em minúsculas, independente de como foi informado. */

public class Laboratorio34 {

	public static void main(String[] args) {
		obterDados();

	}

	public static void imprimir (String txt) {
		System.out.print(txt);
	}

	public static void obterDados () {
		Scanner sc = new Scanner (System.in);

		imprimir("Digite seu nome completo: ");
		String nomeCompleto = sc.nextLine();

		sobrenomeNome(nomeCompleto);
		primeirasLetras(nomeCompleto);
		arrumaTexto(nomeCompleto);

		sc.close();
	}

	public static void sobrenomeNome (String sobrenomeMaisNome) {
		for (int var = 0; var < sobrenomeMaisNome.length(); var++) {
			if (sobrenomeMaisNome.substring(var, var + 1).equals(" ")) {
				imprimir(sobrenomeMaisNome.substring (var + 1, sobrenomeMaisNome.length()).toUpperCase());
				var = sobrenomeMaisNome.length();
			}
		}

		imprimir (", ");
		for (int var = 0; var < sobrenomeMaisNome.length(); var++) {
			imprimir (sobrenomeMaisNome.substring(var, var + 1).toUpperCase());

			if (sobrenomeMaisNome.substring(var, var + 1).equals(" ")) {
				var = sobrenomeMaisNome.length();
			}
		}
	}

	public static void primeirasLetras (String nomePrimeiraLetra) {
		imprimir("\n\n");
		imprimir (nomePrimeiraLetra.substring(0,1).toUpperCase());

		for (int var = 0; var < nomePrimeiraLetra.length(); var++) {
			if (nomePrimeiraLetra.substring(var, var + 1).equals(" ")) {
				imprimir (nomePrimeiraLetra.substring(var + 1, var + 2).toUpperCase());
			}
		}

	}

	public static void arrumaTexto (String arrumaTextoNome) {
		imprimir("\n\n");
		imprimir (arrumaTextoNome.substring(0,1).toUpperCase());
		
		for (int var = 1; var < arrumaTextoNome.length(); var++) {
			imprimir(arrumaTextoNome.substring(var, var + 1).toLowerCase());
			if (arrumaTextoNome.substring(var, var + 1).equals(" ")) {
				imprimir (arrumaTextoNome.substring(var + 1 , var + 2).toUpperCase());
				var = var + 1;
			}
		}
		
	}
}