package br.ucsal;

import java.util.Scanner;

public class Laborat�rio16 {
	/*a partir da data de nascimento informada pelo usu�rio dia, m�s e ano apresente uma solu��o para informar
	 *  a idade do usu�rio.*/
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int dia, mes, ano, resultado, diaatual, mesatual, anoatual;
		System.out.println("Digite o dia atual: ");
		diaatual = ent.nextInt();
		System.out.println("Digite o mes atual: ");
		mesatual = ent.nextInt();
		System.out.println("Digite o ano atual: ");
		anoatual = ent.nextInt();
		System.out.println("Digite o dia de seu nascimento");
		dia = ent.nextInt();
		System.out.println("Digite o mes de seu nascimento");
		mes = ent.nextInt();
		System.out.println("Digite o ano de seu nascimento");
		ano = ent.nextInt();

		if(mes > mesatual) {
			resultado = anoatual - 1 - ano;
		}else if (mes == mesatual && dia > diaatual) {
			resultado = anoatual - 1 - ano;
		}else {
			resultado = (anoatual - ano);
		}

		System.out.println("Sua idade � = " + resultado + " anos");

		ent.close();

	}

}