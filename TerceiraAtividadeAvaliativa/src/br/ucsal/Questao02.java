package br.ucsal;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		obterDados();

	}
	
	public static void obterDados () {
		Scanner sc = new Scanner (System.in);
		System.out.println("Informe o primeiro valor: ");
		double valor;
		int cont = 0;
		
		do { valor = sc.nextDouble();
		cont++;
		} while ((valor < 50 || valor > 60) && cont <= 2);
		
		operacao(valor, cont);
		
		
		sc.close();
	}
	
	public static void operacao (double num, int num1) {
		
		int cont = 0;
		double progressaoGeometrica = num;
		final int RAZAO = 5;
		
		if (num1 > 2 && num < 50 || num > 60) {
			System.out.println("Fim da execução do programa.");
		} else {
			for (cont = 0; cont < 9; cont++) {
				progressaoGeometrica *= RAZAO;
				System.out.println(progressaoGeometrica);
				
			}
			
			
		}
		
	}

}
