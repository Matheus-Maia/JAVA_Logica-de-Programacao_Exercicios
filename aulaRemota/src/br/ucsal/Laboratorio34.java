package br.ucsal;

import java.util.Scanner;

/* PROBLEMA: a partir de no nome completo qualquer, atribu�do a uma vari�vel com tipo String, construa os
 *  m�todos espec�ficos para solucionar cada quest�o abaixo:
 *  
a) Nome do M�todo: obterDados. Cont�m a vari�vel nome com o nome completo qualquer
b) Nome do M�todo: imprimir. Recebe a String no par�metro e imprime
c) Nome do M�todo: sobrenomeNome. Recebe o nome e executa o m�todo de impress�o com o sobrenome, uma v�rgula e o resto do nome
d) Nome do M�todo: primeirasLetras. Recebe o nome e executa o m�todo de impress�o com as primeiras letras de cada nome
e) Nome do M�todo: arrumaTexto. Recebe o nome e executa o m�todo de impress�o com as primeiras letras de cada
 nome em letras mai�sculas e as demais em min�sculas, independente de como foi informado. */

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