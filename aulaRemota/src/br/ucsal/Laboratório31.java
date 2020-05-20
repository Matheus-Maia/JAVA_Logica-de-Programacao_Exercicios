package br.ucsal;

import java.util.Scanner;

/* PROBLEMA: elabore uma sequencia (PG) de raz�o 5, contendo 10 elementos, cujo valor inicial ser� informado pelo usu�rio
 *  dentro de um intervalo fechado de 50 a 60. O usuario s� poder� informar errado 03 vezes, passou desse n�mero o mesmo 
 *  deve apresentar mensagem de fim da execu��o por ter informado o valor errado e n�o apresenta a sequencia. Utilize a 
 *  estrutura "for" */

public class Laborat�rio31 {
	private static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		obterDados();
	}

	public static void obterDados () {
		int valor, cont = 0;
		String imprima = "Fim da execu��o";
		do {
			valor = sc.nextInt();
			cont++;
		} while ((valor < 50 || valor > 60) && cont < 3);
		solucao(imprima, valor);
	}

	public static void solucao(String imprima, int valor) {
		if (valor >= 50  && valor <= 60) {
			for (int i = 0; i < 10; i++) {
				imprimir(valor);
				valor *= 5; 
			} 
		} else {
			imprimir(imprima);
		}
	}


	public static void imprimir (int num) {
		System.out.print(num + " ");
	}

	public static void imprimir (String txt) {
		System.out.print(txt + " ");
	}

}
