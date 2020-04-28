package br.ucsal;

import java.util.Scanner;

/*PROBLEMA: informar o dia da semana por extenso a partir de valor inteiro definido pelo usu�rio.
Utilize obrigatoriamente a estrutura switch / case.*/

public class DiaDaSemana {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
	
		System.out.println("Digite o dia da semana de 1 a 7 onde 1 � Domingo e 7 � S�bado: ");
		int dia = ent.nextInt();
		
		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
			
		case 2:
			System.out.println("Segunda");
			break;
			
		case 3:
			System.out.println("Ter�a");
			break;
			
		case 4:
			System.out.println("O dia da semana correspondente �: Quarta-feira.");
			break;
			
		case 5:
			System.out.println("Quinta");
			break;
			
		case 6:
			System.out.println("Sexta");
			break;
			
		case 7:
			System.out.println("S�bado");
			break;
		default:
			System.out.println("ERRO! Insira um n�mero de 1 a 7.");
			break;
		}
		
		
		ent.close();
		
	}

}
