package br.ucsal;

import java.util.Scanner;

public class Laborat�rio28 {

	/* PROBLEMA: elabore uma solu��o para criar uma sequencia de n�meros inteiros de 1.000 e 1.500 (inclusive) composta
	 *  por valores que quando divididos por 11 produz resto igual a 5.
	 *  
	Ao final apresente as seguintes informa��es:
	
a) a sequencia impressa
b) quantos elementos fazem parte dessa sequencia
c) qual a soma de todos os n�meros dessa sequencia. */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int v1 = 1000; int seq = 0;int cont = 0;int soma = 0;
		
		while(v1 <= 1500) {
			if(v1 % 11 == 5) {
				
				
				
				cont++;
				soma = soma + v1;
				seq = v1;
				
				System.out.print(seq + " ");
			
			}
			
			v1++;
			
		}
		System.out.println("\nA soma � = " + soma);
		System.out.println("Quantidade de elementos = " + cont);
		
		
		
		sc.close();
	}

}
