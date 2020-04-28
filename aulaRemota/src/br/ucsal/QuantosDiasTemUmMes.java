package br.ucsal;

import java.util.Scanner;
/* PROBLEMA: a partir de um mês informado pelo usuário escreva quantos dias tem esse mês.
O mês deve ser informado com as três primeiras letras do mês. Considere o mês de FEV se 29 ou 28 dias conforme o ano.
Utilize obrigatoriamente a estrutura switch / case.*/

public class QuantosDiasTemUmMes {

	public static void main(String[] args) {
		Scanner ent = new Scanner (System.in);

		System.out.println("Informe as três primeiras letras de um mês: ");
		String diasdomes = ent.next().toUpperCase();

		switch (diasdomes) {
		case "JAN": case "MAR": case "MAI": case "JUL": case "AGO": case "OUT": case "DEZ":;

		System.out.println("O mês de " + diasdomes + " possui 31 dias.");
		break;
		
		case "ABR": case "JUN": case "SET": case "NOV":;
		
		System.out.println("O mês de " + diasdomes + " possui 30 dias.");
		
		break;
		
		case "FEV":;
		
		System.out.println("Um ano é bissexto a cada 4 anos. O ano de 2020 é bissexto. Esse ano é bissexto? (Sim) / (Não) ");
		String bissexto = ent.next().toLowerCase();
		
		switch (bissexto) {
		case "sim":;
		System.out.println("O mês de " + diasdomes + " possui 29 dias.");
			break;
			
		case "não": case "nao":;
		System.out.println("O mês de " + diasdomes + " possui 28 dias.");
			break;
			
		default:
			System.out.println("ERRO! Digite apenas sim ou não.");
			break;
		}
		
		break;
		default:
			System.out.println("Voce informou um mês incorretamente. Digite apenas 3 letras do mês desejado.");
			break;
		}
		ent.close();
	}

}
