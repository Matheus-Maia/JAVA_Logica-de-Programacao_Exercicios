package br.ucsal;

import java.util.Scanner;

public class Laboratório30_QualquerSequencia {
	
	/* PROBLEMA: Crie uma sequencia (PA) de valores inteiros, positivos iniciada com o valor 10 e razão 6, na qual o valor limite da
	 *  sequencia será informado pelo usuário, obedecendo aos seguintes critérios:
	 *  
(1) valor limite deve ser informado pelo usuário em um intervalo fechado de 50 e 100.
(2) Se o usuário informar qualquer valor fora desse intervalo, o algoritmo deverá permanecer solicitando o valor, até que esteja dentro
 do intervalo. A sequencia só será construída quando o usuário informar o valor dentro do intervalo.
 
Com base no texto acima, utilize a estrutura do/while para executar os solucionar abaixo:
a) Apresente a sequencia
b) Calcule a quantidade de elementos da sequencia
c) Calcule a média aritmética do primeiro e último valor da sequencia.
d) Identifique a quantidade de números pares existentes na sequencia
e) Identifique a quantidade de números ímpares existentes na sequencia
f) Identifique a quantidade de números ímpares divisíveis por 3 existentes na sequencia
g) Calcule a soma de todos os elementos da sequencia
h) Calcule a média ponderada do 13º e do 21º numero da sequencia, considerando os pesos 4 e 6 respectivamente.
Utilize a estrutura de repetição (do/while). */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int limite; double arithmetic = 0; int cont = 0; int pares = 0; int impares = 0; int imparpor3 = 0; int soma = 0; double ponderada1 = 0; double ponderada2 = 0;
		
		
		
		do {
			System.out.print("Informe um valor limite da sequência: ");
			limite = sc.nextInt();
			
			System.out.println(limite + " ");
			soma += limite;
			
			if(cont == 0 && limite % 2 == 0) {
				arithmetic = limite;
				pares = pares + 1;
			
			}else if(cont == 0 && limite % 2 != 0 && limite % 3 == 0) {
				arithmetic = limite;
				imparpor3 = imparpor3 + 1;
				impares = impares + 1;
			
			}else if(cont == 0 && limite % 2 != 0) {
				arithmetic = limite;
				impares = impares + 1;
		
			}else if (cont == 12 && limite % 2 == 0) {
				ponderada1 = limite * 4; 
				pares = pares + 1;
			
			}else if(cont == 12 && limite % 2 != 0 && limite % 3 == 0) {
				ponderada1 = limite * 4; 
				imparpor3 = imparpor3 + 1;
				impares = impares + 1;
			
			}else if(cont == 12 && limite % 2 != 0) {
				ponderada1 = limite * 4; 
				impares = impares + 1;
		
			}else if (cont == 20 && limite % 2 == 0) {
				ponderada2 = limite * 6; 
				pares = pares + 1;
			
			}else if(cont == 20 && limite % 2 != 0 && limite % 3 == 0) {
				ponderada2 = limite * 6;
				imparpor3 = imparpor3 + 1;
				impares = impares + 1;
			
			}else if(cont == 20 && limite % 2 != 0) {
				ponderada2 = limite * 6;
				impares = impares + 1;
		
			}else if(cont == 0) {
				arithmetic = limite;
			
			}else if (limite % 2 == 0){
				pares = pares + 1;
				
			}else if (limite % 2 != 0 && limite % 3 == 0) {
				imparpor3 = imparpor3 + 1;
				impares = impares + 1;
				
			}else if(limite % 2 != 0) {
				impares = impares + 1;
				
			}else if (cont == 12) {
				ponderada1 = limite * 4; 
			
			}else if (cont == 20) {
				ponderada2 = limite * 6;
			}
			
			cont++;
			
		}while(limite < 50 || limite > 100);
		
		arithmetic = (arithmetic + limite)/2;
		double mediaponderada = (ponderada1 + ponderada2)/10;
		
		System.out.println("a quantidade de elementos da sequencia é: " + cont);
		System.out.println("a média aritmética do primeiro e último valor da sequencia é: " + arithmetic);
		System.out.println("a quantidade de números pares existentes na sequencia é: " + pares);
		System.out.println("a quantidade de números ímpares existentes na sequencia é: " + impares);
		System.out.println("a quantidade de números ímpares divisíveis por 3 existentes na sequencia é: " + imparpor3);
		System.out.println("a soma de todos os elementos da sequencia é: " + soma);
		System.out.println("a média ponderada do 13º e do 21º numero da sequencia, considerando os pesos 4 e 6 respectivamente é: " + mediaponderada);
		
		
		
		
		
		sc.close();

		
		
	}

}
