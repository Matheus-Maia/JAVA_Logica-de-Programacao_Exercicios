package br.ucsal;

import java.util.Scanner;

public class Laboratório08 {
	/* PROBLEMA: a partir de qualquer mês de qualquer ano informado pelo usuário (apenas esses dois dados), o algoritmo deverá 
	 * informar quantos dias tem o mês do respetivo ano informado. Considere o mês de FEV tendo 28 ou 29 dias, com base no ano bissexto.
Exemplos:
1º exemplo) O usuário informa ano 1979 e o mês "JAN", o algoritmo deverá retornar 31 dias;
2º exemplo) O usuário informa ano 2016 e o mês "ABR", o algoritmo deverá retornar 30 dias;
3º exemplo) O usuário informa ano 1992 e o mês "FEV", o algoritmo deverá retornar 29 dias;
4º exemplo) O usuário informa ano 2005 e o mês "FEV", o algoritmo deverá retornar 28 dias.

Regras:

1) Para obter a informação se o ano é bissexto ou não: ((o ano deve ser ao mesmo tempo divisível por 4 e não ser divisível por 100) 
ou (o ano deve ser divisível por 400)).
Fonte: https://pt.wikipedia.org/wiki/Ano_bissexto

2) O ano deve ser informado com o valor inteiro e o mês deve ser informado com as três primeiras letras do mês.

3) Na solução deve-se utilizar obrigatoriamente as estruturas do java: seleção (switcht) e decisão (if).
	 */

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);

		System.out.println("Informe as três primeiras letras de um mês e depois o ano desejado.");
		System.out.print("Mês: ");
		String mes = ent.next().toUpperCase();
		System.out.print("Ano: ");
		int ano = ent.nextInt();

		switch (mes) {
		case "JAN": case "MAR": case "MAI": case "JUL": case "AGO": case "OUT": case "DEZ":;

		System.out.println("O mês de " + mes + " no ano de " + ano + " possui 31 dias.");
		break;

		case "ABR": case "JUN": case "SET": case "NOV":;

		System.out.println("O mês de " + mes + " no ano de " + ano + " possui 30 dias.");

		break;

		case "FEV":;

		if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
			System.out.println("O mês de " + mes + " no ano de " + ano + " possui 29 dias.");


		} else {
			System.out.println("O mês de " + mes + " no ano de " + ano + " possui 28 dias.");
		}
		break;


		default:
			System.out.println("Voce informou um mês ou ano incorretamente. Digite apenas 3 letras do mês desejado ou 4 números inteiros para o ano desejado.");
			break;
		}
		ent.close();
	}

}






