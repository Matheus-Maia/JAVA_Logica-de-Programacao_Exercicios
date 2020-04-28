package br.ucsal;

import java.util.Scanner;

public class Questao03 {
	/* PROBLEMA: a partir de uma sequencia de 50 numeros inteiros, positivos iniciada pelo valor 37 composta por valores 
	 * (dividendos) que quando divididos por 17 (divisor) obtem resto igual a 3, calcule a soma de todos os valores da sequencia
	 *  e acrescente (some mais) o resultado obtido da media aritmetica obtida com o 27 e 46 elementos da sequencia */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int valor = 37, cont = 0, soma = 0;
		double valor1 = 0, valor2 = 0, mediaAritmetica, somaFinal;
		
		System.out.println("A sequencia é");
		
		while(cont < 50) {
			if(valor % 17 == 3) {
				System.out.print(valor + " ");
				soma += valor;
				cont++;
			}
			
			valor++;
			
			if (cont == 26) {
				valor1 = valor;
			}
			if(cont == 45) {
				valor2 = valor;
			}
			
			
			
		}
		mediaAritmetica = (valor1 + valor2)/2;
		somaFinal = mediaAritmetica + soma;
		
		System.out.println("\n"+ valor1 + " " + valor2 + " ");
		
		System.out.println("\ncalcule a soma de todos os valores da sequencia e acrescente (some mais) o resultado obtido da media aritmetica obtida com o 27 e 46 elementos da sequencia: " + somaFinal);
		
		sc.close();

	}

}
