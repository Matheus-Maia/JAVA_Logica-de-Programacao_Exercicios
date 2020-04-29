package br.ucsal;

import java.util.Scanner;

public class Calculando {
	
	/* Problema: o usu�rio dever� informar dois valores e escolher se quer efetuar
	 * uma opera��o de (1) Soma, (2) Subtra��o, (3) Divis�o ou (4) Multiplica��o.
	 * Ao final a opera��o dever� ser realizada. */

	public static void main(String[] args) {
		obterDados ();

	}
	
	public static void obterDados () {
		Scanner sc = new Scanner (System.in);
		
		imprimir(" Informe dois valores inteiros: ");
		int valor1 = sc.nextInt();
		int valor2 = sc.nextInt();
		
		imprimir("Qual opera��o voce deseja efetuar? Digite (1) para Somar, (2) para Subtra��o, (3) para Divis�o ou (4) para Multiplica��o ");
		int operacao = sc.nextInt(); 
		
		escolherOperacao(operacao, valor1, valor2);
		
		
		sc.close();
	}
	
	public static void escolherOperacao (int valor, int pri, int seg) {
		
		
		switch (valor) {
		case 1:
			imprimir(" A soma dos dois valores �: " + soma(pri, seg));
			
			break;
			
		case 2:
			imprimir(" A subtra��o dos dois valores �: " + subtracao(pri, seg) );
			
			break;
			
		case 3:
			imprimir(" A divis�o dos dois valores �: " + divisao(pri, seg) );
			
			break;
			
		case 4:
			imprimir(" A multiplica��o dos dois valores �: " + multiplicacao(pri, seg) );
			
			break;

		default:
			imprimir("ERRO! Informe (1) Soma, (2) Subtra��o, (3) Divis�o ou (4) Multiplica��o ");
			break;
		}
		
		
	}
	
	public static int soma (int pri, int seg) {
		return pri + seg;
		
	}
	
	public static int subtracao (int pri, int seg) {
		return pri - seg;
		
	}
	
	public static int divisao (int pri, int seg) {
		return pri / seg;
		
	}
	
	public static int multiplicacao (int pri, int seg) {
		return pri * seg;
		
	}
	
	public static void imprimir (String txt) {
		System.out.print(txt);
	}
	

}
