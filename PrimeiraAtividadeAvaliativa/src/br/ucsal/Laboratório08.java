package br.ucsal;

import java.util.Scanner;

public class Laborat�rio08 {
	/* PROBLEMA: a partir de qualquer m�s de qualquer ano informado pelo usu�rio (apenas esses dois dados), o algoritmo dever� 
	 * informar quantos dias tem o m�s do respetivo ano informado. Considere o m�s de FEV tendo 28 ou 29 dias, com base no ano bissexto.
Exemplos:
1� exemplo) O usu�rio informa ano 1979 e o m�s "JAN", o algoritmo dever� retornar 31 dias;
2� exemplo) O usu�rio informa ano 2016 e o m�s "ABR", o algoritmo dever� retornar 30 dias;
3� exemplo) O usu�rio informa ano 1992 e o m�s "FEV", o algoritmo dever� retornar 29 dias;
4� exemplo) O usu�rio informa ano 2005 e o m�s "FEV", o algoritmo dever� retornar 28 dias.

Regras:

1) Para obter a informa��o se o ano � bissexto ou n�o: ((o ano deve ser ao mesmo tempo divis�vel por 4 e n�o ser divis�vel por 100) 
ou (o ano deve ser divis�vel por 400)).
Fonte: https://pt.wikipedia.org/wiki/Ano_bissexto

2) O ano deve ser informado com o valor inteiro e o m�s deve ser informado com as tr�s primeiras letras do m�s.

3) Na solu��o deve-se utilizar obrigatoriamente as estruturas do java: sele��o (switcht) e decis�o (if).
	 */

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);

		System.out.println("Informe as tr�s primeiras letras de um m�s e depois o ano desejado.");
		System.out.print("M�s: ");
		String mes = ent.next().toUpperCase();
		System.out.print("Ano: ");
		int ano = ent.nextInt();

		switch (mes) {
		case "JAN": case "MAR": case "MAI": case "JUL": case "AGO": case "OUT": case "DEZ":;

		System.out.println("O m�s de " + mes + " no ano de " + ano + " possui 31 dias.");
		break;

		case "ABR": case "JUN": case "SET": case "NOV":;

		System.out.println("O m�s de " + mes + " no ano de " + ano + " possui 30 dias.");

		break;

		case "FEV":;

		if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
			System.out.println("O m�s de " + mes + " no ano de " + ano + " possui 29 dias.");


		} else {
			System.out.println("O m�s de " + mes + " no ano de " + ano + " possui 28 dias.");
		}
		break;


		default:
			System.out.println("Voce informou um m�s ou ano incorretamente. Digite apenas 3 letras do m�s desejado ou 4 n�meros inteiros para o ano desejado.");
			break;
		}
		ent.close();
	}

}






