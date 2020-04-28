package br.ucsal;

import java.util.Scanner;

public class Laborat�rio30 {
	
	/* PROBLEMA: Crie uma sequencia (PA) de valores inteiros, positivos iniciada com o valor 10
	 * e raz�o 6, na qual o valor limite da sequencia ser� informado pelo usu�rio, obedecendo
	 * aos seguintes crit�rios:
	 * (1) valor limite deve ser informado pelo usu�rio em um intervalo fechado de 50 e 100.
	 * (2) Se o usu�rio informar qualquer valor fora desse intervalo, o algoritmo dever� permanecer
	 * solicitando o valor, at� que esteja dentro do intervalo. A sequencia s� ser� constru�da
	 * quando o usu�rio informar o valor dentro do intervalo.
	 * 
	 * Com base no texto acima, utilize a estrutura {do/while} para executar os solucionar
	 * abaixo:
	 * a) Apresente a sequencia;
	 * b) Calcule a quantidade de elementos da sequencia;
	 * c) Calcule a m�dia aritm�tica do primeiro e �ltimo valor da sequencia;
	 * d) Identifique a quantidade de n�meros pares existentes na sequencia;
	 * e) Identifique a quantidade de n�meros �mpares existentes na sequencia;
	 * f) Identifique a quantidade de n�meros �mpares divis�veis por 3 existentes na sequencia;
	 * g) Calcule a soma de todos os elementos da sequencia;
	 * h) Calcule a m�dia ponderada do 13� e do 21� numero da sequencia, considerando os pesos 4 e
	 * 6 respectivamente.
	 * */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int seq = 10; int limite; double arithmetic = 0; int cont = 0; int pares = 0; int impares = 0; int imparpor3 = 0; int soma = 0; double ponderada1 = 0; double ponderada2 = 0;
		
		
		
		do {
			System.out.print("Informe o valor limite da sequ�ncia: ");
			limite = sc.nextInt();
		}while(limite < 50 || limite > 100);
		
		do {
			
			soma += seq;
			
			if(seq < limite) {
			System.out.print(seq + " ");
			}
			
			
			if(cont == 0 && seq % 2 == 0) {
				arithmetic = seq;
				pares = pares + 1;
			
			}else if(cont == 0 && seq % 2 != 0 && seq % 3 == 0) {
				arithmetic = seq;
				imparpor3 = imparpor3 + 1;
				impares = impares + 1;
			
			}else if(cont == 0 && seq % 2 != 0) {
				arithmetic = seq;
				impares = impares + 1;
		
			}else if (cont == 12 && seq % 2 == 0) {
				ponderada1 = seq * 4; 
				pares = pares + 1;
			
			}else if(cont == 12 && seq % 2 != 0 && seq % 3 == 0) {
				ponderada1 = seq * 4; 
				imparpor3 = imparpor3 + 1;
				impares = impares + 1;
			
			}else if(cont == 12 && seq % 2 != 0) {
				ponderada1 = seq * 4; 
				impares = impares + 1;
		
			}else if (cont == 20 && seq % 2 == 0) {
				ponderada2 = seq * 6; 
				pares = pares + 1;
			
			}else if(cont == 20 && seq % 2 != 0 && seq % 3 == 0) {
				ponderada2 = seq * 6;
				imparpor3 = imparpor3 + 1;
				impares = impares + 1;
			
			}else if(cont == 20 && seq % 2 != 0) {
				ponderada2 = seq * 6;
				impares = impares + 1;
		
			}else if(cont == 0) {
				arithmetic = seq;
			
			}else if (seq % 2 == 0){
				pares = pares + 1;
				
			}else if (seq % 2 != 0 && seq % 3 == 0) {
				imparpor3 = imparpor3 + 1;
				impares = impares + 1;
				
			}else if(seq % 2 != 0) {
				impares = impares + 1;
				
			}else if (cont == 12) {
				ponderada1 = seq * 4; 
			
			}else if (cont == 20) {
				ponderada2 = seq * 6;
			}
			
			cont++;
			seq = seq + 6;
		}while(seq < limite);
		
		
		
		arithmetic = (arithmetic + seq - 6)/2;
		double mediaponderada = (ponderada1 + ponderada2)/10;
		
		System.out.println("\na quantidade de elementos da sequencia �: " + cont);
		System.out.println("a m�dia aritm�tica do primeiro e �ltimo valor da sequencia �: " + arithmetic);
		System.out.println("a quantidade de n�meros pares existentes na sequencia �: " + pares);
		System.out.println("a quantidade de n�meros �mpares existentes na sequencia �: " + impares);
		System.out.println("a quantidade de n�meros �mpares divis�veis por 3 existentes na sequencia �: " + imparpor3);
		System.out.println("a soma de todos os elementos da sequencia �: " + soma);
		System.out.println("a m�dia ponderada do 13� e do 21� numero da sequencia, considerando os pesos 4 e 6 respectivamente �: " + mediaponderada);
		
		
		
		sc.close();

		
		
	}

}
