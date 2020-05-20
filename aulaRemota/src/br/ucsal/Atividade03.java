package br.ucsal;

import java.util.Scanner;

public class Atividade03 {
	private static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		imprimir(obterNomes());
		imprimir(obterIdades());
	}

	public static String[] obterNomes () {
		String[] vetorNomes = new String [3];
		imprimir("Informe 3 nomes: ");

		for (int i = 0; i < vetorNomes.length; i++) {
			vetorNomes[i] = sc.nextLine();
		}
		return vetorNomes;
	}

	public static int[] obterIdades () {
		int[] vetorIdades = new int [3];

		imprimir("Informe 3 idades: ");
		int idade = 0, i = 0;

		while (i < vetorIdades.length) {
			idade = sc.nextInt();

			if (idade >= 20 && idade <= 30 ) {
				vetorIdades[i] = idade;
				i++;
			} else {
				imprimir("Fora do intervalo, digite novamente: ");
			}

		}


		return vetorIdades;
	}

	public static void imprimir(String txt) {
		System.out.println(txt);
	}

	public static void imprimir (int vlr) {
		System.out.println(vlr);
	}

	public static void imprimir (int[] idades) {
		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i] + " ");
		}
	}

	public static void imprimir (String[] nomes) {
		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i] + " ");
		}

	}
}
