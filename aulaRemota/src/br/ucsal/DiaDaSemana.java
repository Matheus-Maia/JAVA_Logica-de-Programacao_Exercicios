package br.ucsal;

import java.util.Scanner;

/*PROBLEMA: informar o dia da semana por extenso a partir de valor inteiro definido pelo usuário.
Utilize obrigatoriamente a estrutura switch / case.*/

public class DiaDaSemana {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
	
		System.out.println("Digite o dia da semana de 1 a 7 onde 1 é Domingo e 7 é Sábado: ");
		int dia = ent.nextInt();
		
		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
			
		case 2:
			System.out.println("Segunda");
			break;
			
		case 3:
			System.out.println("Terça");
			break;
			
		case 4:
			System.out.println("O dia da semana correspondente é: Quarta-feira.");
			break;
			
		case 5:
			System.out.println("Quinta");
			break;
			
		case 6:
			System.out.println("Sexta");
			break;
			
		case 7:
			System.out.println("Sábado");
			break;
		default:
			System.out.println("ERRO! Insira um número de 1 a 7.");
			break;
		}
		
		
		ent.close();
		
	}

}
