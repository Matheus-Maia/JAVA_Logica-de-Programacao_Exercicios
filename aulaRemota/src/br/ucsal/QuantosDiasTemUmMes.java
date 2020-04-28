package br.ucsal;

import java.util.Scanner;
/* PROBLEMA: a partir de um m�s informado pelo usu�rio escreva quantos dias tem esse m�s.
O m�s deve ser informado com as tr�s primeiras letras do m�s. Considere o m�s de FEV se 29 ou 28 dias conforme o ano.
Utilize obrigatoriamente a estrutura switch / case.*/

public class QuantosDiasTemUmMes {

	public static void main(String[] args) {
		Scanner ent = new Scanner (System.in);

		System.out.println("Informe as tr�s primeiras letras de um m�s: ");
		String diasdomes = ent.next().toUpperCase();

		switch (diasdomes) {
		case "JAN": case "MAR": case "MAI": case "JUL": case "AGO": case "OUT": case "DEZ":;

		System.out.println("O m�s de " + diasdomes + " possui 31 dias.");
		break;
		
		case "ABR": case "JUN": case "SET": case "NOV":;
		
		System.out.println("O m�s de " + diasdomes + " possui 30 dias.");
		
		break;
		
		case "FEV":;
		
		System.out.println("Um ano � bissexto a cada 4 anos. O ano de 2020 � bissexto. Esse ano � bissexto? (Sim) / (N�o) ");
		String bissexto = ent.next().toLowerCase();
		
		switch (bissexto) {
		case "sim":;
		System.out.println("O m�s de " + diasdomes + " possui 29 dias.");
			break;
			
		case "n�o": case "nao":;
		System.out.println("O m�s de " + diasdomes + " possui 28 dias.");
			break;
			
		default:
			System.out.println("ERRO! Digite apenas sim ou n�o.");
			break;
		}
		
		break;
		default:
			System.out.println("Voce informou um m�s incorretamente. Digite apenas 3 letras do m�s desejado.");
			break;
		}
		ent.close();
	}

}
