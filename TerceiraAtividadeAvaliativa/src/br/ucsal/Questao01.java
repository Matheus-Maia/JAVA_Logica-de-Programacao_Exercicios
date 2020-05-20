package br.ucsal;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		obterDados();
	}
	public static void obterDados() {
		Scanner sc = new Scanner(System.in);
		int valor1;
		
		do { imprima ("Informe um valor inteiro positivo dentro de um intervalo fechado de 500 a 1000: ");
		valor1 = sc.nextInt();
		
		} while (valor1 < 500 || valor1 > 1000);
		
		imprima ("O valor informado foi: " + valor1);
		
		sc.close();
	}
	
	public static void imprima ( String string) {
		System.out.println(string);
	}

}