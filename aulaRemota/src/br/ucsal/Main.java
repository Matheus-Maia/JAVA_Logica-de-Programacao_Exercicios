package br.ucsal;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		imprimir("Informe 3 nomes: ");
		imprimir(obterNomes(sc));
		imprimir("Informe 3 idades: ");
		imprimir(obterIdades(sc));
	}

	public static String[] obterNomes(Scanner sc) {
		String[] vetorNomes = new String [3];
		for (int i = 0; i < vetorNomes.length; i++) {
			vetorNomes[i] = sc.next();
		}
		return vetorNomes;
	}

	public static int[] obterIdades(Scanner sc) {
		int[] vetorIdades = new int [3];
		int var = 0, i = 0;
		while (i < vetorIdades.length) {
			var = sc.nextInt();
			if (var >= 20 && var <= 30 ) {
				vetorIdades[i] = var;
				i++;
			} else {
				imprimir("fora do intervalo, tente novamente");
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
