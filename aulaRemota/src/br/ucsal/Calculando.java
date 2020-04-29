package br.ucsal;

import java.util.Scanner;

public class Calculando {
	
	/* Problema: o usuário deverá informar dois valores e escolher se quer efetuar
	 * uma operação de (1) Soma, (2) Subtração, (3) Divisão ou (4) Multiplicação.
	 * Ao final a operação deverá ser realizada. */

	public static void main(String[] args) {
		obterDados ();

	}
	
	public static void obterDados () {
		Scanner sc = new Scanner (System.in);
		
		imprimir(" Informe dois valores inteiros: ");
		int valor1 = sc.nextInt();
		int valor2 = sc.nextInt();
		
		imprimir("Qual operação voce deseja efetuar? Digite (1) para Somar, (2) para Subtração, (3) para Divisão ou (4) para Multiplicação ");
		int operacao = sc.nextInt(); 
		
		escolherOperacao(operacao, valor1, valor2);
		
		
		sc.close();
	}
	
	public static void escolherOperacao (int valor, int pri, int seg) {
		
		
		switch (valor) {
		case 1:
			imprimir(" A soma dos dois valores é: " + soma(pri, seg));
			
			break;
			
		case 2:
			imprimir(" A subtração dos dois valores é: " + subtracao(pri, seg) );
			
			break;
			
		case 3:
			imprimir(" A divisão dos dois valores é: " + divisao(pri, seg) );
			
			break;
			
		case 4:
			imprimir(" A multiplicação dos dois valores é: " + multiplicacao(pri, seg) );
			
			break;

		default:
			imprimir("ERRO! Informe (1) Soma, (2) Subtração, (3) Divisão ou (4) Multiplicação ");
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
