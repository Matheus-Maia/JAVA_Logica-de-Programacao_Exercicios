package br.ucsal;

import java.util.Scanner;

public class Questao02 {
	/*PROBLEMA: crie uma seuqencia de progressao geometrica PG formada por valores inteiros, positivos na qual o último 
	 * valor nao ultrapasse 800000 iniciada com o valor 4 e razao 3 e obtrenha a media ponderada entre o 8 e 11 elemento, 
	 * considerando os pesos 8 e 2 respectivamente. */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int valor = 4, razao = 3, cont = 0, peso1 = 8, peso2 = 2;
		double  mediaPonderada, valor1 = 0, valor2 = 0;
		
		System.out.println("A sequencia é: ");
		
		while(valor < 800000) {
			System.out.print(valor + " ");
			valor *= razao;
			cont++;
			if (cont == 7) {
				valor1 = valor;
				
			}
			if(cont == 10) {
				valor2 = valor;
			}
			
		}
		
		mediaPonderada = ((valor1 * peso1) + (valor2 * peso2))/10;
		
		System.out.println("\nA media ponderada entre o 8 elemento e o 11 elemento é: " + mediaPonderada);
		
		sc.close();

	}

}
