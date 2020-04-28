package br.ucsal;

import java.util.Scanner;

public class Laboratório27 {
	
	/* PROBLEMA: elabore uma solução para imprimir uma seqüência de nove (09) valores inteiros positivos, iniciada pelos
	 *  números 1 e 2, onde os valores seguintes (posteriores) deverão ser obtidos pela multiplicação dos dois números 
	 *  imediatamente anteriores.
	 *  
	Ao final apresente as seguintes informações:
	
a) A seqüência impressa
b) A média aritmética obtida com o 7º e o último número da seqüência
c) A soma de todos os números da seqüência
d) A soma de todos os números divisíveis por 4 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int v1 = 1; int v2 = 2; int seq; int cont = 1; int soma = 0; int media = 0; int somadiv = 0;
		
		System.out.print("A sequência impressa -> ");
		
		while (cont <= 9) {
			System.out.print(v1 + " ");
			
			if (cont == 7 || cont == 9) {
				media += v1;		
			}
			
			if (v1 % 4 == 0) {
				somadiv += v1;
			}
			
			seq = v1 * v2;
			soma = soma + v1;
			v1 = v2;
			v2 = seq;
			
			cont++ ;
		
		}
		System.out.println("\n A soma de todos os números da sequência -> " + soma);
		System.out.println("A soma de todos os números da sequência divisíveis por 4 -> " + somadiv);
		System.out.println("A média aritmética dos números 7 e 9 da sequência -> " + (media/2));
		
		
		
		
sc.close();

	}

}
